import { useRef } from "react"
import "../../../node_modules/bootstrap/dist/css/bootstrap.min.css"
import { PageTitle } from "../elements/pageTitle";
export function Signin() {
    const emailRef = useRef(null);
    const passwordRef = useRef(null);

    const Signuphandler = () => {
        // console.log("event = ", event);
        event.preventDefault();
        var formdetails = {
            email: emailRef.current.value,
            password: passwordRef.current.value
        }
        console.log(formdetails);
        
    }

    return <div className="container">
        <PageTitle title1="Sign In"></PageTitle>
        <form className="row g-3">
            <div className="col-15">
                <label htmlFor={"inputemail4"} className="form-label">Email</label>
                <input type="email" className="form-control" id="inputemail4" placeholder="abc@gmail.com" ref={emailRef}></input>
            </div>
            <div className="col-md-16">
                <label htmlFor={"password"} className="form-label">Password</label>
                <input type="password" className="form-control" id="password" ref={passwordRef}></input>
            </div>
            <div className="col-12">
                <button type="submit" className="btn btn-primary" onClick={Signuphandler}>Submit</button>
            </div>
        </form>
    </div>
}