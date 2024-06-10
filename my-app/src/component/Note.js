import React, { useState, useEffect } from "react";
import axios from "axios";
// import './action.css';
import "animate.css";
// import { Accordion, Card, Button } from 'react-bootstrap';
import "bootstrap/dist/css/bootstrap.min.css"; // Import Bootstrap CSS
import cwedata from "../cwe_final.json";
import temp from "../temp.json";
// import Stepbyguide from './Stepbyguide';
import Dropdown from "./Dropdown";
import Toolinfo from "./Toolinfo";
import Reportsection from "./Reportsection";
import Apkselection from "./Apkselection";
import "./Note.css";
// import Dropdownr from "./Dropdownr";

export default function Note() {
  const [apkFileName, setApkFileName] = useState("");
  const [selectedItem, setSelectedItem] = useState("");
  const [result, setResult] = useState("");
  const [isRunning, setIsRunning] = useState(false);
  const [toolInfo, setToolInfo] = useState("");
  const [reportFilePath, setReportFilePath] = useState("");
  const [apkInfo, setApkInfo] = useState(null); // State to store APK information
  const [reportContent, setReportContent] = useState("");
  const [reportSections, setReportSections] = useState([]);
  const [expandedSections, setExpandedSections] = useState([true]);
  const [selectedApks, setSelectedApks] = useState([]);
  const [selectedDropdownItem, setSelectedDropdownItem] = useState("");
  const [selectedApk, setSelectedApk] = useState(null);

  // const [reportAlreadyCached, setReportAlreadyCached] = useState(false);
  // const [apkUploaded, setApkUploaded] = useState(false);

  const handleItemClick = (item) => {
    setSelectedItem(item);
    setSelectedDropdownItem(item);
    setToolInfo(getToolInfo(item));
    setReportSections([]);
    setReportContent("");

    // console.log("x::::::::::::::: ", item);
    // console.log("y::::::::::::::: ", selectedItem);

    setExpandedSections((prevExpandedSections) => {
      const resetExpandedSections = prevExpandedSections.map(() => false);
      resetExpandedSections[0] = true; // Expand the first section
      return resetExpandedSections;
    });

    if (item === "Androwarn") {
      setToolInfo(
        <>
          <h3>Androwarn</h3>
          <p>
            Androwarn is an open-source static code analyzer designed
            specifically for detecting and assessing the security risks in
            Android applications. It is commonly used by security researchers,
            application developers, and penetration testers to identify
            potential vulnerabilities and weaknesses in Android apps.
          </p>
          <p>Key Features:</p>
          <ul>
            <li>Detects insecure data storage</li>
            <li>Identifies permission misuse</li>
            <li>Finds potential component exposure</li>
            <li>Identifies other security vulnerabilities</li>
          </ul>
        </>
      );
    } else if (item === "Androbugs") {
      setToolInfo(
        <>
          <h3>AndroBugs</h3>
          <p>
            AndroBugs uses static analysis techniques to inspect an Android
            app's code and identify issues such as insecure data storage,
            permissions misuse, component exposure, and other security
            vulnerabilities. By identifying these weaknesses, developers can
            take appropriate measures to secure their applications and protect
            user data.
          </p>
          <p>Key Features:</p>
          <ul>
            <li>Detects insecure data storage</li>
            <li>Identifies permission misuse</li>
            <li>Finds potential component exposure</li>
            <li>Identifies other security vulnerabilities</li>
          </ul>
        </>
      );
    } else if (item === "qark") {
      setToolInfo(
        <>
          <h3>QARK (Quick Android Review Kit)</h3>
          <p>
            QARK is an open-source tool designed to perform security testing of
            Android applications. It helps identify potential vulnerabilities
            and security issues in Android apps, allowing developers to address
            them before deployment.
          </p>
          <p>Key Features:</p>
          <ul>
            <li>Identifies common security vulnerabilities</li>
            <li>Checks for insecure data storage</li>
            <li>Detects permission issues</li>
            <li>Generates detailed security reports</li>
          </ul>
        </>
      );
    } else {
      setToolInfo("");
    }
  };

  // ################ on change function for choose file button #######################
  const handleApkSelection = async (event) => {
    console.log(
      "--------------- Running handleApkd selection method ------------------"
    );
    const choosedFile = event.target.files[0];
    setApkFileName(choosedFile.name);
    console.log("apk selected in handle apk selection:", choosedFile);
    console.log(choosedFile.name);
    console.log("selected apks : ", selectedApks);
    if (choosedFile) {
      console.log("prev apks:", selectedApks);
      const nameOfSelectedApk = choosedFile.name;
      let temp = selectedApks.filter((apk) => {
        return apk.name == nameOfSelectedApk;
      });
      if (temp.length > 0) {
        console.log("File already uploaded");
        const userChoice = window.confirm(
          "Duplicate files, wanna update the existing file?"
        );
        if (!userChoice) {
          return;
        }
        handleApkDelete(temp[0]);
        // let copyAPK = selectedApk;
        // copyAPK.name = userChoice
        // return;
      }
      const formData = new FormData();
      formData.append("apkFile", choosedFile);

      try {
        const response = await axios.post(
          "http://localhost:4000/upload-apk",
          formData,
          {
            headers: {
              "Content-Type": "multipart/form-data",
            },
          }
        );
        console.log(
          "File uploaded successfully in the server :",
          response.data
        );
        const apkInfo = response.data.apkInfo;
        const pre = "uploads\\";
        let fileServerName = apkInfo.filePath;
        fileServerName = fileServerName.slice(
          fileServerName.indexOf(pre) + pre.length
        );

        console.log("APK Info:", apkInfo);
        if (selectedApks.length >= 10) {
          // Show an alert
          alert(
            "You have reached the limit of 10 selected APKs. Delete some APKs to add more."
          );

          // return prevSelectedApks; // Return the existing array without changes
          // } else if (!apkAlreadySelected) {
          //   return [...prevSelectedApks, selectedApk];
          // } else {
          //   console.log('APK with the same name already selected.');
          //   return prevSelectedApks; // Return the existing array without changes
          // }
        } else {
          choosedFile["fileServerName"] = fileServerName;
          choosedFile["packageName"] = apkInfo.packageName;
          choosedFile["versionName"] = apkInfo.versionName;
          choosedFile.filePath = apkInfo.filePath;
          choosedFile.permissions = apkInfo.permissions;
          // console.log('After adding server response : ', choosedFile)
          // setApkInfo(selectedApk);
          setSelectedApk(choosedFile);
          const temp = [...selectedApks, choosedFile];
          // console.log('temp : ', temp)
          setSelectedDropdownItem(choosedFile);
          setSelectedApks((prev) => [...prev, choosedFile]);
        }
      } catch (error) {
        console.error("Error uploading file:", error);
      }
      // setSelectedDropdownItem(apkSelected);
      // Check if the APK with the same name is already selected
      // const apkAlreadySelected = prevSelectedApks.some((apk) => apk.name === selectedApk.name);
    }
  };

  const handleApkDelete = async (apkToDelete) => {
    try {
      // console.log('deleting apk : ', apkToDelete)
      // Check if the APK object is missing or doesn't have necessary properties
      if (!apkToDelete) {
        console.error("Invalid APK object:", apkToDelete);
        return;
      }

      // Send a delete request to the backend
      const response = await axios.post("http://localhost:4000/delete-apk", {
        apkIdentifier: apkToDelete.fileServerName,
      });
      if (response.success == false) {
        alert("Error while deleting file");
        return;
      }

      // console.log('Deleted APK:', apkToDelete.name);
      // console.log('Response from delete:', response.data);
      const updatedList = selectedApks.filter(
        (apk) => apk.name != apkToDelete.name
      );
      if (selectedApk.name == apkToDelete) {
        setSelectedApk(null);
      }
      setSelectedApks(updatedList);
      // Update the list of selected APKs here if needed
    } catch (error) {
      console.error("Error deleting APK:", error);
    }
  };

  // ############################## Changing dropdown item ##############################
  const handleDropdownSelection = async (event) => {
    console.log(
      "--------------- Running handle dropdown selection method ------------------"
    );
    // console.log('Dropdown value changed !!!!!!!!!!!!')
    const selectedApkIndex = event.target.selectedIndex - 1;
    console.log("index : ", selectedApkIndex);
    const apkSelected = selectedApks[selectedApkIndex];
    console.log("apk selected : ", apkSelected);
    const name = apkSelected.name;

    // console.log(event.target.selectedIndex)
    // console.log('apk selected in handle dropdown :', selectedApk);

    // to select apk in the main dropdown
    setSelectedApk(apkSelected);
    // setApkInfo(apkInfo);
    // const formData = new FormData();
    // formData.append('apkFile', apkSelected);

    // try {
    //   const response = await axios.post('http://localhost:4000/upload-apk', formData, {
    //     headers: {
    //       'Content-Type': 'multipart/form-data',
    //     },
    //   });
    //   console.log('File uploaded successfully:', response.data);
    //   const apkInfo = response.data.apkInfo;
    //   console.log('APK Info:', apkInfo);
    // } catch (error) {
    //   console.error('Error uploading file:', error);
    // }
    setSelectedDropdownItem(apkSelected);
  };

  const handleDownload = () => {
    const blob = new Blob([result], { type: "text/plain" });

    // Create a temporary URL for the Blob
    const blobUrl = URL.createObjectURL(blob);

    // Create an anchor element
    const link = document.createElement("a");
    link.href = blobUrl;
    link.download = "downloaded_file.txt"; // Specify the filename

    // Programmatically click the link to start the download
    link.click();

    // Clean up the temporary URL and anchor element
    URL.revokeObjectURL(blobUrl);
    link.remove();
  };
  // Assuming you have the reportContent from the server response
  // const reportContent = response.data.reportContent;

  // Store the reportContent in the cache using the selectedDropdownItem.name as the key

  // Function to check if the report is already cached for the selected APK
  // const checkReportCache = () => {
  //   const cachedReport = localStorage.getItem(selectedDropdownItem.name);
  //   return cachedReport !== null;
  // };

  const handleRunClick = () => {
    // console.log(selectedApk)
    if (!selectedApk) {
      console.error("APK file is not uploaded yet.");
      return;
    }

    setIsRunning(true);
    axios
      .post("http://localhost:4000/run-command", {
        tool: selectedItem,
        apkInfo: selectedApk,
        apkName: apkFileName,
      })
      .then((response) => {
        console.log("----------------------");
        console.log("response : ", response.data);
        // console.log(
        //   "afdhghadkghadkghakdghadghakghakghadgh- -----------------------------------------------------------: ",
        //   response
        // );
        console.log("----------------------");
        setResult(response.data || "No result available");

        generateSections(response.data); // Generate sections from the report content
      })
      .catch((error) => {
        console.error(error);
      })
      .finally(() => {
        setIsRunning(false);
      });
    // localStorage.setItem(selectedDropdownItem.name, sampleCachedReport);
  };
  // useEffect(() => {
  //   const cachedReport = localStorage.getItem(selectedDropdownItem.name);

  //   if (cachedReport) {
  //     setReportContent(cachedReport);
  //     setReportSections([]); // Reset sections since they may not match the cached report
  //     setReportAlreadyCached(true);
  //   } else {
  //     setReportContent('');
  //     setReportAlreadyCached(false);
  //   }
  // }, [selectedDropdownItem.name]);

  // const isReportCached = () => {
  //   // Check if there is a cached report for the selected APK
  //   const cachedReport = localStorage.getItem(selectedDropdownItem.name);
  //   return cachedReport !== null;
  // };

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
        // If there are no subSections, treat the entire sectionContent as the title and content
        parsedSections.push({ title: sectionContent.trim(), subSections: [] });
      }
    }

    return parsedSections;
  };
  const generateSectionsForAndrobugs = (reportContent) => {
    // console.log('------------>>>>>>>>>>>>>', reportContent)
    // console.log('temp : ', JSON.stringify(temp))
    // console.log(JSON.stringify(reportContent))

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
        // console.log(JSON.stringify(sectionContent), "\n\n\n\n")
        let subsections = [];

        // console.log('cwe : ', cwe)
        // If there are no <...> patterns, treat the whole section content as a single subsection
        if (
          !sectionContent.match(
            /<([^>]+)>\s*([\s\S]*?)(?=(?:<[^>]+>)|\[Critical\]|\[Warning\]|\[Notice\]|\[Info\]|$)/
          )
        ) {
          let l = temp.filter((t) => {
            if (t[0] == marker && t[1] == sectionContent) return t;
            else if (t[0] == marker) {
              // console.log(marker, '----', t[0], marker==t[0])
              console.log(JSON.stringify(sectionContent));
              // console.log(sectionContent==t[1], JSON.stringify(sectionContent), '\n-----\n', JSON.stringify(t[1]))
            }
          });
          // console.log('l ------->', l)
          let cwe = l.length > 0 ? l[0][2] : undefined;
          subsections.push({
            title: sectionContent,
            content: sectionContent,
            cwe,
          });
          // console.log(JSON.stringify(sectionContent))
        } else {
          // Extract subsections with <>
          // const subSectionRegex = /<([^>]+)>\s*([\s\S]*?)(?=(?:<[^>]+>)|\[Critical\]|\[Warning\]|\[Notice\]|\[Info\]|$)/g;
          const subSectionRegex =
            /<([^>]+)>\s*([\s\S]*?)(?=(?:<[^>]+>)|\[Critical\]|\[Warning\]|\[Notice\]|\[Info\]|$)/g;

          let matches;

          // let matches;

          while ((matches = subSectionRegex.exec(sectionContent)) !== null) {
            const [, title, content] = matches;
            const endOfDescription =
              content.indexOf(":") + 1 || content.indexOf("\n") + 1;
            const briefDescription = content
              .substring(0, endOfDescription)
              .trim();

            const formattedTitle = "<" + title + "> " + briefDescription;
            const mainContent = content.substring(endOfDescription).trim();
            // console.log('matches : ', matches)
            let l = temp.filter((t) => {
              if (t[0] == marker && t[1] == content) return t;
              else if (t[0] == marker) {
                // console.log(marker, '----', t[0], marker==t[0])
                console.log(JSON.stringify(content));
              }
            });
            // console.log('l ------->', l)
            let cwe = l.length > 0 ? l[0][2] : undefined;
            // console.log(title)
            // console.log(mainContent)
            // console.log(cwe)
            // Extracting the initial portion of the content for the title

            // ...
            // console.log(JSON.stringify(content))
            subsections.push({
              title: formattedTitle,
              content: mainContent,
              cwe,
            });
          }
        }
        // console.log('subsections ----------> : ', subsections)

        parsedSections.push({
          title: marker.replace("[", "").replace("]", ""),
          subSections: subsections,
        });
        // console.log(parsedSections)
      }
    });

    return parsedSections;
  };

  const generateSectionsForqark = (reportContent) => {
    // reportContent = JSON.parse(reportContent);
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
          if (severity == section.title) {
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
    console.log("================================");
    console.log(parsedSections);
    console.log("================================");
    return parsedSections;
  };

  const generateSectionsForApkLeaks = (reportContent) => {
    console.log(
      "------------ generate section for tool APKLeaks -------------"
    );
    reportContent = reportContent.slice(reportContent.indexOf("[LinkFinder]"));
    console.log(reportContent);
    let parsedSections = [];
  };

  const generateSections = (reportContent) => {
    let delimiter;
    let titleRegex;
    let parsedSections;

    if (selectedItem === "Androwarn") {
      parsedSections = generateSectionsForAndrowarn(reportContent);
    } else if (selectedItem === "Androbugs") {
      parsedSections = generateSectionsForAndrobugs(reportContent);
    } else if (selectedItem === "qark") {
      parsedSections = generateSectionsForqark(reportContent);
    } else if (selectedItem === "APKLeaks") {
      parsedSections = generateSectionsForApkLeaks(reportContent);
    }
    {
      delimiter = "[+]"; // Default delimiter
      titleRegex = /^(.+)/;
    }

    setReportSections(parsedSections);
    setExpandedSections(new Array(parsedSections.length).fill(false));
    return parsedSections;
  };

  const getToolInfo = () => {};

  return (
    <div className="dropdown-container">
      {/* <Stepbyguide /> */}
      <div className="dropdown-and-toolinfo">
        <Dropdown
          selectedItem={selectedItem}
          handleItemClick={handleItemClick}
          isRunning={isRunning}
        />

        <Toolinfo toolInfo={toolInfo} />
      </div>
      <Apkselection
        selectedApks={selectedApks}
        selectedApk={selectedApk}
        apkInfo={selectedApk}
        handleApkSelection={handleApkSelection}
        handleDropdownSelection={handleDropdownSelection}
        handleRunClick={handleRunClick}
        isRunning={isRunning}
        selectedDropdownItem={selectedDropdownItem}
        handleApkDelete={handleApkDelete}
      />
      {/* <ResultDisplay result={result} isRunning={isRunning} /> */}

      {console.log(
        "Report sections : ------------------------- ",
        reportSections
      )}
      {console.log(
        "Expanded section : ---------------------------",
        expandedSections
      )}
      <Reportsection
        reportsections={reportSections}
        expandedSections={expandedSections}
        setExpandedSections={setExpandedSections}
        handleDownload={handleDownload}
      />
      {/* <ReportContent reportContent={reportContent} /> */}
    </div>
  );
}
