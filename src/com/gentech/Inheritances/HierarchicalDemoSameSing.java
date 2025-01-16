package com.gentech.Inheritances;
//same methode and same sing
class Employees {
    String name;
    int employeeId;
    double salary;

    Employees(String name, int employeeId, double salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    void ShowEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employees
{
    String department;
    Manager(String name, int employeeId, double salary, String department)
    {
        super(name, employeeId, salary);
        this.department = department;
    }
    public void printManagerDetails()
    {
        ShowEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Developer extends Employees
{
    String programmingLanguage;
    Developer(String name, int employeeId, double salary, String programmingLanguage)
    {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void printDeveloperDetails()
    {
        ShowEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class HierarchicalDemoSameSing {
    public static void main(String[] args) {

        Manager manager = new Manager("Jane Smith", 102, 80000.00, "HR");
        Developer developer = new Developer("Alice Johnson", 103, 75000.00, "Java");

        System.out.println("Manager Details:");
        manager.printManagerDetails();

        System.out.println("Developer Details:");
        developer.printDeveloperDetails();
    }
}
