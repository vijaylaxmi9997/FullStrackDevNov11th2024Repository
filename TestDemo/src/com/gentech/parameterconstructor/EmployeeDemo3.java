package com.gentech.parameterconstructor;
class Employee {
    String EmpName;
    int empId;
    int sallary;
    int deptNo;
    int Age;

    Employee(String name,int Id,int sal, int Dno, int age)
    {
        EmpName = name;
        Age = age;
        empId =Id;
        sallary = sal;
        deptNo = Dno;
        System.out.println("EmployeeName:" + EmpName);
        System.out.println("EmployeeAge:" + Age);
        System.out.println("EmployeeId:" + empId);
        System.out.println("EmployeeSallary:" + sallary);
        System.out.println("EmployeeDept:" + deptNo);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
class Department {
    int deptNo;
    String name;
    String loc;
    String mang_name;
    int deptEmployeeNo;

    Department(int dNo,String fname,String location,String mgr_name, int deptEmpNo) {
        deptEmployeeNo =deptEmpNo;
        loc = location;
        deptNo = dNo;
        name = fname;
        mang_name = mgr_name;
        System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
        System.out.println("Deptlocation:" + loc);
        System.out.println("Deptname:" + name);
        System.out.println("DeptManeger:" + mang_name);
        System.out.println("DeptNumber:" + deptNo);
        System.out.println("++++++++++++++++++++++++++++++++++++++++=");
    }
}
public class EmployeeDemo3 {
    public static void main(String[] args) {
        Employee E1=new   Employee("Asha",11,14000,2,22);
        Employee E2=new Employee("Dosti",12,48000,22,30);

        Department D1=new Department(12,"Goutom","bengalur","Sudeep",44);
        Department D2=new Department(3,"Krishna","vijaynager","V.sonu",7);
    }
}

