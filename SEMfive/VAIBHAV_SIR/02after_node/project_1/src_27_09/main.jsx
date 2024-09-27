// import { text } from "express";
import { createRoot } from "react-dom/client"
// import { App } from "./App";
import { App } from "./App";
import { aheader as AHeader } from "./aheader";
import { Productlist } from "./Productlist"

// const reactProjectRoot = createRoot(document.getElementById("root"));

// reactProjectRoot.render(
//     <h2>
//         hello world
//     </h2>
// )

// reactProjectRoot.render(
//     <div>
//         <div className="d1">
//             <h2>hello</h2><br />
//         </div>
//         <div className="d2">
//             <h2>world</h2>
//         </div>
//     </div>
// )

const reactProjectRoot = createRoot(document.getElementById("root"));
reactProjectRoot.render(<App />)