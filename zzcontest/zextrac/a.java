package zzcontest.zextrac;
import java.util.*;

public class a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        Integer ans = 0;
        Integer ans1 =0;
        boolean flagz=false;
        boolean flago = false;
        for(int i=0;i<color.length()-1;i++){
            if(color.charAt(i) == '0'){
                ans1+=1;
                flagz=true;
                continue;
            }
            if(flagz == true && color.charAt(i) == '1' && color.charAt(i+1) =='1'){
                ans+=ans1+1;
                ans1=0;
                flago = true;
            }
        }
        if(color.charAt(color.length()-1) == '1'){
            ans+=ans1;
            flago = true;

        }
        if(flagz == false || flago == false){
            System.out.println(0);
        }
        else{
            System.out.println(ans);
        }
    }
}