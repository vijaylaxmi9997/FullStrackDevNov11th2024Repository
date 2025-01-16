package com.gentech.parameterconstructor;

import javax.lang.model.element.Name;

class Purchase {
    String PName;
    String PurchaseDate;
    int ProductID;
    int Quantity;
    int UnitPrice;
    int TotalAmount;
    String PaymentStatus;

    Purchase(String name,String purchaseDate,int productID,int quantity,int unitPrice,int totalAmount,String paymentStatus)
    {
        PName = name;
        PurchaseDate = purchaseDate;
        ProductID = productID;
        Quantity = quantity;
        UnitPrice = unitPrice;
        TotalAmount = totalAmount;
        PaymentStatus = paymentStatus;
        System.out.println("PurchaseDate:" + PurchaseDate);
        System.out.println("Purchaseproductname:" + PName);
        System.out.println("ProductId:" + ProductID);
        System.out.println("Quantity:" + Quantity);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("TotalPrice:" + TotalAmount);
        System.out.println("PaymentStatus:" + PaymentStatus);
    }
}
class Sales {
    String salesName;
    String SalesDate;
    int ProductID;
    int Quantity;
    int UnitPrice;
    int TotalAmount;
    String PaymentStatus;

    Sales(String Name,String salesDate,int productiD,int quantity,int Unitprice,int totalAmount,String paymentStatus)
    {
        salesName = Name;
        SalesDate = salesDate;
        ProductID = productiD;
        Quantity = quantity;
        UnitPrice = Unitprice;
        TotalAmount = totalAmount;
        PaymentStatus = paymentStatus;
        System.out.println("ProductName:" + salesName);
        System.out.println("SalesDate:" + SalesDate);
        System.out.println("ProductId:" + ProductID);
        System.out.println("Quantity:" + Quantity);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("TotalPrice:" + TotalAmount);
        System.out.println("PaymentStatus:" + PaymentStatus);
    }
}
class Inventory {
    int ProductID;
    String ProductName;
    int QuantityInStock;
    int ReorderLevel;
    int UnitPrice;

    Inventory(int Prodid,String ProdName,int quantityInStock,int Reorderlevel,int unitprice)
    {
        ProductID =Prodid;
        ProductName = ProdName;
        QuantityInStock = quantityInStock;
        ReorderLevel =Reorderlevel;
        UnitPrice = unitprice;
        System.out.println("ProductId:" + ProductID);
        System.out.println("ProductName:" + ProductName);
        System.out.println("QuantityInStoke:" + QuantityInStock);
        System.out.println("ReorderLevel:" + ReorderLevel);
        System.out.println("UnitPrice:" + UnitPrice);
    }
}
public class PurchaseDemo3 {
    public static void main(String[] args) {
        Purchase p1=new Purchase("kari","12/06/1996",8,6,230,6000,"cash");
        Sales s1=new Sales("Asha","10/04/2022",6,9,400,40000,"phonepay");

        Inventory I1=new Inventory(5,"books",4,5,60);



    }
}
