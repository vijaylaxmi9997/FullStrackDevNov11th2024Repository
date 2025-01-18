package com.gentech.Examples;
class Student{
    String sname;
    int sid;
    Student(String sname,int sid){
        this.sname=sname;
        this.sid=sid;
        System.out.println("StudentName:"+sname+"StudentId:"+sid);
    }
    void show()
    {
        System.out.println("StudentName:"+sname+"StudentId:"+sid);
    }
}
public class Demo {
    public static void main(String[] args) {
        Student s1=new Student("ammu",1234);
        s1.show();
    }
}
