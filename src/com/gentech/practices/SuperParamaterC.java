package com.gentech.practices;

class Employees {
    Employees(String ename, int sallary) {
        System.out.println("Employee name: " + ename);
        System.out.println("Employee salary: " + sallary);
    }
}

class Departments extends Employees {
    String dname;
    Departments(String name, int sal, String deptname) {
        super(name, sal);
        dname = deptname;
        System.out.println("Department name: " + dname);
    }
}
class Emp extends Departments
{
    int eid;
    Emp(String name, int sal, String deptname,int empid)
    {
        super(name,sal,deptname);
        eid=empid;
        System.out.println("Employee id:"+eid);
    }
}
public class SuperParamaterC {
    public static void main(String[] args) {
        Emp o=new Emp("aishu",40000,"HR",10);

    }
}
