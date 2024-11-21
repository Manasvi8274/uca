package codeforces;

public class div_2_21nov_virtual {
    class Node{
        Integer key;
        Node left;
        Node right;
        Node(Integer key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    Node root = null;

    public Node put(Integer key){
        return put(root,key);
    }

    private Node put(Node x,Integer key){
        if(x == null){
            return new Node(key);
        }
        int cmp = key.compareTo(x.key);
        if(cmp == 0){
            
        }
    }

    public static void main(String[] args) {
    }
}
