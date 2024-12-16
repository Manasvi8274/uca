package semfive.java.rohitsir.dec;
import java.util.concurrent.Semaphore;

public class nine {

    Semaphore lock;

    int val;
    nine(){
        val=0;
        lock = new Semaphore(1);
    }

    public void increment(){
        try {
            lock.acquire();
            Thread.sleep(100);
            val++;
        } catch (Exception e) {

        }
        lock.release();
        // else{
        //     System.out.println("\n" + "could not update value" + Thread.currentThread().getName());
        // }
    }

    // public void increment(){
    //     if(lock.tryAcquire()){
    //         try {
    //             Thread.sleep(10);
    //             val++;
    //         } catch (Exception e) {

    //         }
    //         lock.release();
    //     }
    //     else{
    //         System.out.println("\n" + "could not update value" + Thread.currentThread().getName());
    //     }
    // }

    public static void main(String[] args) throws InterruptedException{
        System.out.println("\n");

        nine mt = new nine();
        Thread[] threads = new Thread[100];
        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(()->{
                mt.increment();
            });
            threads[i].start();
        }

        for(int i=0;i<threads.length;i++){
            threads[i].join();
        }
        System.out.println(mt.val);

        
        // for(int i=0;i<threads.length;i++){
        //     threads[i] = new Thread(()->{
        //         System.out.println("hello");//to print hello 1000 times
        //     });
        //     threads[i].start();
        // }

        // System.out.println(mt.val);
        // mt.increment();
        // System.out.println(mt.val);
    }

    // Lock lock;

    // int val;
    // nine(){
    //     val=0;
    //     lock = new ReentrantLock();
    // }

    // public void increment(){
    //     if(lock.tryLock()){
    //         try {
    //             Thread.sleep(1);
    //             val++;
    //         } catch (Exception e) {

    //         }
    //         lock.unlock();
    //     }
    //     else{
    //         System.out.println("\n" + "could not update value" + Thread.currentThread().getName());
    //     }
    // }
}
