package com.gentech.TestInterfacesInheritancesDemo;
// three class
class Order
{
    void shownetprice(int price )
    {
        System.out.println(" Order netpices is:"+price);
    }
}
class Oderitems extends Order
{
    void shownetprice(int price )
    {
        super.shownetprice(price);
        System.out.println("order items names:"+price);
    }
}
class Invoices extends Oderitems
{
    void shownetprice(int price , int oiprice)
    {
        super.shownetprice(oiprice);
        System.out.println("invoices netpeices:"+price);

    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Invoices o=new  Invoices();
        o.shownetprice(20000);

    }
}
