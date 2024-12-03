package semfive.java.rohitsir.dec;

import java.util.Scanner;

class Bank {
    String accno;
    int balance;

    Bank(String accno, int balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) 
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " credited " + amount + ". New balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance < amount)
        {
             System.out.println(Thread.currentThread().getName() + "Not enough balance to withdraw: ");
             try {
                Thread.sleep(2000);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
             }
        }
        else{
               this.balance = this.balance - amount;
               System.out.println(Thread.currentThread().getName() + "Your remaning balance is " + balance);
        }
    }
}

class Deposit extends Thread {
    Bank pers1;
    Scanner sc = new Scanner(System.in);

    Deposit(Bank obj) {
        this.pers1 = obj;
    }

    public void run() {
        int amount = sc.nextInt();
        pers1.deposit(amount);
    }
}

class Withdrawal extends Thread {
    Bank pers1;
    Scanner sc = new Scanner(System.in);

    Withdrawal(Bank obj) {
        this.pers1 = obj;
    }

    public void run() {
        int amount = sc.nextInt();
        pers1.withdraw(amount);
    }
}

public class two{
    public static void main(String[] args) {
        Bank pers1 = new Bank("8274", 0);

        for (int i = 0; i < 5; i++) {
            new Deposit(pers1).start();
            new Withdrawal(pers1).start();
        }
    }
}
