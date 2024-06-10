const Pool = require("pg").Pool;

const pool = new Pool({
  user: "postgres",
  password: "sql_andro",
  host: "localhost",
  port: 5432,
  database: "androtest",
});

module.exports = pool;
