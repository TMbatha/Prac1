package EmployeeClass;

/**
 * Employee.java 04/02/2024
 *
 * @author Thabiso Mbatha
 */
public class Employee {

    //Private Variables
    private String empName, empSurname, empNumber;
    private double empSalary;

    //Constructor without parameters
    public Employee() {//default constructor
    }

    //Constructor with paramerters
    public Employee(String inName, String inSurname, String inNum, double inSalary) {//overloaded constructor
        this.empName = inName;
        this.empSurname = inSurname;
        this.empNumber = inNum;
        this.empSalary = inSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void increaseSalary(double amount){
        System.out.println("Salary Percentage Increase: " + amount + "%");
        empSalary = empSalary + (empSalary * amount/100);
        System.out.println("New Salary: " + empSalary);
    }
    
    //toString method is used to represent an object in a string format
    @Override
    public String toString(){
        return "\nEmployee Name: " + empName + 
                "\nEmplopyee Surname: " + empSurname + 
                "\nEmployee Number: " + empNumber + 
                "\nEmployee Salary: R" + empSalary + "\n";
    }
}
