import { Productlist as ProductList } from "./component/home/Productlist"
import { SignUp } from "./component/signup/signup"
import { Signin } from "../src_10_05/component/signin/index.jsx"
import { Layout } from "./component/layout/layout.jsx"

export const Routes = [
    {
        path: "/",
        element: <Layout></Layout>,
        //creating  children as props for single route
        children: [
            {
                path: "/",
                element: <ProductList></ProductList>
            },
            {
                path: "/signup",
                element: <SignUp></SignUp>
            },
            {
                path: "/signin",
                element: <Signin></Signin>
            }
        ]
    },
]