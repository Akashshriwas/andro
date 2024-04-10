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
        View Connected devices
      </button>
      {loading && <p className="loading">Loading...</p>}
      <div className="button-container">
        {commands.map((command, index) => (
          <button key={index} onClick={() => handleCommandClick(command)}>
            {getCommandLabel(command)}
          </button>
        ))}
      </div>
      <div className="output-container">
        {output && <p className="output">Output: {output}</p>}
      </div>
    </div>
  );
}

function getCommandLabel(command) {
  switch (command) {
    case "adb shell":
      return "Shell";
    case "adb install <path_to_apk>":
      return "Install APK";
    case "adb uninstall <package_name>":
      return "Uninstall Package";
    case "adb push <local_path> <remote_path>":
      return "Push File";
    case "adb pull <remote_path> <local_path>":
      return "Pull File";
    case "adb reboot":
      return "Reboot";
    case "adb shell dumpsys battery":
      return "Dump Battery";
    case "adb shell pm list packages":
      return "List Packages";
    case "adb shell wm size":
      return "Window Size";
    case "adb shell getprop":
      return "Get Properties";
    case "adb shell df":
      return "Disk Free";
    case "adb shell top":
      return "Top Processes";
    case "adb shell ip address show":
      return "Show IP Address";
    case "adb shell dumpsys sensorservice":
      return "Dump Sensors";
    default:
      return command;
  }
}

export default Adb;
