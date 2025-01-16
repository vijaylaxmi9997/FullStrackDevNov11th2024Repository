package com.gentech.Examples;
class nameDemo
{
    void dis(String name)
    {
        System.out.println("my name is :"+name);
    }
   String  getname(String name)
    {
        return name;
    }
}
public class ProgramsDemo {
    public static void main(String[] args) {
        nameDemo o1=new nameDemo();
        o1.dis("vijaylaxmi");
        String v1=o1.getname("Ammu");
        System.out.println(v1);
    }
}
