
public class seven_oct {
    int x;
    int airbags;
    seven_oct(){
        
    }

    seven_oct(int x,int airbags){//multiargument constructor
        this.x = x;
        this.airbags = airbags;
    }

    seven_oct(seven_oct copy){
        this.x = copy.x;
        this.airbags = copy.airbags;
    }

    public static void main(String[] args){
        // seven_oct one = new seven_oct();
        // seven_oct two = new seven_oct(20, 30);
        // seven_oct three = new seven_oct(two);
        // System.out.println(one+" "  + one.x);
        // int a;
        // System.out.println(a);

        UCA.main1();
    }
}

class UCA<K, V>{
    K key;
    V value;
    UCA(K key,V value){
        this.key = key;
        this.value = value;
    }

    public static void main1(){
        UCA<String,String> uca1 = new UCA<String,String>("Hello" , "WORLD");
        UCA<Integer,Integer> uca2 = new UCA<Integer,Integer>(1 , 2);
        System.out.println(uca1.key + " " + uca1.value);
        System.out.println(uca2.key + " " + uca2.value);
        return;
    }
}
