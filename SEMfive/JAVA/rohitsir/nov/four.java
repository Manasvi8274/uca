package semfive.java.rohitsir.nov;

interface mylambda{
    int foo(int a,int b);
}

public class four {
    public static void main(String[] args){
        mylambda x = (int a,int b) -> a+b;
        System.out.println(x.foo(5, 6));
        x = (int a,int b) -> a-b;
        System.out.println(x.foo(5, 6));
    }
}
