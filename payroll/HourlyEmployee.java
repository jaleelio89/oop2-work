package payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class HourlyEmployee extends Employee implements Payable {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wage * hours;
    }

    @Override
    public void writeToFile() throws IOException {
        FileWriter writer = new FileWriter("paystub.txt", true);
        writer.write("Hourly payment for: " + getFirstName() + " " + getLastName() + "\n");
        writer.write("Amount: $" + getPaymentAmount() + "\n");
        writer.write("Date: " + LocalDate.now() + "\n\n");
        writer.close();
    }
}
