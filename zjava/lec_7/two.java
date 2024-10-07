import java.util.Scanner;
public class two{

    // public static int facto(int n){
    //     if(n == 1 || n == 0)    return 1;
    //     else{
    //         return n*facto(n-1);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int r = sc.nextInt();

    //     System.out.println(facto(n)/(facto(n-r) * facto(r)));
    // }

    // public  static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int s = sc.nextInt(),e = sc.nextInt(),w = sc.nextInt();
    //     for(int i=s;i<=e;i+=w){
    //         System.out.print(i + " -> ");
    //         System.out.format("%.2f" , (5.0/9) * (i-32));
    //         System.out.println();
    //     }
    // }

    public static void incr(int n){
        n++;
    }
    public static void main(String[] args){
        int t=10;
        incr(10);
        System.out.println(t);
    }

    
}