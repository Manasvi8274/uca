
public class thread_08_24 {
    public static void main(String[] args){
        //shared list - owner is main/parent thread
        //3 threads - shared list

        // shared_list l;
        // t=fork(list_insert(l,1)); // thread work parrallelly only goes to next when fork_is_done
        // wait(t) ; //join , fork join
        // print (l)
        
        // l
        // t=fork(list_insert(l,1));
        // t2=fork(list_insert(l,3));
        // list_insert(l,3) // only with main_thread
        // wait(t);
        // wait(t2);
        // print(l); // [1,2,3] , [3,2,1] , [1,3,2] etc.

        // list_insert(shared_list l , int i){
        //      l.addi();
        // } 
        
        // l = 5->6->7->null
        // t=fork(list_insert(l,1));
        // t2=fork(list_insert(l,3));
        // list_insert(l,3) // only with main_thread
        // wait(t);
        // wait(t2);

        // list_insert(shared_list l , int i){
            //  index = free_index(l); -->all three are at this line of code but all can execute simultaneously 
        //      l[index] = i;
        // } 
        
        // print(l);// 5->6->7->1 or 5->6->7->2 or 5->6->7->3 //as thread are not synchronising;
    }
}
