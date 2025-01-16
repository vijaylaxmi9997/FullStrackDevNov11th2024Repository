package com.gentech.TestInterfacesInheritancesDemo;
//4
class Students {
    String name;

    void displayStudentName()
    {
        System.out.println("Student name: " + name);
    }
}

class Courses extends Students
{
    String name;

    Courses(String name, String sname) {
        super.name = name;
        super.displayStudentName();
        this.name=sname;
    }
    void displayStudentName()
    {

        System.out.println("Student name: " + name);
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Courses o=new Courses("mca", "Aishu1");
       // o.name="Aishu";
        o.displayStudentName();
    }
}
