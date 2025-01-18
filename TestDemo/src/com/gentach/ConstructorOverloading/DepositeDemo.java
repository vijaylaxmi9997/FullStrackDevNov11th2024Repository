package com.gentach.ConstructorOverloading;
class Deposite{
    Deposite(String dep_name,String loc, int phonenumber)
    {
        System.out.println("DepositorName:"+dep_name+ "Location:"+loc+ "Depositornumber:"+phonenumber);
    }
    Deposite(int accountnumber,int amount)
    {
        System.out.println("DepositorAccount:"+accountnumber+ "Totalamount:"+amount);
    }
    Deposite(String date)
    {
        System.out.println("DepositeDate:"+date);
    }
}
public class DepositeDemo {
    public static void main(String[] args) {
        Deposite d1=new  Deposite("Sonu","bijapur",90885436);
        Deposite d2=new  Deposite(2345688,600000000);
        Deposite d3=new   Deposite("25/09/2024");
    }
}
