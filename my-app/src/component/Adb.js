import React, { useState } from "react";

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
    <div>
      <button onClick={handleClick} disabled={loading}>
        Run ADB Command
      </button>
      {loading && <p>Loading...</p>}
      {output && commands.length > 0 && (
        <div>
          <p>Output: {output}</p>
          <p>Available Commands:</p>
          <ul>
            {commands.map((command, index) => (
              <li key={index}>
                <button onClick={() => handleCommandClick(command)}>{command}</button>
              </li>
            ))}
          </ul>
        </div>
      )}
    </div>
  );
}

export default Adb;
