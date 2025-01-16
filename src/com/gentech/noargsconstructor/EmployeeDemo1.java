package com.gentech.noargsconstructor;
class Employee{
    String EmpName;
    int empId;
    int sallary;
    int deptNo;
    int Age;
    Employee()
    {
            EmpName = "Asha";
            Age = 21;
            empId = 1;
            sallary = 20000;
            deptNo = 11;
            System.out.println("EmployeeName:" + EmpName);
            System.out.println("EmployeeAge:" + Age);
            System.out.println("EmployeeId:" + empId);
            System.out.println("EmployeeSallary:" + sallary);
            System.out.println("EmployeeDept:" + deptNo);
            EmpName = "Aishu";
            Age = 22;
            empId = 2;
            sallary = 25000;
            deptNo = 12;
            System.out.println("EmployeeName:" +EmpName);
            System.out.println("EmployeeAge:" + Age);
            System.out.println("EmployeeId:" + empId);
            System.out.println("EmployeeSallary:" +sallary);
            System.out.println("EmployeeDept:" +deptNo);
            EmpName = "vijju";
            Age = 23;
            empId = 3;
            sallary = 30000;
            deptNo = 13;
            System.out.println("EmployeeName:" + EmpName);
            System.out.println("EmployeeAge:" + Age);
            System.out.println("EmployeeId:" + empId);
            System.out.println("EmployeeSallary:" +sallary);
            System.out.println("EmployeeDept:" + deptNo);
            EmpName = "Umra";
            Age = 24;
            empId = 4;
            sallary = 35000;
            deptNo = 14;
            System.out.println("EmployeeName:" + EmpName);
            System.out.println("EmployeeAge:" + Age);
            System.out.println("EmployeeId:" + empId);
            System.out.println("EmployeeSallary:" +sallary);
            System.out.println("EmployeeDept:" +deptNo);
            EmpName = "Sana";
            Age = 25;
            empId = 5;
            sallary = 50000;
            deptNo = 15;
            System.out.println("EmployeeName:" +EmpName);
            System.out.println("EmployeeAge:" +Age);
            System.out.println("EmployeeId:" +empId);
            System.out.println("EmployeeSallary:" +sallary);
            System.out.println("EmployeeDept:" +deptNo);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}
class Department {
        int deptNo;
        String name;
        String loc;
        String mang_name;
        int deptEmployeeNo;
        Department()
        {
            deptEmployeeNo = 11;
            loc = "Vijaynagar";
            deptNo = 1;
            name = "resarch";
            mang_name = "k.s.krishna";
            System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
            System.out.println("Deptlocation:" + loc);
            System.out.println("Deptname:" + name);
            System.out.println("DeptManeger:" + mang_name);
            System.out.println("DeptNumber:" + deptNo);
            deptEmployeeNo = 13;
            loc = "VijaynagarMetro";
            deptNo = 2;
            name = "sales";
            mang_name = "r.j ram";
            System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
            System.out.println("Deptlocation:" + loc);
            System.out.println("Deptname:" + name);
            System.out.println("DeptManeger:" + mang_name);
            System.out.println("DeptNumber:" + deptNo);
            deptEmployeeNo = 13;
            loc = "jayanagar";
            deptNo = 3;
            name = "parcharge";
            mang_name = "s.v rao";
            System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
            System.out.println("Deptlocation:" + loc);
            System.out.println("Deptname:" + name);
            System.out.println("DeptManeger:" + mang_name);
            System.out.println("DeptNumber:" + deptNo);
            deptEmployeeNo = 14;
            loc = "Vijaynagarnear";
            deptNo = 4;
            name = "Accountent";
            mang_name = "a.s ammu";
            System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
            System.out.println("Deptlocation:" + loc);
            System.out.println("Deptname:" + name);
            System.out.println("DeptManeger:" + mang_name);
            System.out.println("DeptNumber:" + deptNo);
            deptEmployeeNo = 15;
            loc = "Vijaynagar";
            deptNo = 15;
            name = "Goods store";
            mang_name = "s.v sonu";
            System.out.println("DeptEmployeeNo:" + deptEmployeeNo);
            System.out.println("Deptlocation:" + loc);
            System.out.println("Deptname:" + name);
            System.out.println("DeptManeger:" + mang_name);
            System.out.println("DeptNumber:" +deptNo);
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
        }
}
class Insurance {
        int employee_id;
        String insurance_provider;
        int policy_number;
        String start_date;
        String end_date;
        Insurance()
        {
            employee_id = 3;
            insurance_provider = "Agents";
            policy_number = 12345;
            start_date = "12/03/2020";
            end_date = "6/01/2024";
            System.out.println("Employee_id:" + employee_id);
            System.out.println("Insurance_provider:" + insurance_provider);
            System.out.println("policy_number:" + policy_number);
            System.out.println("Start_date:" + start_date);
            System.out.println("End_date:" + end_date);
            employee_id = 4;
            insurance_provider = "Employee";
            policy_number = 23456;
            start_date = "12/09/2019";
            end_date = "21/08/2004";
            System.out.println("Employee_id:" + employee_id);
            System.out.println("Insurance_provider:" + insurance_provider);
            System.out.println("policy_number:" + policy_number);
            System.out.println("Start_date:" + start_date);
            System.out.println("End_date:" + end_date);
            employee_id = 2;
            insurance_provider = "Marketers";
            policy_number = 34567;
            start_date = "18/09/2008";
            end_date = "31/03/2003";
            System.out.println("Employee_id:" + employee_id);
            System.out.println("Insurance_provider:" + insurance_provider);
            System.out.println("policy_number:" + policy_number);
            System.out.println("Start_date:" + start_date);
            System.out.println("End_date:" + end_date);
            employee_id = 5;
            insurance_provider = "sales";
            policy_number = 78965;
            start_date = "8/4/2019";
            end_date = "5/6/2005";
            System.out.println("Employee_id:" + employee_id);
            System.out.println("Insurance_provider:" + insurance_provider);
            System.out.println("policy_number:" + policy_number);
            System.out.println("Start_date:" + start_date);
            System.out.println("End_date:" + end_date);
            employee_id = 8;
            insurance_provider = "Customizer";
            policy_number = 445678;
            start_date = "9/6/2001";
            end_date = "3/9/2000";
            System.out.println("Employee_id:" + employee_id);
            System.out.println("Insurance_provider:" + insurance_provider);
            System.out.println("policy_number:" + policy_number);
            System.out.println("Start_date:" + start_date);
            System.out.println("End_date:" + end_date);
        }
}
public class EmployeeDemo1 {
        public static void main(String[] args) {
            Employee Emp = new Employee();

            Department D1 = new Department();

            Insurance I1 = new Insurance();

        }

    }
