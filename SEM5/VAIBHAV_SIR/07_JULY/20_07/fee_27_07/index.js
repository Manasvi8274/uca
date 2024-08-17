// // function init() {
// //     document.getElementById('jsworld').innerHTML = "Hello World From JS";
// // }

// var productlist = [//array of list
//     ]

// function fetchproductlist(){
//     productlist = [//array of list
//         { name: "DISH1", description: "tasty", price: "100" },
//         { name: "steak", description: "very tasty", price: "200" }

//     ]
// }

// function make_prod() {
//     var x = new Date();
//     document.getElementById("product_menu").innerHTML = 
//         `<table>
//             <thead>
//                 <tr>
//                     <th>Sr.No</th>
//                     <th>Product Name</th>
//                     <th>Details</th>
//                     <th>Price</th>
//                 </tr>
//             </thead>
//             <tbody>
//                 ${get_productlisthtml_usingmap()}
//                 ${get_productlisthtml()}
//             </tbody>
//         </table>`
// }

// function get_productlisthtml() {//to put data in table
//     var rows = "";
//     for (let i = 0; i < productlist.length; i++) {
//         rows = rows + `
//                 <tr>
//                     <td>${i + 1}</td>
//                     <td>${productlist[i].name}</td>
//                     <td>${productlist[i].description}</td>
//                     <td>${productlist[i].price}</td>
//                 </tr>
//                 `
//     }
//     return rows;
// }


// function get_productlisthtml_usingmap() {
//     var rows = productlist.map((i, index) => {
//         return `<tr>
//             <td>${index + 1}</td>
//             <td>${i.name}</td>
//             <td>${i.description}</td>
//             <td>${i.price}</td>
//         </tr>`
//     })
//     return rows
// }


// // init();
// fetchproductlist();
// make_prod();

// function init() {
//     document.getElementById('jsworld').innerHTML = "Hello World From JS";
// }

var productlist = [//array of list
]

function fetchproductlist() {
    console.log("fetching product list");
    productlist = [//array of list
        { name: "DISH1", description: "tasty", price: "100" },
        { name: "steak", description: "very tasty", price: "200" }

    ]
    make_prod();
}

function make_prod() {
    console.log("initialising the make prod");
    var x = new Date();
    document.getElementById("product_menu").innerHTML =
        `<table>
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Product Name</th>
                    <th>Details</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                ${get_productlisthtml_usingmap()}
            </tbody>
        </table>`
}

function get_productlisthtml() {//to put data in table
    var rows = "";
    for (let i = 0; i < productlist.length; i++) {
        rows = rows + `
                <tr>
                    <td>${i + 1}</td>
                    <td>${productlist[i].name}</td>
                    <td>${productlist[i].description}</td>
                    <td>${productlist[i].price}</td>
                </tr>
                `
    }
    return rows;
}


function get_productlisthtml_usingmap() {
    if (productlist.length == 0) {
        return `loading data`
    }
    var rows = productlist.map((i, index) => {
        return `<tr>
            <td>${index + 1}</td>
            <td>${i.name}</td>
            <td>${i.description}</td>
            <td>${i.price}</td>
        </tr>`
    })
    return rows.join("")
}


// init();
make_prod();
setTimeout(fetchproductlist, 5000);//only pass the function not call the function