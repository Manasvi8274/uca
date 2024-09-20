// XMLhttpsRequet = basic make a network call
// if open("GET",url,true)x

let promisexml;

function customFetch(url, resolve, reject) {
    promisexml = new Promise(resolve, reject);
    function executor(resolve, reject) {
        var xmlhttprequest = new XMLHttpRequest();
        //onreadystatechange is a  member function
        xmlhttprequest.onreadystatechange = function () {
            if (xmlhttprequest.DONE) {//request is end 
                if (this.status === 200) {//this=xmlhttprequest
                    console.log("DATA FETCHED ", this.responseText);
                    resolve();
                }
                else {
                    // reject();
                    console.log("DATA NOT FETCHED");
                }
            }
        }
        xmlhttprequest.open("GET", url, true);//use get then only url if post then send body also
        xmlhttprequest.send();//go to onreadystatechange and works funct
    }
}

customFetch("https://localhost:5500");