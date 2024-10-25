import java.util.*;

public class assignment{
    public static void check_perm(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char str1_temp[] = str1.toCharArray();
        char str2_temp[] = str2.toCharArray();
        Arrays.sort(str1_temp);
        Arrays.sort(str2_temp);
        boolean flag=true;
        for(int i=0;i<str1_temp.length;i++){
            if(str1_temp[i] != str2_temp[i]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    public static void remove_consecutive(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        ans+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) != str.charAt(i-1)){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void reverse_each_word(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' || i == str.length()-1){
                int j;
                if(i == str.length()-1){
                    j=i;
                }
                else{
                    j=i-1;
                }
                while(j>=0 && str.charAt(j) !=' '){
                    ans+=str.charAt(j);
                    j--;
                }
                if(i != str.length()-1)    ans+=' ';
            }
        }
        

        System.out.println(ans);
    }

    public static void stringcompres() {
        Scanner sc = new  Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int c=1;
        for(int i=0;i<s.length();i++){
            if(i == 0){
                ans+=s.charAt(i);
            }
            else if (i == s.length()-1) {
                if(c==1){
                    ans+=s.charAt(i);
                }
                if(s.charAt(i) == s.charAt(i-1)){
                    ans+=String.valueOf(c+1);
                }
                if(c!=1 && s.charAt(i) != s.charAt(i-1)){
                    ans+=String.valueOf(c);
                    ans+=s.charAt(i);
                }
            }
            else if(s.charAt(i) == s.charAt(i-1)){
                c++;
            }
            else{
                if(c!=1)    ans+=String.valueOf(c);
                // System.out.println(ans + " " + c);
                c=1;
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void count_word(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ')  ans++;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        // check_perm();
        // remove_consecutive();
        // reverse_each_word();
        // stringcompres();
        count_word();
    }
}