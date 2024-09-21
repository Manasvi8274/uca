export function header(props) { // here props are attributes in header tag
    // console.log(title);
    // return <div>{props.title}</div>;//we have to use interpolation ie {} and bind it into div etc and return can only return one element
    return (
        <div>
            <h2>{props.title}</h2>
        </div>
    )
}