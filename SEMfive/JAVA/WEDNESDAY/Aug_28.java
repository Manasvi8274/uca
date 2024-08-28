package semfive.java.wednesday;
import java.util.*;
// public class aug_28{
//     // public static int c(int n){
//     //     if (n==1)    return 123;
//     //     else return c(n-1);
//     // };

//     public static void toh(int n,int s,int a,int d){
//         if(n==1)    move(1,s,d);
//         toh(n-1,s,d,a);
//         move(1,s,d);
//         toh(n-1,a,d,s);
//     }

//     public static void move(int n,int s,int d){
//         return ;
//     }

//     // public static int toh(int n,int s,int a,int d){}

//     public static void main(String[] args) {
//         // toh(5);
//         System.out.println(5);
//     }
    
// }
public class aug_28{
    public static long rec(long x,long n,long m){
        if(n==1){
            return x%m;
        }
        long z=rec(x,n/2,m);
        System.out.println(z);
        if(n%2!=0){
            return (((z*z)%m)*(x%m));
        }
        return ((z%m)*(z%m))%m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();
        // long z;
        long ans=rec(x,n,m);
        System.out.println(ans);
    }
}