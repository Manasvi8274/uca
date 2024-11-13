/* eslint-disable react/prop-types */
import { Outlet } from "react-router-dom"
import { aheader as AHeader } from "../../aheader"
// import { Productlist as ProductList } from "../home/Productlist"

export function Layout() {
    return <>
        <header>
            <AHeader />
        </header>
        <main style={{ padding: "10px 0px" , marginTop:"10px"}}>
            <div style={{ padding: "10px 0px" }} className="row">
                <div className="col">
                    <   Outlet />
                </div>
            </div>
        </main>
        <footer></footer>
    </>
}