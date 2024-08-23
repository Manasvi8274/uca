// NOTE - only use static in extreme condition as it bind to class name not the object
class StudentWithPAndNFields {
    #firstname;
    static lastname = 1;
    constructor(obtainedmarks, name) {
        this.obtainedmarks = obtainedmarks;
        this.firstname = name;
        this.lastname = name;
    }

    checkresult() {
        let percentage = this.obtainedmarks / 5;
        if (percentage >= 40) return ("Pass");
        else return ("Fail");
    }
}

// class StudentWithPAndNFields {
//     #firstname;
//     static lastname = "hello";
//     constructor(obtainedmarks, name) {
//         this.obtainedmarks = obtainedmarks;
//         this.firstname = name;
//         this.lastname = name;
//     }

//     checkresult() {
//         let percentage = this.obtainedmarks / 5;
//         if (percentage >= 40) return ("Pass");
//         else return ("Fail");
//     }
// }

// var st1 = new StudentWithPAndNFields(400, "joe");
// var st2 = new StudentWithPAndNFields(300, "aleph");

// console.log(st1.firstname);
// console.log(st2.firstname);
// console.log(st1.lastname);