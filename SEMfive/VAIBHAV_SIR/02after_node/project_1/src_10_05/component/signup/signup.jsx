import { useRef } from "react"
import "../../../node_modules/bootstrap/dist/css/bootstrap.min.css"
import { PageTitle } from "../elements/pageTitle";
export function SignUp() {

    const firstnameRef = useRef(null);
    const lastnameRef = useRef(null);
    const emailRef = useRef(null);
    const passwordRef = useRef(null);

    const Signuphandler = () => {
        // console.log("event = ", event);
        event.preventDefault();
        var formdetails = {
            firstname: firstnameRef.current.value,
            lastname: lastnameRef.current.value,
            email: emailRef.current.value,
            password: passwordRef.current.value
        }
        console.log(formdetails);
    }

    return <div className="container">
        <PageTitle title1="Sign Up"></PageTitle>
        <form className="row g-3">
            <div className="col-md-6">
                <label htmlFor={"firstname"} className="form-label">First Name</label>
                <input type="text" className="form-control" id="firstname" ref={firstnameRef}></input>
            </div>
            <div className="col-md-6">
                <label htmlFor={"lastname"} className="form-label">Last Name</label>
                <input type="text" className="form-control" id="lastname" ref={lastnameRef}></input>
            </div>
            <div className="col-12">
                <label htmlFor={"inputemail4"} className="form-label">Email</label>
                <input type="email" className="form-control" id="inputemail4" placeholder="abc@gmail.com" ref={emailRef}></input>
            </div>
            <div className="col-md-6">
                <label htmlFor={"password"} className="form-label">Password</label>
                <input type="password" className="form-control" id="password" ref={passwordRef}></input>
            </div>
            {/* <div className="col-12">
                <div className="form-check">
                    <input className="form-check-input" type="checkbox" id="gridCheck"></input>
                    <label className="form-check-label">
                        Check me out
                    </label>
                </div>
            </div> */}
            <div className="col-12">
                <button type="submit" className="btn btn-primary" onClick={Signuphandler}>Submit</button>
            </div>
        </form>
    </div>
}