package semfive.java.gauravsir.nov;

import java.io.*;
import java.util.*;

public class newfivebst {
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
    newfivebst(){
        this.root = null;
    }

    public Integer get(String key){
        return get(root,key);
    }

    private Integer get(Node x, String key){
        if(x == null)   return null;
        int c = key.compareTo(x.key);
        if(c==0)    return x.value;
        else if(c<0)    return get(x.left,key);
        else    return get(x.right,key);
    }

    public void put(String key,Integer value){
        root = put(root,key,value);
    }

    private Node put(Node x,String key,Integer value){
        if(x == null){
            return new Node(key, value);
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
        return x;
    }

    public static void main(String[] args)throws IOException {
        newfivebst bst = new newfivebst();
        try {
            File file = new File("semfive\\java\\gauravsir\\nov\\a.txt");
            Scanner sc = new Scanner(file);
            Integer maxcount=0;
            String hfreqword = "";
            while(sc.hasNext()){
                String data = sc.next();
                if(data.length()<10){
                    continue;
                }
                Integer val= bst.get(data);
                if(val != null){
                    bst.put(data,val+1);
                    if(val+1 > maxcount){
                        maxcount = val+1;
                        hfreqword = data;
                    }
                }
                else{
                    bst.put(data, 1);
                }
            }
            System.out.println(hfreqword + " " + maxcount);

        } catch (Exception e) {
            System.err.println("\n" + "error");
        }
        
        // FileReader filereader = new FileReader("a.txt");
        // BufferedReader br = new BufferedReader(filereader);
        // Integer maxcount = 0;
        // String HFreqWord = "";
        // newfivebst bst = new newfivebst();

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
        // newfivebst bst = new newfivebst();

        // bst.put("5",3);
        // bst.put("3",5);
        // bst.put("1",6);
        // bst.put("7",3);
        // bst.put("9",1);

        // // System.out.println();
        // System.out.println(bst.get("7") == 3);
        // System.out.println(bst.get("11") != null);
        // System.out.println(bst.get("1") == 7);
        // // System.out.println();
    }
}
