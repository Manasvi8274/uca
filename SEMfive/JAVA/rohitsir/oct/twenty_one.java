package semfive.java.rohitsir.oct;
//     public void b(){
//         System.out.println("inside B1");
//     public abstract String getCourse();
// }

// public class twenty_one  extends B 
// {
//     // public String getCourse(){
//     //     return "UCA";
//     // }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         twenty_one c =  new twenty_one();
//         c.b();

//     }
// }


interface shape{
    public double area();
    public double perimeter();
    public String NameOfShape();
}

class circle implements shape {
    double r;
    public circle(double radius){
        r = radius;
    }

    public String NameOfShape(){
        return "CIRCLE";
    }
    public double area(){
        return ((Math.PI) * (r * r));
    }
    public double perimeter(){
        return Math.PI * 2 * r;
    }
}

abstract class quad implements shape{
    public abstract double area();
    public abstract double perimeter();
    public abstract String NameOfShape();
}

class rectangle extends quad{
    double a;
    double b;
    rectangle(){}
    rectangle(double length,double breadth){
        a=length;
        b=breadth;
    }
    @Override public double area(){
        return a*b;
    }
    @Override public double perimeter(){
        return 2*(a+b);
    }
    @Override public String NameOfShape(){
        return "QUADILATERAL => RECTANGLE";
    }
}

class square extends rectangle{
    double a;
    square(double side){
        super(side,side);
        // a=side;
    }
    // @Override public double area(){
    //     return a*a;
    // }
    // @Override public double perimeter(){
    //     return 4*a;
    // }
    @Override public String NameOfShape(){
        return "QUADILATERAL => SQUARE";
    }
}

class parallelogram extends rectangle{
    // double a;
    parallelogram(double base,double height){
        super(base,height);
        // a=side;
    }
    // @Override public double area(){
    //     return a*a;
    // }
    // @Override public double perimeter(){
    //     return 4*a;
    // }
    @Override public String NameOfShape(){
        return "QUADILATERAL => parallelogram";
    }
}

class trapezium extends quad{
    double a;
    double b;
    double h;
    trapezium(double base1,double base2,double height){
        a=base1;
        b=base2;
        h=height
    }
    @Override public double area(){
        return (a*b*h)/2;
    }
    @Override public double perimeter(){
        return ;
    }
    @Override public String NameOfShape(){
        return "QUADILATERAL => parallelogram";
    }
}

abstract class triangle implements shape{
    public abstract double area();
    public abstract double perimeter();
    public abstract String NameOfShape();
}

class equilateral extends triangle{
    double a;

    public equilateral(double side) {
        a=side;
    }

    @Override public double area(){
        double s=3*a/2;
        double ar = Math.pow((s*(s-a)*(s-a)*(s-a)), 0.5);
        return ar;
    }
    @Override public double perimeter(){
        return 3*a;
    }
    @Override public String NameOfShape(){
        return "TRIANGLE => EQUILATERAL";
    }
    
}

class scalene extends triangle {
    double a,b,c;

    public scalene(double side1,double side2,double side3) {
        a=side1;
        b=side2;
        c=side3;
    }

    @Override public double area(){
        double s=perimeter()/2;
        return Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
    }
    @Override public double perimeter(){
        return a+b+c;
    }
    @Override public String NameOfShape(){
        return "TRIANGLE => scalene";
    }
    
}

class isosceles extends triangle{
    double a,b;

    public isosceles(double sidea,double sideb) {
        a=sidea;
        b=sideb;
    }

    @Override public double area(){
        double s=(a+b+a)/2;
        double ar = Math.pow((s*(s-a)*(s-b)*(s-a)), 0.5);
        return ar;
    }
    @Override public double perimeter(){
        return a+b+a;
    }
    @Override public String NameOfShape(){
        return "TRIANGLE => isosceles";
    }
    
}


public class twenty_one {
    public static void main(String[] args) {
        shape one = new scalene(5, 10, 18);
        System.out.println(one.area());
        System.out.println(one.NameOfShape());
        System.out.println(one.perimeter());
        
        System.out.println();

        shape two = new rectangle(10.0, 20.0);
        System.out.println(two.area());
        System.out.println(two.NameOfShape());
        System.out.println(two.perimeter());
        
        System.out.println();

        shape three = new circle(7);
        System.out.println(three.NameOfShape());
        System.out.println(three.area());
        System.out.println(three.perimeter());

        System.out.println();

        shape four = new square(7);
        System.out.println(four.NameOfShape());
        System.out.println(four.area());
        System.out.println(four.perimeter());

    }
}

