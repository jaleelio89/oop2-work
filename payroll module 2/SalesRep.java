package payroll;

public class SalesRep extends StaffMember {
    private double allowance;

    public SalesRep(String firstName, String lastName, String deptNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return (getHoursWorked() * 1500) + allowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
        System.out.println("Salary: " + calculateSalary());
    }
}
