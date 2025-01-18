package com.gentech.practices;
class Xx
{
    void Emp(String name, int age)
    {
        System.out.println("Employee name:"+name);
        System.out.println("Employee age:"+age);
    }
}
class Yy extends Xx
{
    void Dept(int dno, String dname)
    {
        System.out.println("Dept name:"+dname);
        System.out.println("Dept number:"+dno);
    }
}
class Zz extends Xx
{
    void Employee(int sal, String loc)
    {
        System.out.println("Employee Salary:"+sal);
        System.out.println("Employee location:"+loc);
    }
}
public class Hirarchicaldemo {
    public static void main(String[] args) {
        Zz o=new Zz();
        o.Employee(35000,"vijaynagar");
        o.Emp("Aishu",22);

        Yy o1=new Yy();
        o1.Dept(2,"research");
        o1.Emp("vijju",22);
    }
}
