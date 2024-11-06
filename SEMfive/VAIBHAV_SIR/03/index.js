// const app = require("express")
import express from "express";
import productsRoute from "./routes/products.js"

const app = express();
const port = "8080";

app.use(express.json());
app.use("/products", productsRoute)

app.get("/", (req, res) => {
    // Do some logic here
    res.send("hello world again");
});

app.listen(port, () => {
    console.log("The server is starting on port: ", port);
});


// // const app = require("express")
// import productsrouter from "./routes/product.js";
// import bodyParser from "body-parser";
// import express from "express";
// import fileSystem from "fs";

// const app = express();
// const port = "8080";

// app.use(express.json());//middleware
// app.use("/products", productsrouter);
// app.get("/", (req, res) => {
//     // Do some logic here
//     res.send("hello world again");
// });

// app.get("/products", (req, res) => {
//     console.log("The default response object is: ", res.statusCode);
//     let fileData = fileSystem.readFileSync("./db.json", { encoding: "utf-8" });

//     const products = JSON.parse(fileData)?.products;
//     console.log("The products data is: ", products);
//     if (products && products.length > 0) {
//         res.send(products);
//     } else {
//         res.status(204);//204 for no data
//         res.send();
//     }
// });


// app.post("/products", (req, res) => {
//     const product = req.body;
//     console.log("product = ", product);
//     let db = fileSystem.readFileSync("./db.json", { encoding: "utf-8" });
//     let dbparsed = JSON.parse(db);
//     let currentProduclist = dbparsed;
//     console.log("currentProduclist = ", currentProduclist);
//     let updatedProductList = { ...currentProduclist, "products":product };
//     // let upadatedDBParsed = { ...dbparsed, products: updatedProductList }
//     let updatedb = JSON.stringify(updatedProductList);
//     console.log("new product list = ", updatedb);
//     try {
//         fileSystem.writeFileSync("./db.json", updatedb);
//         res.send("SUCESS");
//     }
//     catch (error) {
//         res.status(500);
//         res.send({
//             message: "PROBLEM IN CONTACTING WITH DB",
//             error: error,
//         });
//     }
// })

// app.listen(port, () => {
//     console.log("The server is starting on port: ", port);
// });
