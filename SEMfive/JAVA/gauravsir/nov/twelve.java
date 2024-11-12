package semfive.java.gauravsir.nov;

import java.awt.RenderingHints;
import java.io.IOException;

public class twelve <Key extends  Comparable<Key>,Value> {
    class Node
    {
        Key key;
        Value value;
        Node left;
        Node right;
        int count;

        Node(Key key,Value value,Integer count){
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
            this.count = count;
        }
    }

    Node root;
    twelve(){
        this.root = null;
    }

    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node x, Key key){
        if(x == null)   return null;
        int c = key.compareTo(x.key);
        if(c==0)    return x.value;
        else if(c<0)    return get(x.left,key);
        else    return get(x.right,key);
    }

    public void put(Key key,Value value){
        root = put(root,key,value);
    }

    private Node put(Node x,Key key,Value value){
        if(x == null){
            return new Node(key, value , 1);
        }
        int c = key.compareTo(x.key);
        if(c==0){
            x.value = value;
        }
        else if(c<0){
            x.left = put(x.left, key, value);
        }
        else{
            x.right = put(x.right, key, value);
        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public Key floor(Key key){
        Node x = floor(key,root);
        if(x == null){
            return null;
        }
        else{
            return x.key;
        }
    }

    private Node floor(Key key,Node x){
        if(x == null)   return null;
        int c = key.compareTo(x.key);

        if(c == 0)  return x;
        else if(c<0){
            return floor(key, x.left);
        }
        Node t = floor(key,x.right);
        if(t == null){
            return x;
        }
        else{
            return t;
        }
    }

    public int size()
    {
        return size(root);
    }

    private int size(Node root){
        if(root == null)    return 0;
        return root.count;
    }

    // public int size(Node root){
    //     if(root == null)    return 0;
    //     return size(root.left) + size(root.right) + 1;
    // }

    public int rank(Key key){
        Node x = rank(key,root);
        return root.count - x.count;
    }

    private Node rank(Key key,Node x){
        if(x == null)    return root;
        int c = key.compareTo(x.key);
        if(c == 0)  return x;
        if(c<0){
            return rank(key,x.right);
        }
        else{
            Node t = rank(key, x.right);
            if(t == null){
                return x;
            }
            else{
                return t;
            }
        }
    }

    public Key ceil(Key key){
        Node x = ceil(key,root);
        return x.key;
    }

    private Node ceil(Key key,Node root){
        if(root == null)    return null;
        int c = key.compareTo(root.key);
        if(c == 0){
            return root;
        }
        else if(c<0){
            Node t = ceil(key, root.left);
            if(t==null){
                return root;
            }
            else{
                return t;
            }
        }
        else{
            Node t = ceil(key,root.right);
            if(t == null){
                return root;
            }
            else{
                return t;
            }
        }
    }

    //main
    public static void main(String[] args) throws IOException
    {
        twelve<Integer,Integer> bst = new twelve<Integer,Integer>();
        // System.out.println("hello123");
        bst.put(5,3);
        bst.put(3,5);
        bst.put(1,6);
        bst.put(7,3);
        bst.put(9,1);
        bst.put(10,1);

        System.out.println();
        System.out.println();
        // System.out.println(bst.floor(101));
        // System.out.println(bst.size());
        // System.out.println(bst.rank(10));
        System.out.println(bst.ceil(11));

        // twelve<String,Integer> bst_1 = new twelve<String,Integer>();
        // try{
        //     FileReader filereader = new FileReader("semfive\\java\\gauravsir\\nov\\a.txt");
        //     BufferedReader br = new BufferedReader(filereader);
        //     Integer maxcount = 0;
        //     String HFreqWord = "";

        //     while(br.ready()){
        //         String line = br.readLine();
        //         String[] words = line.split(" ");
        //         for(String word:words){
        //             if(word.length() <= 10){
        //                 continue;
        //             }
        //             Integer count = bst.get(word);
        //             if(count != null){
        //                 bst.put(word, count+1);
        //                 if(count+1 > maxcount){
        //                     maxcount = count+1;
        //                     HFreqWord = word;
        //                 }
        //             }
        //             else{
        //                 bst.put(word, 1);
        //             }
        //         }
        //     }
        //     System.out.println(HFreqWord + " " + maxcount);
        // }
        // catch(Exception e){
        //     // 
        //     System.out.println("Catch exception");
        // }
    }
}



// class A implements Comparable<A>{
//     int x;
//     public int compareTo(A y){
//         if(x == y.x)    return 0;
//         else if( x < y.x) return -1;
//         else    return 1;
//     }
// }

// public class twelve <Key extends  Comparable<Key>,Value> {
//     class Node
//     {
//         Key key;
//         Value value;
//         Node left;
//         Node right;

//         Node(Key key,Value value){
//             this.key = key;
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     Node root;
//     twelve(){
//         this.root = null;
//     }

//     public Value get(Key key){
//         return get(root,key);
//     }

//     private Value get(Node x, Key key){
//         if(x == null)   return null;
//         int c = key.compareTo(x.key);
//         if(c==0)    return x.value;
//         else if(c<0)    return get(x.left,key);
//         else    return get(x.right,key);
//     }

//     public void put(Key key,Value value){
//         root = put(root,key,value);
//     }

//     private Node put(Node x,Key key,Value value){
//         if(x == null){
//             return new Node(key, value);
//         }
//         int c = key.compareTo(x.key);
//         if(c==0){
//             x.value = value;
//         }
//         else if(c<0){
//             x.left = put(x.left, key, value);
//         }
//         else{
//             x.right = put(x.right, key, value);
//         }
//         return x;
//     }
//     public static void main(String[] args) {
//         twelve<A,Integer> bst = new twelve<A,Integer>();

//     }
// }
