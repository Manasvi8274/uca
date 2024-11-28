package semfive.java.rohitsir.nov;

//100 person bank ac no,balance

class Bank{
    int account_number;
    int balance;

    Bank(){
        this.balance = 0;
    }

    public void Depositor(int money){
        this.balance+=money;
    }

    public void withdraw(int money) throws java.lang.Exception{
        if(money >this.balance){
            this.balance -= money;
        }
        else{
            Thread.sleep(2000);
            if(this.balance > money){
                this.balance-=money;
            }
            else{
                System.out.println("Execution stopped");
                return;
            }
        }
    }
}

class MyThread extends Thread{
    public Bank b;
    int times;

    MyThread(int account_number ,int balance){
        this.b.account_number = account_number;
        this.b.balance = balance;
        this.times = 10;
    }

    public void run(){
        for(int i=0;i<times;i++){
            this.b.Depositor((int)(Math.random()*100000));
            this.b.withdraw((int)(Math.random()*100000));
        }
    }
}

class twentysix{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int account_number=sc.nextInt();
        MyThread[] t = new MyThread[10];
        for(int i=0;i<10;i++){
            t[i] = new MyThread();
        }
        // System.out.println("\n\n" + (int)(Math.random()*100000));
    }
}



// class Counter{
//     int count;
//     Counter(){
//         count=0;
//     }
//     // public void increment(){
//     //     count++;
//     // }
//     public synchronized void increment(){
//         count++;
//     }
// }

// class MyThread extends Thread{
//     public Counter counter;
//     int times;

//     MyThread(Counter counter){
//         this.counter = counter;
//         this.times = 10000000;
//     }

//     public void run(){
//         for(int i=0;i<times;i++){
//             this.counter.increment();
//         }
//     }
// }


// public class twentysix{
//     public static void main(String[] args) throws java.lang.Exception{
//         // Counter c = new Counter();
//         // for(int i=0;i<1000000000;i++){
//         //     c.increment();
//         // }

//         Counter counter =new Counter();
//         MyThread[] thread = new MyThread[10];
//         for(int i=0;i<10;i++){
//             thread[i] = new MyThread(counter);
//             thread[i].start();
//             // thread[i].join();//if we do this then no parallel
//         }
        
//         for(int i=0;i<10;i++){
//             thread[i].join();
//         }
//         System.out.println("\n\n"+counter.count);
//     }
// }



// class MyThread extends Thread{
//     public void run(){
//         System.out.println("hlo");
//     }
// }

// public class twentysix{
//     public static void main(String[] args){
//         MyThread mythread = new MyThread();
//         mythread.run();
//     }
// }

//// three types for a thread class -> 1.implements Runnable(interface) , 2.start, 3.extends class and override run method;
 
 
 
 
 
// class MyRunnable implements Runnable{
//     public void run(){
//         System.out.println("hlo");
//     }
// }

// public class twentysix{
    // static int count = 0;//generally because of variable scope as a new varibla will create a new scope but if a global variable then present everywhere
    // public static void main(String[] args) throws java.lang.Exception {
    //     Thread t = new Thread(()->{
    //         for(int i=0;i<1000;i++){
    //             count++;
    //         }
    //     });
    //     t.start();
    //     t.join();
    //     System.out.println("\n\n"+count);
    // }
    // public static void main(String[] args){
    //     System.out.println("\n");
    //     // Thread t = new Thread(()->{System.out.println("hlo");});
    //     // t.start();
    //     Thread t = new Thread(new MyRunnable());
    //     t.start();
    // }
// }
