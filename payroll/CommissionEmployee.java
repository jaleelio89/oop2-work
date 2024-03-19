package payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CommissionEmployee extends Employee implements Payable {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }

    @Override
    public void writeToFile() throws IOException {
        FileWriter writer = new FileWriter("paystub.txt", true);
        writer.write("Commission for: " + getFirstName() + " " + getLastName() + "\n");
        writer.write("Amount: $" + getPaymentAmount() + "\n");
        writer.write("Date: " + LocalDate.now() + "\n\n");
        writer.close();
    }
}
