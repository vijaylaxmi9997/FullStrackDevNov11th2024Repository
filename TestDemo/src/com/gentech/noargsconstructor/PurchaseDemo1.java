package com.gentech.noargsconstructor;

public class PurchaseDemo1 {
    public static void main(String[] args) {
        Purchase p1=new Purchase();
        Sales s1=new Sales();
        Inventory I1=new Inventory();
    }
    
}
class Purchase{
    String PName;
    String PurchaseDate;
    int ProductID ;
    int Quantity ;
    int UnitPrice;
    int TotalAmount;
    String PaymentStatus ;
    Purchase()
    {
        PName="notebooks";
        PurchaseDate="12/02/2002";
        ProductID=11 ;
        Quantity=10 ;
        UnitPrice=20;
        TotalAmount=200;
        PaymentStatus="cash";
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Purchaseproductname:"+PName);
        System.out.println("ProductId:"+ProductID);
        System.out.println("Quantity:"+Quantity);
        System.out.println("UnitPrice:"+UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        PName="Earphone";
        PurchaseDate="16/02/2002";
        ProductID=11 ;
        Quantity=9;
        UnitPrice=80;
        TotalAmount=640;
        PaymentStatus="cash";
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Purchaseproductname:"+PName);
        System.out.println("ProductId:"+ProductID);
        System.out.println("Quantity:"+Quantity);
        System.out.println("UnitPrice:"+UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        PName="phone";
        PurchaseDate="16/07/2002";
        ProductID=15 ;
        Quantity=8;
        UnitPrice=8000;
        TotalAmount=60040;
        PaymentStatus="cash";
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Purchaseproductname:"+PName);
        System.out.println("ProductId:"+ProductID);
        System.out.println("Quantity:"+Quantity);
        System.out.println("UnitPrice:"+UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        PName="laptop";
        PurchaseDate="16/12/2002";
        ProductID=44 ;
        Quantity=7;
        UnitPrice=70;
        TotalAmount=777640;
        PaymentStatus="Phonepay";
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Purchaseproductname:"+PName);
        System.out.println("ProductId:"+ProductID);
        System.out.println("Quantity:"+Quantity);
        System.out.println("UnitPrice:"+UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        PName="Mobile";
        PurchaseDate="16/02/2003";
        ProductID=16 ;
        Quantity=13;
        UnitPrice=80900;
        TotalAmount=6000040;
        PaymentStatus="phonepay";
        System.out.println("PurchaseDate:"+PurchaseDate);
        System.out.println("Purchaseproductname:"+PName);
        System.out.println("ProductId:"+ProductID);
        System.out.println("Quantity:"+Quantity);
        System.out.println("UnitPrice:"+UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
class Sales{
    String salesName;
    String SalesDate;
    int ProductID ;
    int Quantity ;
    int UnitPrice;
    int TotalAmount;
    String PaymentStatus;
    Sales()
    {
        salesName="notebooks";
        SalesDate="12/03/2002";
        ProductID=1 ;
        Quantity=10 ;
        UnitPrice=20;
        TotalAmount=200;
        PaymentStatus="cash";
        System.out.println("ProductName:"+salesName);
        System.out.println("SalesDate:"+SalesDate);
        System.out.println("ProductId:"+ ProductID);
        System.out.println("Quantity:"+ Quantity);
        System.out.println("UnitPrice:"+ UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        salesName="Phones";
        SalesDate="12/04/2002";
        ProductID=12;
        Quantity=16 ;
        UnitPrice=20000;
        TotalAmount=2789700;
        PaymentStatus="phonepay";
        System.out.println("ProductName:"+salesName);
        System.out.println("SalesDate:"+SalesDate);
        System.out.println("ProductId:"+ ProductID);
        System.out.println("Quantity:"+ Quantity);
        System.out.println("UnitPrice:"+ UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        salesName="Bags";
        SalesDate="26/04/2002";
        ProductID=19;
        Quantity=14;
        UnitPrice=2890;
        TotalAmount=40000;
        PaymentStatus="phonepay";
        System.out.println("ProductName:"+salesName);
        System.out.println("SalesDate:"+SalesDate);
        System.out.println("ProductId:"+ ProductID);
        System.out.println("Quantity:"+ Quantity);
        System.out.println("UnitPrice:"+ UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        salesName="Tabs";
        SalesDate="14/04/2012";
        ProductID=17;
        Quantity=10;
        UnitPrice=28990;
        TotalAmount=7000300;
        PaymentStatus="phonepay";
        System.out.println("ProductName:"+salesName);
        System.out.println("SalesDate:"+SalesDate);
        System.out.println("ProductId:"+ ProductID);
        System.out.println("Quantity:"+ Quantity);
        System.out.println("UnitPrice:"+ UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        salesName="iPhones";
        SalesDate="24/07/2002";
        ProductID=13;
        Quantity=13 ;
        UnitPrice=6750;
        TotalAmount=675000;
        PaymentStatus="phonepay";
        System.out.println("ProductName:"+salesName);
        System.out.println("SalesDate:"+SalesDate);
        System.out.println("ProductId:"+ ProductID);
        System.out.println("Quantity:"+ Quantity);
        System.out.println("UnitPrice:"+ UnitPrice);
        System.out.println("TotalPrice:"+TotalAmount);
        System.out.println("PaymentStatus:"+PaymentStatus);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++=");
    }
}
class Inventory{
    int ProductID;
    String ProductName;
    int QuantityInStock;
    int ReorderLevel;
    int UnitPrice;
     Inventory()
     {
         ProductID=12;
         ProductName="notebooks";
         QuantityInStock=19;
         ReorderLevel=20;
         UnitPrice=150;
         System.out.println("ProductId:"+ProductID);
         System.out.println("ProductName:"+ProductName);
         System.out.println("QuantityInStoke:"+QuantityInStock);
         System.out.println("ReorderLevel:"+ReorderLevel);
         System.out.println("UnitPrice:"+UnitPrice);
         ProductID=14;
         ProductName="vivobooks";
         QuantityInStock=12;
         ReorderLevel=10;
         UnitPrice=150090;
         System.out.println("ProductId:"+ProductID);
         System.out.println("ProductName:"+ProductName);
         System.out.println("QuantityInStoke:"+QuantityInStock);
         System.out.println("ReorderLevel:"+ReorderLevel);
         System.out.println("UnitPrice:"+UnitPrice);
         ProductID=19;
         ProductName="notebooks";
         QuantityInStock=11;
         ReorderLevel=24;
         UnitPrice=789900;
         System.out.println("ProductId:"+ProductID);
         System.out.println("ProductName:"+ProductName);
         System.out.println("QuantityInStoke:"+QuantityInStock);
         System.out.println("ReorderLevel:"+ReorderLevel);
         System.out.println("UnitPrice:"+UnitPrice);
         ProductID=13;
         ProductName="notebooks";
         QuantityInStock=18;
         ReorderLevel=10;
         UnitPrice=15000000;
         System.out.println("ProductId:"+ProductID);
         System.out.println("ProductName:"+ProductName);
         System.out.println("QuantityInStoke:"+QuantityInStock);
         System.out.println("ReorderLevel:"+ReorderLevel);
         System.out.println("UnitPrice:"+UnitPrice);
         ProductID=16;
         ProductName="notebooks";
         QuantityInStock=18;
         ReorderLevel=2;
         UnitPrice=12000;
         System.out.println("ProductId:"+ProductID);
         System.out.println("ProductName:"+ProductName);
         System.out.println("QuantityInStoke:"+QuantityInStock);
         System.out.println("ReorderLevel:"+ReorderLevel);
         System.out.println("UnitPrice:"+UnitPrice);
         System.out.println("+++++++++++++++++++++++++++++++++++++=");
     }

}