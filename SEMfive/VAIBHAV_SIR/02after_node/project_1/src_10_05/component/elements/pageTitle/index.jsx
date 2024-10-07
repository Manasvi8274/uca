export function PageTitle(props) {
    return <>
        <div style={{ fontSize: "30px", margin: "auto", padding: "1px 1px" }}>
            <span className="badge text bg-secondary">
                {props.title1}
            </span>
        </div>
    </>
}