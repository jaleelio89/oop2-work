package payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + baseSalary;
    }

    @Override
    public void writeToFile() throws IOException {
        FileWriter writer = new FileWriter("paystub.txt", true);
        writer.write("Base plus commission for: " + getFirstName() + " " + getLastName() + "\n");
        writer.write("Amount: $" + getPaymentAmount() + "\n");
        writer.write("Date: " + LocalDate.now() + "\n\n");
        writer.close();
    }
}
