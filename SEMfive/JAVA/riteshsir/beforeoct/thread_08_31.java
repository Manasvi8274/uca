package semfive.java.riteshsir.beforeoct;
import java.util.*;
import java.util.jar.Attributes;
import javax.management.RuntimeErrorException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

// public class thread_08_31{
//     private static class ListAdder extends Thread {
//         private final CopyOnWriteArrayList<Integer> list;
//         private final int value;

//         public ListAdder(CopyOnWriteArrayList<Integer> list, int value) {
//             this.list = list;
//             this.value = value;
//         }

//         @Override
//         public void run() {
//             System.out.println(Thread.currentThread().getName() + " is adding some number");
//             this.list.add(value);
//             try {
//                 TimeUnit.SECONDS.sleep(1);
//             } catch (InterruptedException e) {
//                 Thread.currentThread().interrupt();
//             }
//         }
//     }

//     public static void main(String[] args) throws InterruptedException {
//         CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//         Thread t1 = new ListAdder(list, 1);
//         Thread t2 = new ListAdder(list, 2);
//         Thread t3 = new ListAdder(list, 3);
//         Thread t4 = new ListAdder(list, 4);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();

//         // list.add(3);

//         t1.join();
//         t2.join();
//         t3.join();
//         t4.join();

//         System.out.println(list);
//     }
// }
// public class thread_08_31{
//     private static class ListAdder extends Thread {
//         private final CopyOnWriteArrayList<Integer> list;
//         private final int value;

//         public ListAdder(CopyOnWriteArrayList<Integer> list, int value) {
//             this.list = list;
//             this.value = value;
//         }

//         @Override
//         public void run() {
//             // System.out.println(Thread.currentThread().getName() + " is adding some number");
//             // this.list.add(value);
//             //lock mutex
//             synchronized (this.list) {
//                 this.list.add(value);                
//                 try {
//                     TimeUnit.SECONDS.sleep(1);
//                 } catch (InterruptedException e) {
//                     Thread.currentThread().interrupt();
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) throws InterruptedException {
//         CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//         Thread t1 = new ListAdder(list, 1);
//         Thread t2 = new ListAdder(list, 2);
//         Thread t3 = new ListAdder(list, 3);
//         Thread t4 = new ListAdder(list, 4);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();

//         // list.add(3);

//         t1.join();
//         t2.join();
//         t3.join();
//         t4.join();

//         System.out.println(list);
//     }
// }

// public class thread_08_31{
//     private static class ListAdder extends Thread {
//         private final CopyOnWriteArrayList<Integer> list;
//         private final int value;

//         public ListAdder(CopyOnWriteArrayList<Integer> list, int value) {
//             this.list = list;
//             this.value = value;
//         }

//         @Override
//         public void run() {
//             // System.out.println(Thread.currentThread().getName() + " is adding some number");
//             // this.list.add(value);
//             //lock mutex
//             //mutex contain critical section(cause raise condition unexpected result) and non critical section
//             synchronized (this.list) {
//                 this.list.add(value);//critical section
//                 //non critical section
//                 // try {
//                 //     TimeUnit.SECONDS.sleep(1);
//                 // } catch (InterruptedException e) {
//                 //     Thread.currentThread().interrupt();
//                 // }
//             }
//             // synchronized (this.list) {
//             //     this.list.add(value);//critical section
//             //     //non critical section
//             //     // try {
//             //     //     TimeUnit.SECONDS.sleep(1);
//             //     // } catch (InterruptedException e) {
//             //     //     Thread.currentThread().interrupt();
//             //     // }
//             // }
//             try {
//                 TimeUnit.SECONDS.sleep(1);
//             } catch (InterruptedException e) {
//                 Thread.currentThread().interrupt();
//             }
//         }
//     }

//     public static void main(String[] args) throws InterruptedException {
//         long start = System.currentTimeMillis();
//         CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//         Thread t1 = new ListAdder(list, 1);
//         Thread t2 = new ListAdder(list, 2);
//         Thread t3 = new ListAdder(list, 3);
//         Thread t4 = new ListAdder(list, 4);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();

//         // list.add(3);

//         t1.join();
//         t2.join();
//         t3.join();
//         t4.join();

//         System.out.println(list);
//         System.out.println("total time taken = " + (System.currentTimeMillis()-start));
//     }
// }

public class thread_08_31{
    private static class ListAdder extends Thread {
        private final CopyOnWriteArrayList<Integer> list;
        private final int value;

        public ListAdder(CopyOnWriteArrayList<Integer> list, int value) {
            this.list = list;
            this.value = value;
        }

        @Override
        public void run() {
            // System.out.println(Thread.currentThread().getName() + " is adding some number");
            // this.list.add(value);
            //lock mutex
            //mutex contain critical section(cause raise condition unexpected result) and non critical section
            //atomicity is achieved by lock
            synchronized (this.list) {
                this.list.add(value);//critical section
            }
            synchronized (this.list) {
                this.list.add(value);//critical section
            }
            try {
                // TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        Thread t1 = new ListAdder(list, 1);
        Thread t2 = new ListAdder(list, 2);
        Thread t3 = new ListAdder(list, 3);
        Thread t4 = new ListAdder(list, 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // list.add(3);

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(list);
        System.out.println("total time taken = " + (System.currentTimeMillis()-start));
    }
}