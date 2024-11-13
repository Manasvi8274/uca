import { createBrowserRouter, RouterProvider } from "react-router-dom"
import { Routes } from "./Routes"
export function App() {

    //create routes 
    const router = createBrowserRouter(Routes);

    return <>
        <RouterProvider router={router}></RouterProvider>
    </>

    // return <>
    //     {/* here main is prop in layout as children */}
    //     <Layout>
    //         <main>
    //             <RouterProvider router={router}></RouterProvider>
    //         </main>
    //     </Layout>
    // </>
    // return <>
    //     {/* here main is prop in layout as children */}
    //     <Layout>
    //         <main>
    //             <RouterProvider router={router}></RouterProvider>
    //         </main>
    //     </Layout>
    // </>
    // return (
    //     <>
    //         <header>
    //             <AHeader />
    //         </header>
    //         <main>
    //             <RouterProvider router={router}></RouterProvider>
    //         </main>
    //         <footer></footer>
    //     </>
    // )
}