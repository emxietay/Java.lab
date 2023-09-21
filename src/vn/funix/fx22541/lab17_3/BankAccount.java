package vn.funix.fx22541.lab17_3;

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
        lock.lock();
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposit " + amount + " remaining balance: " + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();

        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance - amount > 0) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " with " + amount + " remaining balance: " + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
