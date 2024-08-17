// SCOPOING : - 3 TYPES
// 1-GLOBAL - like windows
// 2-FUNCTION - only access in s function
// 3-BLOCK - 
// hoisting never makes a variable global but moves a variable to top level of innermost function

// VARIABLE var and let , better to use let as it can not change scope but var can change the scope but remian undefined

// if not defined x=undefined but if x=null so there is no value

// if anything has property if called object in js 


// var obj2={
//     name:"name1",
//     tocust : function(){
//         console.log("Inside custom")
//     }
// }

// NOTE :- cannot send object directly so we can use stringify by encapsulation of obj into string JSON.stringify()

var globalvar1 = "GLOBAL VAR";

// simple function
function foo11() {
    var var1 = "var1val";
    let let1 = "let1val";
    console.log("var1 = ",var1);
    console.log("let1 = ",let1);
    if(true){
        var var2 = "var2val";
        let let2 = "let2val";
        console.log("var1 = ", var1);
        console.log("let1 = ", let1);
    }
    // var2 acessible as it is hoisted
}

// expression function 
// var foo = function (param)=>{console.log(param);}

// arrow function (cannot be called)
(param) => {
    console.log(param);
}

// self - invoking function
(// (<!--self invoking function-->
    (param) => {
        console.log(param);
    })()