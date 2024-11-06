// package semfive.java.gauravsir.nov;

// import java.io.*;
// import java.util.*;


// public class five_bst {
//     class Node{
//         Integer key;
//         Integer value;
//         Node left;
//         Node right;

//         Node(Integer key,Integer value){
//             this.key = key;
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     Node root ;

//     five_bst(){
//         this.root = null;
//     }

//     public Integer get(Integer key){
//         return get(root,key);
//         // return null;//int cannot be null; so int to Integer
//     }

//     private Integer get(Node x , Integer key){
//         if(x == null)   return null;
//         else if(key == x.key)    return x.value;
//         else if(key<x.key)  return get(x.left,key);
//         else    return get(x.right,key);
//     }

//     public void put(Integer key,Integer value){
//         root = put(root,key,value);
//     }

//     private Node put(Node x , Integer key , Integer value){
//         if(x == null){
//             return new Node(key, value);
//         }
//         if(key == x.key){
//             x.value = value;
//         }
//         else if(key<x.key){
//             x.left = put(x.left,key,value);
//         }
//         else{
//             x.right = put(x.right,key,value);
//         }
//         return x;
//     }

//     // private void put(Node x , Integer key , Integer value){
//     //     if(x == null){
//     //         x = new Node(key, value);
//     //         return;
//     //     }
//     //     if(x.key<key)   put(x.left,key,value);
//     //     else if(x.key > key)    put(x.right,key,value);
//     // }


//     public static void main(String[] args){
        
//         // try {
//         //     File file = new File("semfive\\java\\gauravsir\\nov\\a.txt");
//         //     Scanner sc = new Scanner(file);
//         //     while(sc.hasNextLine()){
//         //         System.out.println(sc.nextLine());
//         //     }

//         // } catch (Exception e) {
//         //     System.err.println("\n" + "error");
//         // }
//         five_bst bst = new five_bst();
//         try {
//             File file = new File("semfive\\java\\gauravsir\\nov\\a.txt");
//             Scanner sc = new Scanner(file);
//             while(sc.hasNext()()){
//                 String data = sc.next();
//                 if(bst.get(data.length()) != null){
//                     bst.get(data.length())
//                 }
//             }

//         } catch (Exception e) {
//             System.err.println("\n" + "error");
//         }
//     }
// }


// package semfive.java.gauravsir.nov;

// import java.io.*;
// import java.util.*;


// public class five_bst {
//     class Node{
//         Integer key;
//         Integer value;
//         Node left;
//         Node right;

//         Node(Integer key,Integer value){
//             this.key = key;
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     Node root ;

//     five_bst(){
//         this.root = null;
//     }

//     public Node get(Integer key){
//         return get(root,key);
//         // return null;//int cannot be null; so int to Integer
//     }

//     private Node get(Node x , Integer key){
//         if(x == null)   return null;
//         else if(key == x.key)    return x;
//         else if(key<x.key)  return get(x.left,key);
//         else    return get(x.right,key);
//     }

//     public void put(Integer key,Integer value){
//         root = put(root,key,value);
//     }

//     private Node put(Node x , Integer key , Integer value){
//         if(x == null){
//             return new Node(key, value);
//         }
//         if(key == x.key){
//             x.value = value;
//         }
//         else if(key<x.key){
//             x.left = put(x.left,key,value);
//         }
//         else{
//             x.right = put(x.right,key,value);
//         }
//         return x;
//     }


//     public static void main(String[] args){
//         five_bst bst = new five_bst();
//         try {
//             File file = new File("semfive\\java\\gauravsir\\nov\\a.txt");
//             Scanner sc = new Scanner(file);
//             while(sc.hasNext()){
//                 String data = sc.next();
//                 if(bst.get(data.length()) != null){
//                     bst.get(data.length()).value +=1;
//                 }
//                 else{
//                     bst.put(data.length(), 1);
//                 }
//             }
//             Integer ans = 

//         } catch (Exception e) {
//             System.err.println("\n" + "error");
//         }
//     }
// }

// package semfive.java.gauravsir.nov;


public class fivebst {
    class Node{
        String key;
        Integer value;
        Node left;
        Node right;

        Node(String key,Integer value){
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    fivebst(){
        this.root = null;
    }

    public Integer get(String key){
        return get(root,key);
        // return null;//int cannot be null; so int to Integer
    }

    private Integer get(Node x , String key){
        if(x == null)   return null;

        int c = key.compareTo(x.key);
        if(c == 0)    return x.value;
        else if(c<0)  return get(x.left,key);
        else    return get(x.right,key);
    }

    public void put(String key,Integer value){
        root = put(root,key,value);
    }

    private Node put(Node x , String key , Integer value){
        if(x == null){
            return new Node(key, value);
        }
        int c = key.compareTo(x.key);
        if(c == 0){
            x.value = value;
        }
        else if(c<0){
            x.left = put(x.left,key,value);
        }
        else{
            x.right = put(x.right,key,value);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("helo1233");
    }


    // public static void main(String[] args)
    // {
        // System.out.println("hello123");     
        // fivebst bst = new fivebst();

        // bst.put("5",3);
        // bst.put("3",5);
        // bst.put("1",6);
        // bst.put("7",3);
        // bst.put("9",1);

        // System.out.println();
        // assert bst.get("7") == 3;
        // assert bst.get("11") == null;
        // assert bst.get("1") == 6;
    // }
}
        // FileReader filereader = new FileReader("./a.txt");
        // BufferedReader br = new BufferedReader(filereader);
        // Integer maxcount = 0;
        // String HFreqWord = "";
        // five_bst bst = new five_bst();

        // while(br.ready()){
        //     String line = br.readLine();
        //     String[] words = line.split(" ");
        //     for(String word:words){
        //         if(word.length() <= 10){
        //             continue;
        //         }
        //         Integer count = bst.get(word);
        //         if(count != null){
        //             bst.put(word, count+1);
        //             if(count+1 > maxcount){
        //                 maxcount = count+1;
        //                 HFreqWord = word;
        //             }
        //         }
        //         else{
        //             bst.put(word, 1);
        //         }
        //     }
        // }
        // System.out.println(HFreqWord + " " + maxcount);
    // }
// }