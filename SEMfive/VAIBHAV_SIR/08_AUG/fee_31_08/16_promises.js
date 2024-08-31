//chaining + this keyword  = promise
//formal object 
//created using constructor function - most usefull,extensive,best
// object.create = create a new object , object.assign = an object is reference with another object
//promise is an objeect created using promise() constructor funcion  and have 2 properties and have two properties and have -
// 1.state
// 2.value
// State - possible values:
//  - initial state = pending - waiting
//  - fulfilled - sucess
//  - rejected - reject
// Value - possible values:
//  - initial = undefined(does not depend on anyone)
//  return value or error

////////////////////////////////////basic promise - SAMPLE Promise()
// function promiseExecutor() {
//     setTimeout(() => {
//         console.log("inside promiseExecutor");
//     }, 10000);
// }

// var promise1 = new Promise(promiseExecutor)//normal way,create a simple promise

//to find which constructor function is used
// console.log(promise1.constructor.name)
// console.log(promise1.name)//not defined
// console.log(promise1.constructor)

// console.log(promise1)


//-----------------------------------fullfiled promise
// function promiseExecutor(resolve, reject) {
//     resolve({ response: "resolve promise" });
//     console.log("inside promiseExecutor");
// }

// var promise1 = new Promise(promiseExecutor)
// console.log(promise1);//only get out of pending state if any one parameter get called


///----------------------------------------rejected promise - always give an uncautgh a promise error
// function promiseExecutor(resolve, reject) {
//     reject({ response: "reject promise" });
//     console.log("inside promiseExecutor");
// }

// var promise1 = new Promise(promiseExecutor)
// console.log(promise1);//only get out of pending state if any one parameter get called

//chain methods  -  then and catch----------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------
// let responsevalue;

// function promiseExecutor(resolve, reject) {
//     resolve({ response: "resolve promise" });
//     console.log("inside promiseExecutor");
// }

// var promise1 = new Promise(promiseExecutor);

// promise1.then((somevalue) => {
//     responsevalue = somevalue
// })//accepts a callback(passing function a function ) as method
// console.log(promise1);
// console.log(responsevalue);

// -----------------------------------------------------------------------------------------

// function promiseExecutor(resolve, reject) {
//     reject({ response: "responsevalue" });
//     console.log("inside promiseExecutor");
// }

// var promise1 = new Promise(promiseExecutor);
// let responsevalue;

// promise1.catch((somevalue) => {
//     responsevalue = somevalue;
// });
// console.log(responsevalue);//no value as this works fast than promise

//accepts a callback(passing function a function ) as method
// console.log(promise1);
// console.log(responsevalue);



// var promise1 = new Promise(promiseExecutor);
// let responsevalue;

// promise1.catch((somevalue) => {
//     responsevalue = somevalue;
// });

// //accepts a callback(passing function a function ) as method
// console.log(promise1);
// setTimeout(() => {
//     console.log(responsevalue);
// }, 10000);
// ---------------------------------------------------------------------------------------------

