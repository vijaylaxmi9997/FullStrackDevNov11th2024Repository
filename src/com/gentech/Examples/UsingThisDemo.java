package com.gentech.Examples;
class Personal2 {
    String firstname;
    int age;
    Personal2(String name,int Age){
        this.firstname=name;
        this.age=Age;
        System.out.println("Fullname:"+firstname);
        System.out.println("Age:"+Age);
    }
    void show()
    {
        System.out.println("fullname:"+firstname);
        System.out.println("Age:"+age);
    }
}

public class UsingThisDemo {
    public static void main(String[] args) {
        Personal2 obj=new Personal2("vijaylaxmi",21);
        Personal2 ob=new Personal2("Aishu",22);
        obj.show();
    }
    
}
