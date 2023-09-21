package vn.funix.fx22541.lab10_10;

public class Account {
    private final int id;
    private String name;
    private int balance = 0;


    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("That amount exceeds your current balance.");
            return;
        }
        this.balance -= amount;
    }

    public void display() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }
}
