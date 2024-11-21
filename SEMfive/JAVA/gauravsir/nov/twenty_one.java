import java.util.*;


public class twenty_one{
    //LEFT LEANING RED BLACK TREES:
        // SO ONLY LEFT NODE ARE RED IF RLRB THEN RIGHT NODE ONLY RED BUT NOW LLRB
    class Node<K,V>{
        K key;
        Node left;
        Node right;
        boolean color;//1 byte
        // either it is RED(YES) or BLACK(NO) 
    }

    private Node rotateleft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = true;
        return x;
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
