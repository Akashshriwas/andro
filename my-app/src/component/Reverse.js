import React, { useState } from "react";
import "./DynamicToolPage.css";
import Instruction from "./Instruction.js";

const Reverse = () => {
  const [selectedTool, setSelectedTool] = useState("");
  const [apkFile, setApkFile] = useState(null);
  const [report, setReport] = useState("");
  const [loading, setLoading] = useState(false);

  const handleToolChange = (event) => {
    setSelectedTool(event.target.value);
  };

  const handleFileChange = (event) => {
    setApkFile(event.target.files[0]);
  };

  const handleRun = () => {
    if (!selectedTool || !apkFile) return; // Ensure a tool is selected and an APK file is uploaded
    setLoading(true);

    const formData = new FormData();
    formData.append("apkFile", apkFile);

    // Make API call to backend to execute the selected tool with the uploaded APK file
    fetch(`/api/${selectedTool}/run`, {
      method: "POST",
      body: formData,
    })
      .then((response) => response.json())
      .then((data) => {
        setReport(data.report);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error running tool:", error);
        setLoading(false);
        // Handle error
      });
  };

  return (
    <div className="page-container">
      <Instruction />
      <h2>Select a Reverse Tool</h2>
      <select
        className="tool-select"
        value={selectedTool}
        onChange={handleToolChange}
      >
        <option value="">Select a tool</option>
        <option value="apktool">Apk Tool</option>
        <option value="Frida">Frida</option>
        <option value="Hackode">Hackode</option>
        <option value="d2j-dex2jar">d2j-dex2jar</option>
        <option value="JD-GUI">JD-GUI</option>
        {/* Add other tool options here */}
      </select>
      <h2>Upload an APK File</h2>
      <input type="file" accept=".apk" onChange={handleFileChange} />
      {selectedTool && apkFile && (
        <div className="tool-info">
          <h3>Selected Tool: {selectedTool}</h3>
          <h3>Uploaded APK File: {apkFile.name}</h3>
          <button onClick={handleRun} disabled={loading}>
            {loading ? "Running..." : "Run"}
          </button>
          {report && (
            <div className="report">
              <h4>Report:</h4>
              <pre>{report}</pre>
            </div>
          )}
        </div>
      )}
    </div>
  );
};

export default Reverse;
