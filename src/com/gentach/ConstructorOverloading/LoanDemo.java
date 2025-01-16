package com.gentach.ConstructorOverloading;
class Loan{
    Loan(String name,String loc,int AccountNumer)
    {
        System.out.println("CustomerName:" +name+ "Location:"+loc+ "accountNo:"+AccountNumer);
    }
    Loan(int totalamount,String date)
    {
        System.out.println("ToatlAmount:"+totalamount+ "loanDate:"+date);
    }
    Loan(String durationTime,String enddate)
    {
        System.out.println("DurationTime:"+durationTime+ "EndDateofLoan:"+enddate);
    }
}
public class LoanDemo {
    public static void main(String[] args) {
        Loan l1=new Loan("Chinnu","bidar",1298403933);
        Loan l2=new Loan( 4567787,"12/9/2020");
        Loan l3=new Loan("44 month","12/10/2022");
    }
}
