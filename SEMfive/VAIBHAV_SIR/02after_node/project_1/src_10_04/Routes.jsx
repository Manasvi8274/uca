import { Productlist as ProductList } from "./component/home/Productlist"
import { SignUp } from "./component/signup/signup"
import { Signin } from "./component/signup/signin"

export const Routes = [{
    path: "/",
    element: <ProductList></ProductList>
},
{
    path: "/signup",
    element: <SignUp></SignUp>
},
{
    path: "signin",
    element: <Signin></Signin>
}
]