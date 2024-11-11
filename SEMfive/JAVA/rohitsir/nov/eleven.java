package semfive.java.rohitsir.nov;

import java.io.IOError;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;
// import java.util.function.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.print.attribute.standard.OutputDeviceAssigned;

public class eleven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> oddlist = list.stream().filter((num) -> num%2 == 1).collect(Collectors.toList());
        System.out.println("\n\n" + oddlist);
    }
}

// public class eleven {
    // public static void main(String[] args) throws IOError {
        // Function<Supplier<String>,Consumer<String>> fourth = (supplier) -> 
        // {
        //     String randomid = supplier.get();
        //     Consumer <String>consumer = (idt) ->{
        //         for(int i=0;i<10;i++){
        //             try{
        //                 Thread.sleep(1000);
        //                 System.out.println(i + " " + idt +" " + randomid);
        //             }
        //             catch(Exception e){
        //                 // 

        //             }
        //         }
        //     };
        //     return consumer;
        // };
        // fourth.apply(()->{
        //     return String.valueOf("randomId -- " + Math.random()*100);
        // }).accept("Log system");

        // Supplier<Integer> randomGenerator = ()->{
        //     return (int)(Math.random() * 100d);
        // };
        // System.out.println("\n"+randomGenerator.get());
        // Function<String,Integer> x = (str) -> str.length();
        // System.out.println("\n" + x.apply("hi"));
        //Lambda SAM - Single Abstract Method(function);
        // (p1,p2) ->{
        //     //implementation
        // };
        // types of lambda function
            // 1.Predicate - output(boolean) eg-isPrime(),IsPalindrome()
            // 2.Supplier - no input only Output
            // 3.Consumer - no output only input
            // 4.Function - anything

        //Predicate
        // Predicate<Integer> isOdd = (p1)->p1%2 == 0;
        // System.out.println("\n"+isOdd.test(5));
        // System.out.println("\n"+isOdd.test(10));
        // System.out.println("\n"+isOdd.test(9));
    // }
// }


// public class eleven {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int[] nums = {1,9};
    //     int maxset = 0;
    //     for(int i=0;i<32;i++){
    //         int count =0;
    //         for(int j=0;j<nums.length;j++){
    //             int bit = (nums[j] >> i) & 1;
    //             if(bit == 1){
    //                 count++;
    //             }
    //             maxset= Math.max(maxset, count);
    //         }
    //     }
    //     System.out.println("\n" + maxset);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // Integer maxcount = (n>0)?1:0;
        // for(int i=0;i<n;i++){
        //     int and = arr[i];
        //     int c=1;
        //     for(int j=i+1;j<n;j++){
        //         if((and & arr[j]) > 0){
        //             and = and&arr[i];
        //             c+=1;
        //             maxcount = Integer.max(maxcount, c);
        //         }
        //     }
        // }
        // System.out.println(maxcount);
    // }
// }
