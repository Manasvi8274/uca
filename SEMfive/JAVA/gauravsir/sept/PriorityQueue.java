package semfive.java.gauravsir.sept;

import java.util.*;

public class PriorityQueue{
    private Integer[] pq;
    private int n;
    
    public PriorityQueue(int capacity){
        pq = new Integer[capacity+1];
    }

    public void insert(int x){
        pq[++n] = x;
        swim(x);
    }
    
    public Integer delMax(){
        
    }

    public boolean isEmpty(){
        
    }
    
    public Integer size(){
        
    }

    public void swim(){
        
    }

    public void sink(){
        
    }
    
}

public class priorityq {

    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue(10);
        pQueue.insert(10);
        pQueue.insert(9);
        pQueue.insert(7);
        pQueue.insert(11);

        assert pQueue.delMax() == 11;

        pQueue.insert(16);
        pQueue.insert(13);
        pQueue.insert(8);

    }
}
