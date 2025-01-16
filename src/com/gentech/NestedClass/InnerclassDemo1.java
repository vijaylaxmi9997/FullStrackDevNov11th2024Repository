package com.gentech.NestedClass;

class OuterClassDemo1
{
    String AccountHoldername;
    int Amount;
    InnerClasses o = new InnerClasses();

    private class InnerClasses
    {
        String BankName="IcIc";
        int accountnumber=1234578;
        String name="Aishu";
        {
            System.out.println("BankName"+BankName);
            System.out.println("Accountnumber:"+accountnumber);
            System.out.println("Nomines name:"+name);
        }
    }
}
public class InnerclassDemo1 {
    public static void main(String[] args) {
        OuterClassDemo1 o2 =new OuterClassDemo1();
        o2.AccountHoldername="Vijaylaxmi";
        o2.Amount=560000;
        System.out.println("Account Holder name:"+ o2.AccountHoldername);
        System.out.println("Amount :"+ o2.Amount);


    }

}

