package com.gentach.ConstructorOverloading;
class Employee {
    Employee (String name,int id,double salary)
    {
        System.out.println("EmpName:"+name+"Eid:"+id+"sallary:"+salary);
    }
    Employee(String lacotion)
    {
        System.out.println("location:"+lacotion);
    }
    Employee(int phonenumber,String gender)
    {
        System.out.println("EmpNumber:"+phonenumber+"Gender:"+gender);

    }
}
public class Employees {
    public static void main(String[] args) {

      Employee e1=new Employee("vijay",6,5000);
        Employee e2=new Employee ("vijayanagar");
        Employee e3=new Employee(907886036,"male");
    }
}

