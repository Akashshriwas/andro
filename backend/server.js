const fs = require("fs");
const path = require("path");
const express = require("express");
const multer = require("multer");
const { exec } = require("child_process");
const AdmZip = require("adm-zip");

const router = express.Router();
const upload = multer({ dest: "uploads/" });

router.post("/apktool/run", upload.single("apkFile"), (req, res) => {
  console.log("--------------------------------");
  console.log(req.file);
  const apkFilePath = req.file.path;

  if (!apkFilePath) {
    return res.status(400).json({ error: "No APK file uploaded" });
  }

  exec(`apktool d ${apkFilePath}`, (error, stdout, stderr) => {
    if (error) {
      console.error("Error running apktool:", error);
      return res.status(500).json({ error: "Error running apktool" });
    }

    const outputName = stdout
      .split("\n")
      .find((line) => line.startsWith("I: Using Apktool"))
      .split(" ")[5];
    const outputPath = outputName + ".out";
    if (!outputPath) {
      console.error("Error extracting output path");
      return res.status(500).json({ error: "Error extracting output path" });
    }
    console.log("output path : ", outputPath);
    const reportFolder = path.join(__dirname, outputPath);
    const reportZip = `${outputName}.zip`;
    console.log(`reportFolder :${reportFolder}`);
    const zipPath = path.join(__dirname, reportZip);

    const zip = new AdmZip();
    zip.addLocalFolder(reportFolder);
    zip.writeZip(zipPath);
    console.log("Full path : ", zipPath);

    if (fs.existsSync(zipPath)) {
      console.log("in if block");
      res.setHeader("Content-Type", "application/zip");
      res.setHeader(
        "Content-Disposition",
        'attachment; filename="downloaded_file.zip"'
      );

      const fileStream = fs.createReadStream(zipPath);
      fileStream.pipe(res);
    } else {
      console.log("in else block");
      res.status(404).json({ error: "File not found" });
    }
  });
});

router.post("/jd-gui/run", (req, res) => {
  exec("jadx-gui", (error, stdout, stderr) => {
    if (error) {
      console.error("Error running JD-GUI:", error);
      return res.status(500).json({ error: "Error running JD-GUI" });
    }

    console.log("JD-GUI launched successfully");
    res.status(200).json({ message: "JD-GUI launched successfully" });
  });
});

router.post("/d2j-dex2jar/run", upload.single("apkFile"), (req, res) => {
  console.log("--------------------------------");
  console.log(req.file);
  const apkFilePath = req.file.path;

  if (!apkFilePath) {
    return res.status(400).json({ error: "No APK file uploaded" });
  }

  const outputJar = path.join(__dirname, "output.jar");

  exec(`d2j-dex2jar ${apkFilePath} -o ${outputJar}`, (error, stdout, stderr) => {
    if (error) {
      console.error("Error running d2j-dex2jar:", error);
      return res.status(500).json({ error: "Error running d2j-dex2jar" });
    }

    console.log("Output JAR path : ", outputJar);

    if (fs.existsSync(outputJar)) {
      res.setHeader("Content-Type", "application/java-archive");
      res.setHeader(
        "Content-Disposition",
        'attachment; filename="output.jar"'
      );

      const fileStream = fs.createReadStream(outputJar);
      fileStream.pipe(res);
    } else {
      res.status(404).json({ error: "File not found" });
    }
  });
});

module.exports = router;
