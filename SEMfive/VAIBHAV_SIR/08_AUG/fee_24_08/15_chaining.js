// var foo = function () {
//     console.log("insode foo");
//     function innerfunction() {
//         console.log("inside foo innerfunction");
//     }
// }
// foo()
// foo().innerfunction(); //cannot read prop of undefined as untill it does not return anything

// var foo = function (x) {
//     console.log("insode foo");
//     if (x == 6) {
//         return {
//             innerfunction1() {
//                 console.log("inside foo innerfunction1");
//             }
//         }
//     }
//     else {
//         return {
//             innerfunction2() {
//                 console.log("inside foo innerfunction2");
//             }
//         }
//     }
// }
// // foo()
// foo(6).innerfunction1(); //cannot read prop of undefined as untill it does not return anything
// foo().innerfunction2()
// // typeof foo()

// var foo = function () {
//     console.log("insode foo");
//     return {
//         innerfunction1() {
//             console.log("inside foo innerfunction1");
//             return {
//                 innerfunction1_1(){
//                     console.log("inside of innerfunction1_1")
//                 }
//             }
//         },
//         innerfunction2() {
//             console.log("inside foo innerfunction2");
//         }
//     }
// }
// // foo()
// foo().innerfunction1(); //cannot read prop of undefined as untill it does not return anything
// foo().innerfunction1().innerfunction1_1();
// foo().innerfunction2()
// typeof foo()

function infiniteconcat(is) {
    this.is = is;
    this.result = is;
    this.concat = function (iv) {
        this.result = this.result + " " + iv;
        // console.log(this.result);
        return this;
    }
}
var concat1 = new infiniteconcat("str1");

concat1.concat("str2").concat("str3");