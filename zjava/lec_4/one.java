import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(i)+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    //     double a = 55.5 % 10;
    //     int b = 55 % 10;
    //     double c= a+b;
    //     // int d = a+b;
    //     System.out.println(a+"+"+b+"="+c);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     char c=sc.next().charAt(0);
    //     if(c>='A' && c<='Z')  System.out.println("BIGGER CASE 1");
    //     else if (c>='a' && c<='z')  System.out.println("SMALL CASE 0");
    //     else    System.out.println("not alphabet -1");
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n;
    //     n=sc.nextInt();

    //     int row=1;
    //     while(row <= n){
    //         int col = 1;
    //         while(col <= (n - row + 1)){
    //             System.out.print(n- row +1);
    //             col +=1;
    //         }
    //         System.out.println();
    //         row+=1;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         int val = i;
    //         for(int j=0;j<2*(n) -1 ;j++){
    //             if(j<n-1-i){
    //                 System.out.print(" ");
    //             }
    //             if(j>=n-i-1 && j<n){
    //                 val += 1;
    //                 System.out.print(val);
    //             }
    //             if(j>=n && j<n+i){
    //                 val-=1;
    //                 System.out.print(val);
                    
    //             }
    //             if(j>n+1+i && j < 2*n){
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
