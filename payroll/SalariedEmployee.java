package payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class SalariedEmployee extends Employee implements Payable {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public void writeToFile() throws IOException {
        FileWriter writer = new FileWriter("paystub.txt", true);
        writer.write("Salaried payment for: " + getFirstName() + " " + getLastName() + "\n");
        writer.write("Amount: $" + getPaymentAmount() + "\n");
        writer.write("Date: " + LocalDate.now() + "\n\n");
        writer.close();
    }
}

