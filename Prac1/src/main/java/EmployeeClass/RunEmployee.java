package EmployeeClass;

import java.util.Scanner;

/**
 * RunEmployee.java 04/02/2024
 *
 * @author Thabiso Mbatha
 */
public class RunEmployee {

    public static void main(String[] args) {

        //Default constructor Employee object
        System.out.println("Default Constructor employee");
        Employee emp1 = new Employee();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        emp1.setEmpName(scanner.next());

        System.out.println("Enter Employee Surname: ");
        emp1.setEmpSurname(scanner.next());

        System.out.println("Enter Employee Number: ");
        emp1.setEmpNumber(scanner.next());

        System.out.println("Enter Employee Salary: ");
        emp1.setEmpSalary(scanner.nextDouble());

        System.out.println(emp1.toString());

        //Overloaded constructor employee object
        System.out.println("Overloaded Constructor employee");

        Employee emp2;
        String name, surname, number;
        double salary;

        System.out.println("Enter Employee Name: ");
        name = scanner.next();

        System.out.println("Enter Employee Surname: ");
        surname = scanner.next();

        System.out.println("Enter Employee Number: ");
        number = scanner.next();

        System.out.println("Enter Employee Salary: ");
        salary = scanner.nextDouble();

        emp2 = new Employee(name, surname, number, salary);

        System.out.println(emp2.toString());
        
        //Salary Increase
        System.out.println("Salary Increase");
        
        System.out.println("Enter Percentage increase for the employees: ");
        double percentageIncrease = scanner.nextDouble();
        emp1.increaseSalary(percentageIncrease);
        emp2.increaseSalary(percentageIncrease);
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
