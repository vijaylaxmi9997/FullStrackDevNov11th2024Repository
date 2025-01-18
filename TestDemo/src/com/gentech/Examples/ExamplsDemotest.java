package com.gentech.Examples;
class MyClass
{
    int age;
     MyClass()
     {
         age=21;
        System.out.println("No-argument constructor called!");
         System.out.println(+age);
     }
     void instanceMethod()
     {
        System.out.println("Instance method called!");
     }
}
public class ExamplsDemotest {
    public static void main(String[] args)
    {
        MyClass myObject = new MyClass();
        myObject.instanceMethod();
    }
}
