import React, { useState } from "react";
import "./Adb.css"; // Import CSS file

function Adb() {
  const [output, setOutput] = useState("");
  const [loading, setLoading] = useState(false);
  const [commands, setCommands] = useState([]);

  const handleClick = async () => {
    setLoading(true);
    try {
      const response = await fetch("http://localhost:4000/run-adb-command");
      const data = await response.json();
      setOutput(data.output);
      setCommands(data.commands);
    } catch (error) {
      console.error("Error:", error);
    }
    setLoading(false);
  };

  const handleCommandClick = async (command) => {
    setLoading(true);
    try {
      const response = await fetch(`http://localhost:4000/execute-adb-command/${command}`);
      const data = await response.json();
      setOutput(data.output);
    } catch (error) {
      console.error("Error:", error);
    }
    setLoading(false);
  };

  return (
    <div className="container1">
      <button onClick={handleClick} disabled={loading}>
        Run ADB Command
      </button>
      {loading && <p className="loading">Loading...</p>}
      <div className="button-container">
        {commands.map((command, index) => (
          <button key={index} onClick={() => handleCommandClick(command)}>
            {command}
          </button>
        ))}
      </div>
      <div className=" adb11">
      {output && <p className="output">Output: {output}</p>}
      </div>
    </div>
  );
}

export default Adb;
