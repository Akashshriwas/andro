import React, { useState } from "react";
import "./Reverse.css";
import Instruction from "./Instruction.js";
const axios = require("axios");

const Reverse = () => {
  const [selectedTool, setSelectedTool] = useState("");
  const [apkFile, setApkFile] = useState(null);
  const [reportPath, setReportPath] = useState("");
  const [loading, setLoading] = useState(false);
  const [result, setResult] = useState();

  const handleToolChange = (event) => {
    setSelectedTool(event.target.value);
    setApkFile(null);
    setReportPath("");
    setResult(null);
  };

  const handleFileChange = (event) => {
    setApkFile(event.target.files[0]);
  };

  const handleRun = () => {
    if (!selectedTool) return;
    setLoading(true);

    if (selectedTool === "JD-GUI") {
      fetch(`http://localhost:4000/api/jd-gui/run`, {
        method: "POST",
      })
        .then((res) => res.json())
        .then((data) => {
          console.log(data.message);
          setLoading(false);
        })
        .catch((error) => {
          console.error("Error running JD-GUI:", error);
          setLoading(false);
        });
    } else if (apkFile) {
      const formData = new FormData();
      formData.append("apkFile", apkFile);

      fetch(`http://localhost:4000/api/${selectedTool}/run`, {
        method: "POST",
        body: formData,
        responseType: "arraybuffer",
      })
        .then((res) => res.arrayBuffer())
        .then((data) => {
          setResult(data);
          console.log(data);
          setReportPath(true);
          setLoading(false);
        })
        .catch((error) => {
          console.error("Error running tool:", error);
          setLoading(false);
        });
    }
  };

  const handleDownload = () => {
    const blob = new Blob([result], { type: "application/zip" });

    const blobUrl = URL.createObjectURL(blob);

    const link = document.createElement("a");
    link.href = blobUrl;
    link.download = "downloaded_file.zip";

    link.click();

    URL.revokeObjectURL(blobUrl);
    link.remove();
  };

  return (
    <div className="page-containerr">
      <Instruction />
      <h2>Select a Reverse Tool</h2>
      <select
        className="tool-selectt"
        value={selectedTool}
        onChange={handleToolChange}
      >
        <option value="">Select a tool</option>
        <option value="apktool">Apk Tool</option>
        <option value="d2j-dex2jar">d2j-dex2jar</option>
        <option value="JD-GUI">JD-GUI</option>
        <option value="Virtuous Ten studio">Virtuous Ten studio</option>
      </select>
      {selectedTool !== "JD-GUI" && (
        <>
          <h2>Upload an APK File</h2>
          <input type="file" accept=".apk" onChange={handleFileChange} />
        </>
      )}
      {selectedTool && (
        <div className="tool-infoo">
          <h3>Selected Tool: {selectedTool}</h3>
          {apkFile && selectedTool !== "JD-GUI" && <h3>Uploaded APK File: {apkFile.name}</h3>}
          <button onClick={handleRun} disabled={loading}>
            {loading ? "Running..." : "Run"}
          </button>
          {reportPath && selectedTool !== "JD-GUI" && (
            <div className="report">
              <h4>Report:</h4>
              <button onClick={handleDownload}>Download Report</button>
            </div>
          )}
        </div>
      )}
    </div>
  );
};

export default Reverse;
