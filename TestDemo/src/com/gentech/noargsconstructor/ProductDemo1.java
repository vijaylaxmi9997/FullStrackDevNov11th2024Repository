package com.gentech.noargsconstructor;
class Products{
    int ProductID;
    String Category;
    int UnitPrice;
    int StockQuantity;
    Products() {
        ProductID = 1;
        Category = "good";
        UnitPrice = 6;
        StockQuantity = 5;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);
        ProductID = 2;
        Category = "very good";
        UnitPrice = 10;
        StockQuantity = 5;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);
        ProductID = 3;
        Category = "good";
        UnitPrice = 20;
        StockQuantity = 9;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);
        ProductID = 4;
        Category = "ok-ok";
        UnitPrice = 40;
        StockQuantity = 5;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);
        ProductID = 5;
        Category = "good";
        UnitPrice = 50;
        StockQuantity = 9;
        System.out.println("ProductID:" + ProductID);
        System.out.println("category:" + Category);
        System.out.println("UnitPrice:" + UnitPrice);
        System.out.println("StockQuantity:" + StockQuantity);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
class  Order{
    int OrderID;
    int CustomerID;
    String OrderDate;
    int TotalAmount;
    String OrderStatus;
    Order()
    {
        CustomerID = 12;
        OrderDate = "12/9/24";
        OrderID = 11;
        TotalAmount = 3564;
        OrderStatus = "paid";
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
        CustomerID = 18;
        OrderDate = "19/9/2004";
        OrderID = 41;
        TotalAmount = 9864;
        OrderStatus = "paid";
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
        CustomerID = 23;
        OrderDate = "25/9/24";
        OrderID = 71;
        TotalAmount = 7764;
        OrderStatus = "paid";
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
        CustomerID = 62;
        OrderDate = "31/9/24";
        OrderID = 10;
        TotalAmount = 3004;
        OrderStatus = "paid";
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
        CustomerID = 12;
        OrderDate = "12/9/24";
        OrderID = 11;
        TotalAmount = 3564;
        OrderStatus = "paid";
        System.out.println("CustomerID:" + CustomerID);
        System.out.println("OrderID:" + OrderID);
        System.out.println("OrderDate:" + OrderDate);
        System.out.println("TotalAmount:" + TotalAmount);
        System.out.println("OrderStatus:" + OrderStatus);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}
class Shipping {
    int ShippingID;
    int OrderID;
    String ShippingDate;
    String ShippingMethod;

    Shipping() {
        OrderID = 11;
        ShippingDate = "23/05/2002";
        ShippingMethod = "Air";
        ShippingID = 98;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
        OrderID = 21;
        ShippingDate = "23/06/2002";
        ShippingMethod = "Air";
        ShippingID = 67;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
        OrderID = 41;
        ShippingDate = "25/05/2012";
        ShippingMethod = "Air";
        ShippingID = 77;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
        OrderID = 21;
        ShippingDate = "23/09/2019";
        ShippingMethod = "Air";
        ShippingID = 96;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
        OrderID = 34;
        ShippingDate = "27/09/2002";
        ShippingMethod = "Air";
        ShippingID = 73;
        System.out.println("OrderId:" + OrderID);
        System.out.println("ShippingID:" + ShippingID);
        System.out.println("ShippingDate:" + ShippingDate);
        System.out.println("ShippingMethode:" + ShippingMethod);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
public class ProductDemo1 {
    public static void main(String[] args) {
        Products pp = new Products();
        Order obj = new Order();
        Shipping ss = new Shipping();
    }
}
