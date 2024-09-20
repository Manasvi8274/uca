//1.Normal function can use declaration syntax
//but arrow function can only be function expression
//2.Arrow function can be annonymous function

// //declaration
// function foo() {
//     console.log("foo");
// }

// function foo1() {
//     console.log("foo1");
//     var fo2 = () => {
//         console.log("fo2");
//     }
// }
// // var x =new foo();
// // x.__proto__ === foo.prototype
// var x = new foo1();
// x.fo2


// function foo() {
//     console.log("normal function declaration");
// }

////////////////////////////////////////////arrow will always be function expression
// var foo = () => { console.log("normal function declaration"); }
/////////////////////////////////////////////arrow function can be annonymous function but declaration function cannot be annonymous
// () => { };
// let x = 0, y = 1;
/////////////////////////////////////////////in declaration this refers object and is not constant ie can be changed with object name but in arrow function does not 
// var fooxy = () => {
//     console.log();
// }
// let x = 10;

// () => { console.log(this.x) }
// var fooxy = () => {
//     console.log(this);
// }
// fooxy()

// function student(fname, obmark) {
//     // console.log(this);
//     this.fname = fname;
//     this.obmark = obmark;
//     this.checkres = function () {
//         // if(this.obmars/5 > 40)   return "PASS";
//         // else    return "FAIL";
//         console.log(this);
//     }
//     this.checkres_arrow = () => {
//         console.log(this);
//     }
// }
// var st1 = new student(5, 200);
// st1.checkres()
// st1.checkres_arrow()

// ()=>{
//     console.log("ANNON function");
// }

// ()  
function student(fname, obmark) {
    // console.log(this);
    this.fname = fname;
    this.obmark = obmark;
    this.checkres = function () {
        // if(this.obmars/5 > 40)   return "PASS";
        // else    return "FAIL";
        // console.log(this);
        // function innerfunction() {
        //     console.log("normal innerfunction", this)
        // }
        this.innerfunction =  function(){
                console.log("normal innerfunction", this)
        }
        this.innerfunction();//bind by windows as this for this this is window ,not called on object
    }
    this.checkres_arrow = () => {
        // console.log(this);
        innerfunction = () => {
            console.log("arrow innerfunction", this);
        }
        innerfunction();//this got inherited in arrow function as it takes this from parent function
    }
}
var st1 = new student(5, 200);
st1.checkres()
st1.checkres_arrow()  

var t = (a,b) => {console.log(a+b)};