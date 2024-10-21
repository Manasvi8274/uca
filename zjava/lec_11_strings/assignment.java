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

    public static void main(String[] args) {
        check_perm();
    }
}