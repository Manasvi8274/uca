import { useState } from "react";
//if we use simply with settimeout no output is shown as values comes after page rendering 
export function Productlist() {
    let [productlist, setproductlist] = useState([]);
    setTimeout(() => {
        setproductlist(
            productlist = [
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
            ]
        )
    }, 1000);
    return <div>
        <table style={{ border: '2px solid black' }}>
            <thead>
                <th style={{ border: '2px solid black' }}>Product Name</th>
                <th style={{ border: '2px solid black' }}>Product Price</th>
            </thead>
            <tbody>
                {
                    productlist.map((item, index) => {
                        return (
                            <tr key={index}>
                                <td style={{ border: '2px solid black' }}>{item.name}</td>
                                <td style={{ border: '2px solid black' }}>{item.price}</td>
                            </tr>
                        )
                    })
                }
                <tr>
                </tr>
            </tbody>
        </table>
    </div>
}

// export default Productlist