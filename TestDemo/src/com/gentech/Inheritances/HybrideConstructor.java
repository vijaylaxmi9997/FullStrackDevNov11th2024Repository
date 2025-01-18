package com.gentech.Inheritances;
//Hybride consttuctor and instances variable with methode
class Prog1
{
    int UnitPrice=12;
    String PaymentStatus="phonepay";
    {
        System.out.println("UnitPrice of prod:"+UnitPrice);
        System.out.println("PaymentStatus is:"+PaymentStatus);
    }
    Prog1( String PName,int ProductID )
    {
        System.out.println("Product name:"+PName);
        System.out.println("ProductId:"+ProductID);
    }
    Prog1( int ReorderLevel)
    {
        System.out.println(" ReorderLevel Prod:"+ReorderLevel);
    }
    void ProdName(String PurchaseDate,int TotalAmount)
    {
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Totala Amount:"+TotalAmount);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

}
class  Prog2 extends  Prog1
{
    String salenames;
    Prog2(String pname,int productID,String salename)
    {
        super(pname,productID);
        salenames=salename;
        System.out.println("Salesman name is:"+salenames);
    }
    Prog2(int reorderLevel)
    {
        super( reorderLevel);
    }
}
class  Prog3 extends  Prog1
{
    int orderno;
    Prog3(String pname,int productID,int onubers )
    {
        super(pname,productID);
        orderno=onubers;
        System.out.println("Sales product order is:"+onubers);
    }
    Prog3(int reorderLevel)
    {
        super(reorderLevel);
    }

}
class Prog4 extends Prog3
{
    String loc;
    Prog4(String pname,int productID,int reorderLevel,int onubers,String location)
    {
        super(pname,productID,onubers);
        loc=location;
        System.out.println("sales location:"+loc);
    }
    Prog4(int reorderLevel)
    {
        super(reorderLevel);
    }

}

public class HybrideConstructor {
    public static void main(String[] args) {

        Prog4 o1=new Prog4("laptop",786,2,10,"vijaynagar");
        Prog4 o=new Prog4(3);
        o1.ProdName("10/04/2002",9900000);

        Prog2 o2=new Prog2("iphone",77,"ammu");
        o2.ProdName("10/11/2002",98600);

    }
}
