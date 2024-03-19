//jaleel forsythe id 2017002533//
//Mikado Meikle id 2017000955//
//Errol Greenland id 2017001595//
// brian Davis id 2017001804//
package payroll;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("123", "Widget", 5, 10.0);
            CommissionEmployee commissionEmployee = new CommissionEmployee("John", "Doe", "123-45-6789", 5000, 0.05);
            HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", "987-65-4321", 15, 40);
            SalariedEmployee salariedEmployee = new SalariedEmployee("James", "Johnson", "567-89-0123", 1000);
            BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michael", "Brown", "345-67-8901", 10000, 0.07, 500);

            invoice.writeToFile();
            commissionEmployee.writeToFile();
            hourlyEmployee.writeToFile();
            salariedEmployee.writeToFile();
            basePlusCommissionEmployee.writeToFile();

            System.out.println("Pay stubs generated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

