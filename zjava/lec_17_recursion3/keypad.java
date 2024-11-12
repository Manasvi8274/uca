import java.util.Scanner;

public class keypad {
    public static String[] fun(int n){
        if(n==0){
            return new String[0];
        }
        String[] ans = fun(n/10);
        String[] x = new String[4];
        if(n%10 == 2){
            x=new String[3];
            x[0] = "a";
            x[1] = "b";
            x[2] = "c";
        }
        else if(n%10 == 3){
            x=new String[3];
            x[0] = "d";
            x[1] = "e";
            x[2] = "f";
        }
        else if(n%10 == 4){
            x=new String[3];
            x[0] = "g";
            x[1] = "h";
            x[2] = "i";
        }
        else if(n%10 == 5){
            x=new String[3];
            x[0] = "j";
            x[1] = "k";
            x[2] = "l";
        }
        else if(n%10 == 6){
            x=new String[3];
            x[0] = "m";
            x[1] = "n";
            x[2] = "o";
        }
        else if(n%10 == 7){
            x = new String[4];
            x[0] = "p";
            x[1] = "q";
            x[2] = "r";
            x[3] = "s";
        }
        else if(n%10 == 8){
            x=new String[3];
            x[0] = "t";
            x[1] = "u";
            x[2] = "v";
        }
        else if(n%10 == 9){
            x=new String[4];
            x[0] = "w";
            x[1] = "x";
            x[2] = "r";
            x[3] = "z";
        }
        int t=3;
        if(n == 7 || n == 9){
            t+=1;
        }
        String[] ans1 = new String[1];
        if(ans.length == 0){
            ans1 =  new String[t];
            for(int i=0;i<x.length;i++){
                ans1[i] = x[i];
            }
        }
        else{
            ans1 = new String[ans.length*t];
            int z=0;
            for(int j=0;j<x.length;j++){
                for(int i=0;i<ans.length;i++){
                    ans1[z++] = ans[i];
                    ans1[z++] = ans[i] + x[j];
                }
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = fun(n);
        System.out.println("/n");
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i] + "\t");
        }
    }
}
