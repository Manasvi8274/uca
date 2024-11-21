


public class twenty_one<Key extends  Comparable<Key>,Value>{
    //LEFT LEANING RED BLACK TREES:
        // SO ONLY LEFT NODE ARE RED IF RLRB THEN RIGHT NODE ONLY RED BUT NOW LLRB

    class Node{
        Key key;
        Value val;
        Node left;
        Node right;
        boolean color;//1 byte
        // either it is RED(YES) or BLACK(NO) 
        Node(Key key,Value val,boolean c){
            this.key = key;
            this.val = val;
            this.color = c;
        }
    }

    Node root;
    twenty_one(){
        this.root = null;
    }

    private boolean isRed(Node h){
        if(h.color == true){
            return true;
        }
        return false;
    }

    public Node put(Key key,Value val){
        return put(root,key,val);
    }

    private Node put(Node h,Key key , Value val){
        if(h == null){
            return new Node (key,val,true);
        }
        int cmp = key.compareTo(h.key);
        if(cmp == 0){
            h.val = val;
        }
        else if(cmp < 0)    h.left = put(h.left,key,val);
        else    h.right = put(h.right,key,val);
        if(isRed(h.right) && !isRed(h.left))    h = rotateleft(h);
        if(isRed(h.left) && isRed(h.right))    h = flip(h);
        if(isRed(h.left) && isRed(h.left.left)) h = rotateright(h);
        return h;
    }

    private Node rotateleft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = true;
        return x;
    }

    private Node rotateright(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = true;
        return x;
    }

    private Node flip(Node h){
        h.left.color = false;
        h.right.color = false;
        return h;
    }

    public Value get(Key key){
        Node x = get(root,key);
        if(x == null)   return null;
        return x.val;
    }

    private Node get(Node h,Key key){
        if(h == null)   return null;
        int cmp = key.compareTo(h.key);
        if(cmp == 0){
            return h;
        }
        else if(cmp <0){
            return h.left = get(h.left,key);
        }
        else{
            return h.right = get(h.right,key);
        }
    }
}

// notes:-
// Average height  = 1.39 log(base=2,value=N)
// Balanced Trees : -  
    // AVL Trees
    // RED BLACK: -
            // LEFT LEANING RED BLACK(mostly)
            // RIGHT LEANING RED BLACK
// conceptual things
    // 2 node = a node with 2 links (y->x , y->z)
    // 3 node = a node with 3 links (E,T ->A(left smaller than E) , E,T -> P(middle P>E and P<T) , E,T ->X(right X>T))
    // whenever a node is converting into 4 node ie with possible 4 node we conver it into 2 or 3 node by taking mibble element as root for the other nodes
   
// HEIGHT :--
    // WORST CASE - LOG(base =2,value=N)
    // BEST CASE - 0.631*LOG(base =2,value=N)

// LEFT LEANING RED BLACK TREE
