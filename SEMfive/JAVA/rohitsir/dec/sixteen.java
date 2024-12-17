package semfive.java.rohitsir.dec;

import java.util.*;

public class sixteen {
    //return all super prime 
    //super prime :x is super prime if x is prime and x//10 is also prime
    public static boolean IsPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean superPrimesrec(int n){
        if(n==0){
            // System.out.println(n);
            return true;
        }
        boolean x = IsPrime(n);
        if(x == true){
            return superPrimesrec(n/10);
        }
        else{
            return false;
        }
    }

    public static List<Integer> SuperPrimesint(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(superPrimesrec(i) == true){
                list.add(i);
            }
        }
        return list;
    }

    //without exception handeling
    // public static List<Integer> SuperPrimesstr(String strnum){
    //     List<Integer> list = new ArrayList<>();
    //     Integer n = Integer.valueOf(strnum);
    //     for(int i=2;i<=n;i++){
    //         if(superPrimesrec(i) == true){
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }

    public static boolean onlyDigits(String strnum){
        for(int i=0;i<strnum.length();i++){
            if(strnum.charAt(i) == '1' || strnum.charAt(i) == '2' || strnum.charAt(i) == '3' || strnum.charAt(i) == '4' || strnum.charAt(i) == '5' || strnum.charAt(i) == '6' || strnum.charAt(i) == '7' || strnum.charAt(i) == '8' || strnum.charAt(i) == '9' || strnum.charAt(i) == '0'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    //with axception handeling
    public static List<Integer> SuperPrimesstr(String strnum){
        try {
            if(!onlyDigits(strnum)){
                throw new BadRequestException("Bad/Invalid Input contains except number");
            }
            
            Integer n1 = Integer.valueOf(strnum);
            if(n1 >1000){
                throw new BadRequestException("number you have provided is over 1000");
            }

            List<Integer> list = new ArrayList<>();
            Integer n = Integer.valueOf(strnum);
            for(int i=2;i<=n;i++){
                if(superPrimesrec(i) == true){
                    list.add(i);
                }
            }
            return list;
        } catch (BadRequestException e) {
            System.out.println("bad request = " + e.getMessage());
            // throw e;//if we do throw e then program terminates
            // return null;to remove return null over and over we use finally
        } catch(IllegalException e){
            System.out.println("IllegalException = " + e.getMessage());
            // throw e;
            // return null;
        } finally{
            return new  ArrayList<Integer>();
        }
    }



    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();
        System.out.println("\n");
        ans = SuperPrimesstr("10001");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) +"\t");
        }
        System.out.println("\n");
    }
}

class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
    }
    
}
class LimitExceedException extends RuntimeException{

    public LimitExceedException(String message) {
        super(message);
    }
    
}
class IllegalException extends RuntimeException{

    public IllegalException(String message) {
        super(message);
    }
    
}