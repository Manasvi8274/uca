package semfive.java.gauravsir.sept;

// import java.util.*;

public class priority_q {

    public static class priorityq{
        private Integer[] pq;
        private int n;//initialised to 0
        
        public priorityq(int capacity){
            pq = new Integer[capacity+1];
        }

        public void insert(int x){
            pq[++n] = x;
            swim(n);
        }
        
        public Integer delMax(){
            Integer max = pq[1];
            pq[1] = pq[n--];
            pq[n]=null;//to avoid loitering.cannot be reclaimed
            sink(1);
            return max;
        }

        public boolean isEmpty(){
            return n==0;
        }
        
        public Integer size(){
            return n;
        }

        public void exch(int i,int j){
            int temp = pq[i];
            pq[i]=pq[j];
            pq[j]=temp;
        }

        public void swim(int k){
            while(k>1){
                int j=k/2;
                if(pq[j]>=pq[k])    break;
                exch(j, k);
                k=j;
            }
        }

        public void sink(int k){
            while(2*k<=n){
                int j = 2*k;
                if(j < n && pq[j] < pq[j+1])    j++;//to change to larger or only child
                if(pq[k] >= pq[j])  break;
                exch(k,j);
                k=j;
            }
        }
        public void print(){
            for(int i=1;i<n;i++){
                System.out.println(pq[i]);
            }
        }
    
    }

    public static void main(String[] args) {
        priorityq pQueue = new priorityq(10);
        pQueue.insert(10);
        pQueue.insert(9);
        pQueue.insert(7);
        pQueue.insert(11);

        // pQueue.print();

        // assert pQueue.delMax() == 11;

        pQueue.insert(16);
        pQueue.insert(13);
        pQueue.insert(8);
        pQueue.print();

    }
}
