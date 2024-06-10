import React, { useState, useEffect } from "react";
import axios from "axios";
import ReportsectionD from "./ReportsectionD";
import temp from "../temp.json";
import Toolinfo from "./Toolinfo";

const FileRetrieve = () => {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [showTable, setShowTable] = useState(false);
  const [fileContent, setFileContent] = useState("");
  const [toolName, setToolName] = useState("");
  const [reportSection, setReportSection] = useState([]);
  const [expandedSection, setExpandedSection] = useState([]);
  const [reportContent, setReportContent] = useState("");
  const [selectedDropdownItem, setSelectedDropdownItem] = useState("");
  const [toolInfo, setToolInfo] = useState("");

  const generateSectionsForAndrowarn = (reportContent) => {
    const sectionDelimiter = "[+]";
    const subSectionDelimiter = "[.]";
    const sections = reportContent.split(sectionDelimiter);
    const parsedSections = [];

    for (let i = 1; i < sections.length; i++) {
      const sectionContent = sections[i].trim();
      const subSections = sectionContent
        .split(subSectionDelimiter)
        .map((subsection) => {
          const lines = subsection.split("\n").map((line) => line.trim());
          return { title: lines[0], content: lines.slice(1).join("\n") };
        });

      if (subSections.length > 1) {
        const title = subSections[0].title;
        const subSectionsArray = subSections.slice(1);
        parsedSections.push({ title, subSections: subSectionsArray });
      } else {
        parsedSections.push({ title: sectionContent.trim(), subSections: [] });
      }
    }

    return parsedSections;
  };

  const generateSectionsForAndrobugs = (reportContent) => {
    const markers = ["[Critical]", "[Warning]", "[Notice]", "[Info]"];
    const parsedSections = [];

    markers.forEach((marker) => {
      const startIndex = reportContent.indexOf(marker);
      if (startIndex !== -1) {
        const endIndex = markers[markers.indexOf(marker) + 1]
          ? reportContent.indexOf(
              markers[markers.indexOf(marker) + 1],
              startIndex
            )
          : reportContent.length;

        let sectionContent = reportContent
          .substring(startIndex + marker.length, endIndex)
          .trim();
        let subsections = [];

        if (
          !sectionContent.match(
            /<([^>]+)>\s*([\s\S]*?)(?=(?:<[^>]+>)|\[Critical\]|\[Warning\]|\[Notice\]|\[Info\]|$)/
          )
        ) {
          let l = temp.filter((t) => {
            if (t[0] === marker && t[1] === sectionContent) return t;
          });
          let cwe = l.length > 0 ? l[0][2] : undefined;
          subsections.push({
            title: sectionContent,
            content: sectionContent,
            cwe,
          });
        } else {
          const subSectionRegex =
            /<([^>]+)>\s*([\s\S]*?)(?=(?:<[^>]+>)|\[Critical\]|\[Warning\]|\[Notice\]|\[Info\]|$)/g;

          let matches;
          while ((matches = subSectionRegex.exec(sectionContent)) !== null) {
            const [, title, content] = matches;
            const endOfDescription =
              content.indexOf(":") + 1 || content.indexOf("\n") + 1;
            const briefDescription = content
              .substring(0, endOfDescription)
              .trim();

            const formattedTitle = "<" + title + "> " + briefDescription;
            const mainContent = content.substring(endOfDescription).trim();
            let l = temp.filter((t) => {
              if (t[0] === marker && t[1] === content) return t;
            });
            let cwe = l.length > 0 ? l[0][2] : undefined;
            subsections.push({
              title: formattedTitle,
              content: mainContent,
              cwe,
            });
          }
        }
        parsedSections.push({
          title: marker.replace("[", "").replace("]", ""),
          subSections: subsections,
        });
      }
    });

    return parsedSections;
  };

  const generateSectionsForqark = (reportContent) => {
    const totalObj = reportContent.length;
    const sections = new Set(["WARNING", "CRITICAL", "INFO"]);
    const sectionName = {
      WARNING: new Set(),
      CRITICAL: new Set(),
      INFO: new Set(),
    };
    let parsedSections = [];
    let usedSections = new Set();
    for (let i = 0; i < totalObj; i++) {
      const obj = reportContent[i];
      const { name, description, severity } = obj;
      if (!sections.has(severity)) continue;
      if (usedSections.has(severity)) {
        parsedSections = parsedSections.filter((section) => {
          if (severity === section.title) {
            if (sectionName[severity].has(name)) return section;
            sectionName[severity].add(name);
            let temp = section;
            temp.subSections.push({ title: name, content: description });
            return temp;
          } else {
            return section;
          }
        });
      } else {
        parsedSections.push({
          title: severity,
          subSections: [{ title: name, content: description }],
        });
        sectionName[severity].add(name);
        usedSections.add(severity);
      }
    }
    return parsedSections;
  };

  const generateSectionsForApkLeaks = (reportContent) => {
    let parsedSections = [];
    // Add the logic for parsing APKLeaks report content
    return parsedSections;
  };

  const generateSections = (reportContent) => {
    console.log("vdgdgdgdvd ------------------------------ :", reportContent);
    let parsedSections = [];

    if (toolName === "Androwarn") {
      parsedSections = generateSectionsForAndrowarn(reportContent);
    } else if (toolName === "Androbugs") {
      parsedSections = generateSectionsForAndrobugs(reportContent);
    } else if (toolName === "qark") {
      parsedSections = generateSectionsForqark(reportContent);
    } else if (toolName === "APKLeaks") {
      parsedSections = generateSectionsForApkLeaks(reportContent);
    }

    setReportSection(parsedSections);
    setExpandedSection(new Array(parsedSections.length).fill(false));
  };

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get("http://localhost:4000/retrive");
        setData(response.data);
        setLoading(false);
      } catch (err) {
        setError(err);
        setLoading(false);
      }
    };

    fetchData();
  }, []);

  const handleClick = () => {
    setShowTable(true);
  };

  useEffect(() => {
    if (fileContent) {
      generateSections(fileContent);
    }
  }, [fileContent]);

  const handleApkInfoClick = async (tool, apkName, reportLocation) => {
    setToolName(tool);
    setSelectedDropdownItem(tool);
    setReportSection([]);
    setReportContent("");
    setExpandedSection([]);
    try {
      const response = await axios.get("http://localhost:4000/readfile", {
        params: { path: reportLocation },
      });

      setFileContent(response.data);
    } catch (err) {
      console.error("Error fetching file content:", err);
      alert("Failed to retrieve file content.");
    }
  };

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error.message}</div>;

  return (
    <div
      className="database-table"
      style={{
        margin: "25px",
      }}
    >
      {
        <table style={styles.table}>
          <thead>
            <tr>
              {data.length > 0 &&
                Object.keys(data[0])
                  .filter((key) => key !== "reportlocation")
                  .map((key) => (
                    <th key={key} style={styles.th}>
                      {key}
                    </th>
                  ))}
              <th style={styles.th}>Actions</th>
            </tr>
          </thead>
          <tbody>
            {data.map((item, index) => (
              <tr key={index}>
                {Object.entries(item)
                  .filter(([key]) => key !== "reportlocation")
                  .map(([key, value], idx) => (
                    <td key={idx} style={styles.td}>
                      {value}
                    </td>
                  ))}
                <td style={styles.td}>
                  <button
                    onClick={() => {
                      handleApkInfoClick(
                        item.toolname,
                        item.apkname,
                        item.reportlocation
                      );
                    }}
                  >
                    Show APK Info
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      }
      <ReportsectionD
        reportsections={reportSection}
        expandedSections={expandedSection}
        setExpandedSections={setExpandedSection}
      />
    </div>
  );
};

const styles = {
  table: {
    width: "100%",
    borderCollapse: "collapse",
    marginTop: "20px",
    marginBottom: "30px",
  },
  th: {
    border: "1px solid black",
    padding: "8px",
    textAlign: "left",
    backgroundColor: "#f2f2f2",
  },
  td: {
    border: "1px solid black",
    padding: "8px",
    textAlign: "left",
  },
  pre: {
    backgroundColor: "#f2f2f2",
    padding: "10px",
    border: "1px solid #ccc",
  },
};

export default FileRetrieve;
