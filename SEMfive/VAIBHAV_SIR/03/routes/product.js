import express from "express";
const router = express.Router();

router.get("/products", (req, res) => {
    console.log("The default response object is: ", res.statusCode);
    let fileData = fileSystem.readFileSync("./db.json", { encoding: "utf-8" });

    const products = JSON.parse(fileData)?.products;
    console.log("The products data is: ", products);
    if (products && products.length > 0) {
        res.send(products);
    } else {
        res.status(204);//204 for no data
        res.send();
    }
});

export default router;