//jaleel forsythe id 2017002533//
//Mikado Meikle id 2017000955//
//Errol Greenland id 2017001595//
// brian Davis id 2017001804//




package payroll;

public abstract class StaffMember {
    private String firstName;
    private String lastName;
    private String deptNumber;
    private double hoursWorked;

    public StaffMember(String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Department Number: " + getDeptNumber());
        System.out.println("Hours Worked: " + getHoursWorked());
    }
}
