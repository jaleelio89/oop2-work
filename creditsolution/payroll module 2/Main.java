package payroll;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Doe", "123", 40, 1000);
        SalesRep salesRep = new SalesRep("Alice", "Smith", "456", 35, 500);

        manager.display();
        System.out.println();
        salesRep.display();

        System.out.println("\nSalaries:");
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Sales Rep Salary: " + salesRep.calculateSalary());

        ArrayList<StaffMember> staffList = new ArrayList<>();
        staffList.add(new SalesRep("Eva", "Johnson", "789", 30, 600));
        staffList.add(new SalesRep("David", "Brown", "101", 42, 700));
        staffList.add(new SalesRep("Grace", "Miller", "202", 38, 550));
        staffList.add(new SalesRep("Isaac", "Williams", "303", 45, 800));
        staffList.add(new SalesRep("Jaleel", "Forsythe", "505", 36, 600));
        staffList.add(new SalesRep("Mikado", "Meikle", "606", 39, 700));
        staffList.add(new SalesRep("Errol", "Greenland", "707", 41, 750));
        staffList.add(new SalesRep("Brian", "Davis", "808", 37, 720));

        System.out.println("\nUpdated Sales Representatives List:");
        for (StaffMember staff : staffList) {
            staff.display();
            System.out.println("Salary: " + staff.calculateSalary());
            System.out.println();
        }
    }
}

