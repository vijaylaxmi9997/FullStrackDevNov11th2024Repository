package com.gentech.Examples;

public class Person1 {
    String firstname;
    int age;

    public static void main(String[] args) {
        Persons p1=new Persons();
        p1.firstname="Vijaylaxmi";
        p1.age=21;
        System.out.println("Firstname:"+p1.firstname);
        System.out.println("Age:"+p1.age);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        Persons p2=new Persons();
        p2.firstname="Aishu";
        p2.age=22;
        System.out.println("Firstname:"+p2.firstname);
        System.out.println("Age:"+p2.age);

    }
}
