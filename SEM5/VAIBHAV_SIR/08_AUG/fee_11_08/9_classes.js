// new keywod to be used with a function
function student(fName, obtainedMarks) {
    console.log(this);
    this.fNameObj = fName;
    this.obtMarksObject = obtainedMarks;
    this.checkResults = function () {
        console.log(this);
        let percentage = (this.obtMarksObject / maxMarks) * 100;
        if (percentage >= 40) {
            return "pass";
        } else {
            return "fail";
        }
    };
}

var student1 = new student("fname5", 100);
// ----------------------------------------------------------------------
class Student {
    constructor(fName, obtainedMarks) {
        this.fNameObj = fName;
        this.obtMarksObject = obtainedMarks;
    }

    checkResults() {
        let percentage = (this.obtMarksObject / maxMarks) * 100;
        if (percentage >= 40) {
            return "pass";
        } else {
            return "fail";
        }
    }
}

var student1 = new Student("fname5", 100);

function add(x, y) {
    return x + y
}
class add1 {
    z=0;
    constructor(x, y) {
        this.z = x + y;
    }
}

console.log(add(5,6));
var t = new add1(6,7);
console.log(t.a)