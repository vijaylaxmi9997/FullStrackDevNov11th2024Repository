package com.gentech.parameterconstructor;
class Products {
    int ProductID;
    String Category;
    int UnitPrice;
    int StockQuantity;

    Products(int Pid,String category,int unitPrice,int stockQuantity) {
        ProductID = Pid;
        Category = category;
        UnitPrice = unitPrice;
        StockQuantity = stockQuantity;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);
    }
}
class  Order {
    int OrderID;
    int CustomerID;
    String OrderDate;
    int TotalAmount;
    String OrderStatus;

    Order(int orderID,int customerID,String orderDate,int totalAmount,String orderStatus)
    {
        CustomerID = customerID;
        OrderDate = orderDate;
        OrderID = orderID;
        TotalAmount = totalAmount;
        OrderStatus = orderStatus;
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
    }
}
class Shipping {
    int ShippingID;
    int OrderID;
    String ShippingDate;
    String ShippingMethod;

    Shipping(int shippingID,int orderiD,String shippingDate,String shippingMethod)
    {
        OrderID =orderiD;
        ShippingDate = shippingDate;
        ShippingMethod =shippingMethod;
        ShippingID = shippingID;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
    }
}
public class PruductDemo3 {
    public static void main(String[] args) {
        Products p1=new  Products(12,"good",5,7);
        Order o1=new Order(2,243,"24/12/2019",56000,"cash");
        Shipping s1=new Shipping(98,7,"12/08/2001","Air");

    }
}
