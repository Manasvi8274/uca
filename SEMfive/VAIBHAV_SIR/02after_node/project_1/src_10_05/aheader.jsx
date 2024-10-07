import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import { Link } from "react-router-dom"
import { Button } from "./component/elements/button"
export function aheader() { // here props are attributes in header tag
    // console.log(title);
    // return <div>{props.title}</div>;//we have to use interpolation ie {} and bind it into div etc and return can only return one element
    const navigatetoSignup = () => {
        // <Link to={"./signup"}>SignUp</Link>
    }
    const navigatetoSignin = () => {

    }

    return <>
        <nav className="navbar navbar-expand-lg bg-body-tertiary">
            <div className="container-fluid">
                <a className="navbar-brand" href="/">E Comm</a>
                {/* <link to={"/"} className="Navbar-brand">E comm</link> */}
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                        <li className="nav-item">
                            <a className="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">Link</a>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <ul className="dropdown-menu">
                                <li><a className="dropdown-item" href="#">Action</a></li>
                                <li><a className="dropdown-item" href="#">Another action</a></li>
                                <li><hr className="dropdown-divider"></hr></li>
                                <li><a className="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link disabled" aria-disabled="true">Disabled</a>
                        </li>
                    </ul>
                    <Button type="secondary"><Link to={"./signin"}>SignIn</Link></Button>
                    <Button type="primary"><Link to={"./signup"}>SignUp</Link></Button>
                </div>
            </div>
        </nav>
    </>
}