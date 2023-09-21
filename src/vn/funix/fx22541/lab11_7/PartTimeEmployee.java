package vn.funix.fx22541.lab11_7;

public class PartTimeEmployee extends Employee {

    private final int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}