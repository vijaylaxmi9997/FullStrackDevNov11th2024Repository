package com.gentech.Inheritances;
//Herirchical inheritancesDemo
class  Employee
{
    void Employees(String Ename, int Eid)
    {
        System.out.println("Employee name is:"+Ename);
        System.out.println("Emoployee Id:"+Eid);
    }
}
class Department extends Employee
{
    void  Dept(int dno, String dname)
    {
        System.out.println("Department name:"+dname);
        System.out.println("Department number:"+dno);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
class Emp extends Employee
{
    void Demos(int sal, String loc)
    {
        System.out.println("Employee sallary:"+sal);
        System.out.println("Employee Location:"+loc);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Department o=new Department();
        o.Employees("aishu",12);
        o.Dept(4,"research");


        Emp o1=new Emp();
        o1.Employees("Ammu",15);
        o1.Demos(25000,"Bidar");
    }
}
