package semfive.java.rohitsir.nov;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

public class twentyfive {
    public static void main(String[] args) {
        System.out.println("\n");
        // List<String> names = Arrays.asList("Alice","Bob","Charlie","David");

        //start with a;
        // List<String> anames = names.stream().filter((name)->name.charAt(0) == 'A').collect(Collectors.toList());

        // System.out.println("\n");
        // System.out.println(anames);

        // //to upper;
        // List<String> newnames = names.stream().map((name) -> name.toUpperCase()).collect(Collectors.toList());

        // System.out.println(newnames);

        // List<String> newnames = names.stream().filter((name)-> name!=null).map((name) -> name.toUpperCase()).collect(Collectors.toList());

        // System.out.println(newnames);

        // String combinedname = names.stream().filter((name) -> name!= null).reduce("combinedname : ", (a,b) -> a+b);
        //reduce function need at least two argument 
        // but we do not know if there is any value or not so we use typw Optionnal<String>
        // System.out.println(combinedname);

        // Optional<String> combinedname1 = names.stream().filter((name) -> name!= null).reduce((a,b) -> a+b);

        // System.out.println(combinedname1);
        // List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Integer sum = numbers.stream().reduce(0, (a,b) -> a+b);

        // Integer sum = numbers.stream().reduce(0, Integer::sum);
        // System.out.println(sum);

        // List<String> names = Arrays.asList("Alice","Bob","Charlie","David" , "Ash");

        // System.out.println(names.stream().collect(Collectors.groupingBy((name) -> name.charAt(0))));

        // Map<String,Long> CountNames = names.stream().collect(Collectors.groupingBy((name) -> name , Collectors.counting()));

        // System.out.println(CountNames);

        //count start with same alphabet with A
        // System.out.println(names.stream().collect(Collectors.groupingBy((name) -> name.charAt(0) == 'A' ,Collectors.counting())));
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David" , "Ash");


        // System.out.println(names.stream().collect(Collectors.groupingBy((name) -> name.length() ,Collectors.counting())));
        //with names  
        // System.out.println(names.stream().collect(Collectors.groupingBy((name) -> name.length())));
        // List<String> newnames = names.stream().filter(name -> name.length() == 5).collect(Collectors.toList());
        // System.out.println(newnames);

        
    }
}
