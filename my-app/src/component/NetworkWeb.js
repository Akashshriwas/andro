import React, { useState } from 'react';
import './DynamicToolPage.css';
import Instruction from './Instruction.js';
import axios from 'axios'; // Import axios for making HTTP requests

const Reverse = () => {
  const [selectedTool, setSelectedTool] = useState('');
  const [report, setReport] = useState(null);

  const handleToolChange = (event) => {
    setSelectedTool(event.target.value);
  };

  const runTool = () => {
    if (!selectedTool) {
      return; // Do nothing if no tool is selected
    }

    // Send a POST request to the backend to run the selected tool
    axios.post('http://localhost:4000/run-tool', { tool: selectedTool })
      .then(response => {
        // Update the report state with the received report from the backend
        setReport(response.data.report);
      })
      .catch(error => {
        console.error('Error running tool:', error);
        // Handle error, e.g., display an error message to the user
      });
  };

  return (
    <div className="page-container">
      <Instruction/>
      <h2>Select a Network Web Tool</h2>
      <select className="tool-select" value={selectedTool} onChange={handleToolChange}>
        <option value="">Select a tool</option>
        <option value="nmap">nmap</option>
        <option value="BurpSuite">BurpSuite</option>
        <option value="OWASP ZAP">OWASP ZAP</option>
        <option value="bettercap">bettercap</option>
        <option value="Immuniweb">Immuniweb</option>
        <option value="zANTI">zANTI</option>
        <option value="MWR Labs Mercury">MWR Labs Mercury</option>
        <option value="Mallory">Mallory</option>
        {/* <option value="Mallory">Mallory</option> */}
        

        {/* Add more tool options here */}
      </select>
      {selectedTool && (
        <div className="tool-info">
          <h3>Selected Tool: {selectedTool}</h3>
          <button onClick={runTool}>Run {selectedTool}</button>
        </div>
      )}
      {report && (
        <div className="report">
          <h3>Report</h3>
          <pre>{report}</pre>
        </div>
      )}
    </div>
  );
};

export default Reverse;
