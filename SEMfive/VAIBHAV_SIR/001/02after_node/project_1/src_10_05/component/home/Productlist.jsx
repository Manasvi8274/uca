import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
// import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import "../../../node_modules/bootstrap/dist/css/bootstrap.min.css"
import "./style.css"
//if we use simply with settimeout no output is shown as values comes after page rendering 
export function Productlist() {
    const [productlist, setproductlist] = useState([]);
    const [productDetail, setproductDetail] = useState([]);
    /////// variation 1 - here function is an effect if no dependecy then run every time as no dependency
    // useEffect(()=>{
    //     console.log("Component is re-rendered");
    // },);

    /////// veariation 1 - only at initial render
    // useEffect(() => {
    //     console.log("Component is re-rendered");
    // }, []);

    //////variations 3 - when change in data ie call in setproductdetails , based on dependency update
    useEffect(() => {
        //to make an API/web service  call to fetch data
        //to make an API/web service  call to fetch reviews 
        console.log("Component is re-rendered");
    }, [productlist]);

    useEffect(() => {
        console.log("detail render");
    }, [productDetail]);

    //every time paint/layout effect
    // useLayoutEffect();


    setTimeout(() => {
        setproductlist(
            [
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
                { name: "Product1 name", price: 20.0 },
            ],
        )
        setproductDetail([])
    }, 1000);
    return <div className="tablediv">
        <table>
            <thead>
                <th>Product Name</th>
                <th>Product Price</th>
            </thead>
            <tbody>
                {
                    productlist.map((item, index) => {
                        return (
                            <tr key={index}>
                                <td>{item.name}</td>
                                <td>{item.price}</td>
                            </tr>
                        )
                    })
                }
                <tr>
                </tr>
            </tbody>
        </table>
        <Link to={"./signup"}>SignUp</Link><br />
        <Link to={"./signin"}>SignIn</Link>
    </div>
}

// export default Productlist