// var promise1 = new Promise(executor)

// function customPromiseExecutor() {
//     console.log("int custom Promise Executor");
// }

// function customPromise(executorfuncArg) {
//     executorfuncArg();
//     this.state = "pending";
//     let returnValue = undefined;//does not expose returnValue

// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);

// console.log(promiseCustom1);
// ------------------------------------------------------------------------

// function customPromiseExecutor(resolve, reject) {
//     resolve();
//     console.log("inside promiseExecutor");
// }

// function customPromise(executorfuncArg) {
//     this.state = "pending";
//     executorfuncArg(
//         () => {
//             this.state = "fulfilled";
//             console.log("inside Resolve function");
//         },
//         () => {
//             this.state = "rejected";
//             console.error("inside Reject function");
//         },
//     );//we need to define resolve and reject , they are defined where they are called;
//     console.log(this.state);
//     let returnValue = undefined;//does not expose returnValue

// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);

// console.log("promisecustom1=", promiseCustom1);
// -----------------------------------------------------------------------------------
// function customPromiseExecutor(resolve, reject) {
//     setTimeout(() => {
//         reject("Sample value");
//         console.log("inside promiseExecutor");
//     }, 3000);
// }

// function customPromise(executorfuncArg) {
//     executorfuncArg(
//         (anyvalue) => {
//             this.state = "fulfilled";
//             console.log("inside Resolve function and anyvalue = ", anyvalue);
//         },
//         (anyvalue) => {
//             this.state = "rejected";
//             console.error("inside Reject function and anyvalue = ", anyvalue);
//         },
//     );//we need to define resolve and reject , they are defined where they are called;
//     this.state = "pending";
//     let returnValue = undefined;//does not expose returnValue

// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);
// console.log("promisecustom1=", promiseCustom1);
// --------------------------------------------------------------------------------------
// function customPromiseExecutor(resolve, reject) {
//     setTimeout(() => {
//         resolve("Sample value");
//         console.log("inside promiseExecutor");
//     }, 5000);
// }

// function customPromise(executorfuncArg) {
//     this.state = "pending";
//     let sucesscallbackcustom;
//     let errorcallbackcustom;
//     executorfuncArg(
//         (sucessresponse) => {
//             this.state = "fulfilled";
//             console.log("inside Resolve function and sucessresponse = ", sucessresponse);
//             sucesscallbackcustom(sucessresponse);
//         },
//         (errorresponse) => {
//             this.state = "rejected";
//             console.error("inside Reject function and errorresponse = ", errorresponse);
//             errorcallbackcustom(errorresponse);
//         },
//     );//we need to define resolve and reject , they are defined where they are called;
//     let returnValue = undefined;//does not expose returnValue

//     //this.then use to implement chaining then is functino with also takes a function as an arguments,ie arg1 = fuction ,,, to expose then we create a local arguments
//     this.then = (arg1callback) => {
//         sucesscallbackcustom = arg1callback;
//     }
// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);
// console.log("promisecustom1=", promiseCustom1);

// let sucessresponseCustomvalue;
// promiseCustom1.then((somevalue => {
//     sucessresponseCustomvalue = somevalue;
// }));//only works when resolve works

// -------------------------------------------------------------------------------------------------------------
// function customPromiseExecutor(resolve, reject) {
//     setTimeout(() => {
//         reject("Sample value");
//         console.log("inside promiseExecutor");
//     }, 5000);
// }

// function customPromise(executorfuncArg) {
//     this.state = "pending";
//     let sucesscallbackcustom;
//     let errorcallbackcustom;
//     executorfuncArg(
//         (sucessresponse) => {
//             this.state = "fulfilled";
//             console.log("inside Resolve function and sucessresponse = ", sucessresponse);
//             sucesscallbackcustom(sucessresponse);
//         },
//         (errorresponse) => {
//             this.state = "rejected";
//             console.error("inside Reject function and errorresponse = ", errorresponse);
//             errorcallbackcustom(errorresponse);
//         },
//     );//we need to define resolve and reject , they are defined where they are called;
//     let returnValue = undefined;//does not expose returnValue

//     //this.then use to implement chaining then is functino with also takes a function as an arguments,ie arg1 = fuction ,,, to expose then we create a local arguments
//     this.then = (arg1callback) => {
//         sucesscallbackcustom = arg1callback;
//     }

//     this.catch = (arg2callback) => {
//         errorcallbackcustom = arg2callback;
//     }
// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);
// console.log("promisecustom1=", promiseCustom1);

// // let sucessresponseCustomvalue;
// // promiseCustom1.then((somevalue => {
// //     sucessresponseCustomvalue = somevalue;
// // }));//only works when resolve works


// let errorresponseCustomvalue;
// promiseCustom1.catch((somevalue => {
//     errorresponseCustomvalue = somevalue;
// }));//only works when resolve works

// -------------------------------------------------------------------------------------------------------------
//----------------------------------------------FINAL PROMISE CUSTOM -------------------------------------------
// function customPromiseExecutor(resolve, reject) {
//     setTimeout(() => {
//         reject("Sample value");
//         console.log("inside promiseExecutor");
//     }, 5000);
// }

// function customPromise(executorfuncArg) {
//     this.state = "pending";
//     let sucesscallbackcustom;
//     let errorcallbackcustom;
//     executorfuncArg(
//         (sucessresponse) => {
//             this.state = "fulfilled";
//             console.log("inside Resolve function and sucessresponse = ", sucessresponse);
//             sucesscallbackcustom(sucessresponse);
//         },
//         (errorresponse) => {
//             this.state = "rejected";
//             console.error("inside Reject function and errorresponse = ", errorresponse);
//             errorcallbackcustom(errorresponse);
//         },
//     );//we need to define resolve and reject , they are defined where they are called;
//     let returnValue = undefined;//does not expose returnValue

//     //this.then use to implement chaining then is functino with also takes a function as an arguments,ie arg1 = fuction ,,, to expose then we create a local arguments
//     this.then = (arg1callback) => {
//         sucesscallbackcustom = arg1callback;
//     }

//     this.catch = (arg2callback) => {
//         errorcallbackcustom = arg2callback;
//     }
// }

// var promiseCustom1 = new customPromise(customPromiseExecutor);
// console.log("promisecustom1=", promiseCustom1);

// let sucessresponseCustomvalue;
// promiseCustom1.then((somevalue => {
//     sucessresponseCustomvalue = somevalue;
// }));//only works when resolve works


// let errorresponseCustomvalue;
// promiseCustom1.catch((somevalue => {
//     errorresponseCustomvalue = somevalue;
// }));//only works when resolve works