package com.gentech.Examples;
class Students{
    Students(String fname,int id){
        System.out.println("StudentFirstname:"+fname);
        System.out.println("StudentId:"+id);
    }
    Students(String course){
        System.out.println("CourseName:"+course);
    }
    Students(int phonenumber,String loc){
        System.out.println("phonenumner:"+phonenumber+"Location:"+loc);
    }
}
public class ConstructorOverloadings {
    public static void main(String[] args) {
        Students s1=new Students("vijju",20);
        Students s2=new Students("Mca");
        Students s3=new Students(987564332,"vijaynagar");

    }
}
