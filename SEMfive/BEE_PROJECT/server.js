var express = require("express");
var app = express();

app.use("/", express.static("./fee"));//to start fee vala folder frontend

app.listen(8080);//to make a port for server