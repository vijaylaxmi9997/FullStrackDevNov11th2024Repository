package com.gentech.StringDemo;
//toString using the object
class Student
{
    String firstname;
    int age;
    Student(String firstName,int age)
    {
        this.firstname=firstName;
        this.age=age;
    }

    public String toString()
    {
        return "First Name of Student "+firstname+" and age is "+age;
    }
}
public class StringDemo4 {
    public static void main(String[] args) {
        Student obj=new Student("Santosh",21);
        System.out.println(obj);
    }
}
