public class Employee {
    public String name;
    public double salary;
    public String designation;
    public double tax = 0.0;

    public void newEmployee(String empName) {
        this.name = empName;
        salary = 30000.0;
        designation = "junior";
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Designation: " + this.designation);
    }

    public void calculateTax() {
        if (salary <= 30000) {
            System.out.println("No need to pay Tax");
        } else if (salary > 30000 && salary < 50000) {
            this.tax = salary * 0.1;
        } else {
            this.tax = salary * 0.3;
        }
        System.out.println(this.name + " Tax Amount: " + this.tax);
    }

    public void promoteEmployee(String position) {
        this.designation = position;
        if (designation.equals("senior")) {
            this.salary += 25000.0;
        } else if (designation.equals("lead")) {
            this.salary += 50000.0;
        } else if (designation.equals("manager")) {
            this.salary += 75000.0;
        }
        System.out.println(this.name + " has been promoted to " + this.designation);
        System.out.println("New salary: " + this.salary);
    }
}