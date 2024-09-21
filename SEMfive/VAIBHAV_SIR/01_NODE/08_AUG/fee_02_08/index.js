function render_prod() {
    // var productlistfromserver = [//array of list
    // ]
    let productlistfromserver = [];

    function fetchproductlist() {
        console.log("fetching product list");
        productlistfromserver = productlist;
        make_prod_table();
    }

    function make_prod_table() {
        console.log("initialising the make prod");
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
        for (let i = 0; i < productlistfromserver?.length; i++) {
            rows = rows + `
                <tr>
                    <td>${i + 1}</td>
                    <td>${productlistfromserver[i].name}</td>
                    <td>${productlistfromserver[i].description}</td>
                    <td>${productlistfromserver[i].price}</td>
                </tr>
                `
        }
        return rows;
    }


    function get_productlisthtml_usingmap() {
        if (productlistfromserver?.length == 0) {
            return `loading data`
        }
        var rows = productlistfromserver?.map((i, index) => {
            return `<tr>
            <td>${index + 1}</td>
            <td>${i.name}</td>
            <td>${i.description}</td>
            <td>${i.price}</td>
        </tr>`
        })
        return rows.join("");
    }


    // init();
    make_prod_table();
    setTimeout(fetchproductlist, 2000)//only pass the function not call the function
}

render_prod();

// function render_prod() {
//     var productlistfromserver = [//array of list
//     ]

//     function fetchproductlist() {
//         console.log("fetching product list");
//         productlistfromserver = productlist;
//         make_prod_table();
//     }

//     function make_prod_table() {
//         console.log("initialising the make prod");
//         document.getElementById("product_menu").innerHTML =
//             `<table>
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
//             </tbody>
//         </table>`
//     }

//     function get_productlisthtml() {//to put data in table
//         var rows = "";
//         for (let i = 0; i < productlistfromserver?.length; i++) {
//             rows = rows + `
//                 <tr>
//                     <td>${i + 1}</td>
//                     <td>${productlistfromserver[i].name}</td>
//                     <td>${productlistfromserver[i].description}</td>
//                     <td>${productlistfromserver[i].price}</td>
//                 </tr>
//                 `
//         }
//         return rows;
//     }


//     function get_productlisthtml_usingmap() {
//         if (productlistfromserver?.length == 0) {
//             return `loading data`
//         }
//         var rows = productlistfromserver?.map((i, index) => {
//             return `<tr>
//             <td>${index + 1}</td>
//             <td>${i.name}</td>
//             <td>${i.description}</td>
//             <td>${i.price}</td>
//         </tr>`
//         })
//         return rows.join("");
//     }


//     // init();
//     make_prod_table();
//     fetchproductlist();//only pass the function not call the function
//     // let productlistfromserver??;
// }

// render_prod();
