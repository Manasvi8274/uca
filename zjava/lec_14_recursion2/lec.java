package lec_14_recursion2;
import java.util.*;

public class lec {
    // public static String remove_dup(String str,int i,String ans){
    //     if(i == str.length() - 1){
    //         ans+=str.charAt(i);
    //         return ans;
    //     }
    //     if(str.charAt(i) != str.charAt(i+1)){
    //         System.out.print("hi");
    //         ans+=str.charAt(i);
    //     }
    //     remove_dup(str, i+1, ans);
    //     return ans;
        
    // }

    public static String replace_pi(String str,int i){
        if(i >= str.length()){
            return "";
        }
        if(i==str.length()-1){
            return ""+str.charAt(i);
        }
        if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
            return "3.14" + replace_pi(str, i+2);
        }
        else    return str.charAt(i) + replace_pi(str, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "aabbccddef";
        // String ans ="";
        // String s = remove_dup(str, 0, ans);
        // System.out.println();
        // System.out.println("\n" + s);
        String str = sc.next();
        System.out.println(replace_pi(str,0));
    }
}
