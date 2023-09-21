package vn.funix.fx22541.lab17_4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private final String id;
    private final Lock lock;
    private double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
        lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (amount > 0) {
                        balance += amount;
                        System.out.println(Thread.currentThread().getName() + " deposit " + amount + " remaining balance: " + balance);
                    }
                } finally {
                    lock.unlock();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(double amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (balance - amount > 0) {
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " with " + amount + " remaining balance: " + balance);
                    }

                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
