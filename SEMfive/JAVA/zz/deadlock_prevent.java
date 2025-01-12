import java.util.concurrent.locks.ReentrantLock;

public class deadlock_prevent {

    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            acquireLocksInOrderedWay(lock1, lock2);
        });

        Thread thread2 = new Thread(() -> {
            acquireLocksInOrderedWay(lock2, lock1);
        });

        thread1.start();
        thread2.start();
    }

    private static void acquireLocksInOrderedWay(ReentrantLock lock1, ReentrantLock lock2) {
        lock1.lock();
        try {
            // Critical section using lock1
            System.out.println(Thread.currentThread().getName() + " acquired lock1, trying to acquire lock2");
            lock2.lock();
            try {
                // Critical section using both lock1 and lock2
                System.out.println(Thread.currentThread().getName() + " acquired both locks");
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    }
}