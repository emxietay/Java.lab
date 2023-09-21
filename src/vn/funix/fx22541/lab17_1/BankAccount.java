package vn.funix.fx22541.lab17_1;

public class BankAccount {
    private final String id;
    private double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount) {
        synchronized (this) {

            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposit " + amount + " remaining balance: " + balance);
            }
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            if (balance - amount > 0) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " with " + amount + " remaining balance: " + balance);
            }
        }
    }
}
