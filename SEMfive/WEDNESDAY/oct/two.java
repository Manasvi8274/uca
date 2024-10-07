package semfive.wednesday.oct;

import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void backtrack(int n,int op,String brac,int cl,ArrayList<String>ans){
        if(op == n && cl == n){
            ans.add(brac);
            return;
        }
        if(op<n){
            backtrack(n, op + 1, brac + "(", cl, ans);
        }
        if(cl<n){
            backtrack(n, op, brac+")", cl + 1 , ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        // ArrayList<String> ans = new ArrayList<String>();
        // backtrack(n, 0, "", 0, ans);
        // for(int i=0;i<ans.size();i++){
        //     System.out.println(ans.get(i));
        // }

        // int n;
        // n = sc.nextInt();
        int n;
        n=sc.nextInt();
        int m=n;
        int rev=0;
        while(m!=0){
            int d=m%10;
            m=m/10;
            rev=rev*10 + d;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            System.out.println(0);
        }
        System.out.println(rev);
    }
}
