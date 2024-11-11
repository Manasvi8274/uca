// const app = require("express")
import express from "express";
import productsRoute from "./routes/product.js"

const app = express();
const port = "8080";

app.use(express.json());
app.use("*", (req, res, next) => {
    res.setHeader("Access-Control-Allow-Origin", "*");
    next();
});

app.use("/products", productsRoute);


app.get("/", (req, res) => {
    // Do some logic here
    res.send("hello world again");
});

app.listen(port, () => {
    console.log("The server is starting on port: ", port);
});


