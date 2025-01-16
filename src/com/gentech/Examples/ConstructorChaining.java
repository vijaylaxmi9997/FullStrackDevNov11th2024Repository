package com.gentech.Examples;
class Employees{
    Employees(String ename,int id)
    {
        System.out.println("Employeename:"+ename+"EmployeeId:"+id);
    }
    Employees(String loc)
    {
        System.out.println("Location:"+loc);
    }
    Employees(int Sallary,String date)
    {
        System.out.println("Sallary:"+Sallary+ "SallaryDate:"+date);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Employees e1=new Employees("Umra",123);
        Employees e2=new Employees("bengalur");
        Employees e3=new Employees(450000,"12/06/2025");
    }
}
