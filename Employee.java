public class Employee {
    private String empName;
    private int empId;
    private String company; // Changed from "Company" to "company" (follow Java naming conventions)
    private double salary;

    // Constructor
    public Employee(String empName, int empId, String company, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.company = company; // Assign to the correct field
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empId=" + empId + ", company=" + company + ", salary=" + salary + "]";
    }

    // Getter and Setter methods
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCompany() { // Changed from getDepartment to getCompany
        return company;
    }

    public void setCompany(String company) { // Changed from setDepartment to setCompany
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}