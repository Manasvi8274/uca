// package zjava.lec_14_resursion1.assignment;
public class assignment{
    public static boolean palindrome(String str,int i){
        if(i == str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length() - 1-i)) return false;
        else    return palindrome(str, i+1);

    }

    public static void main(String[] args) {
        String str = "racecar";
        // System.out.println("\n"+palindrome(str, 0));
        System.out.println((char)('z' + 1));
    }
}