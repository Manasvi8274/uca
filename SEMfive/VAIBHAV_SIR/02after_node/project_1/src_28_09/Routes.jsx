import { Productlist as ProductList } from "./component/home/Productlist"
import { SignUp } from "./component/signup/signup"

export const Routes = [{
    path: "/",
    element: <ProductList></ProductList>
},
{
    path: "/signup",
    element: <SignUp></SignUp>
}]