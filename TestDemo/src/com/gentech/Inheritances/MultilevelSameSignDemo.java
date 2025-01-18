package com.gentech.Inheritances;
//same methode name and sign multilevel inheritaces constructor
class Person
{
    String name;
    int personId;
    double age;
    Person(String name, int personId, double age)
    {
        this.name = name;
        this.personId = personId;
        this.age = age;
    }
    void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Person ID: " + personId);
        System.out.println("Age: " + age);
    }
}

class Student extends Person
{
    String studentId;

    Student(String name, int personId, double age, String studentId) {
        super(name, personId, age);
        this.studentId = studentId;
    }

    void showStudentDetails() {
        showPersonDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class Graduate extends Student {
    String thesisTopic;

    Graduate(String name, int personId, double age, String studentId, String thesisTopic)
    {
        super(name, personId, age, studentId);
        this.thesisTopic = thesisTopic;
    }
    void showGraduateDetails() {
        showStudentDetails();
        System.out.println("Thesis Topic: " + thesisTopic);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Undergraduate extends Student {
    String major;
    Undergraduate(String name, int personId, double age, String studentId, String major)
    {
        super(name, personId, age, studentId);
        this.major = major;
    }

    void showUndergraduateDetails() {
        showStudentDetails();
        System.out.println("Major: " + major);
    }
}

public class MultilevelSameSignDemo {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("John Doe", 201, 24.0, "G12345", "AI");
        Undergraduate undergraduate = new Undergraduate("Eramma", 202, 20.0, "U12345", "Computer Science");

        graduate.showGraduateDetails();
        undergraduate.showUndergraduateDetails();
    }
}

