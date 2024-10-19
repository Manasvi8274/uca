package zjava.lec_11_strings;

import java.util.*;

public class string {
    public static int count_words(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        int ans = 0;
        if(str.length() == 0)   return 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')    ans++;
        }
        if(ans == str.length()) return 0;
        return ans;
    }

    public static void reverse_string(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(str + " " + rev);
    }

    public static void palindrome_string(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                flag = false;
                break;
            }
        }
        if(flag)    System.out.println(true);
        else    System.out.println(false);
    }

    public static void main(String[] args) {
        // String str1;
        // String str2;
        // str1 = sc.nextLine();
        // str2 = sc.nextLine();
        // System.out.println(str1 + " " + str2); 
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str1.contains("c"));
        // System.out.println(str1.endsWith("g"));
        // System.out.println(str1.indexOf("g"));
        // System.out.println(str1.indexOf("ing"));
        // System.out.println(str1.lastIndexOf("a"));
        // System.out.println(count_words());
        // reverse_string();
        // palindrome_string();
        String str1 = "abc";
        String str3 = "abc";
        String str2 = new String("abc");
        String str4 = new String("abc");
        str1+="g";
        System.out.println(str1);
        // System.out.println(str1.equals(str2));
        // int hass1 = System.identityHashCode(str1);
        // int hass2 = System.identityHashCode(str2);
        // int hass3 = System.identityHashCode(str3);
        // int hass4 = System.identityHashCode(str4);
        // System.out.println(hass1+" " + hass2 + " " + hass3 + " " + hass4);
    }
}
