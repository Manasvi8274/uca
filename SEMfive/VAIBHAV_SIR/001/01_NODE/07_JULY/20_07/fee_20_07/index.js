function init(){
    document.getElementById('jsworld').innerHTML="Hello World From JS";
}

function make_prod(){
    document.getElementById("product_menu").innerHTML =`<table>
            <h3>LIST</h3>
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Product Name</th>
                    <th>Details</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Dish 1</td>
                    <td>Dish 1 Details</td>
                    <td>150</td>
                </tr>
            </tbody>
        </table>`
}


init();
make_prod();