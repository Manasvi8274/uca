/* eslint-disable react/prop-types */
import { aheader as AHeader } from "../../aheader"
// import { Productlist as ProductList } from "../home/Productlist"

export function Layout({ children }) {
    return <>
        <header>
            <AHeader />
        </header>
        {children}
        <footer></footer>
    </>
}