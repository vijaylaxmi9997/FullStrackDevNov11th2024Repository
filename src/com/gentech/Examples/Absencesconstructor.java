package com.gentech.Examples;
class Customer {
    Customer(String name, String location){
        System.out.println("Custo_name:"+name);
        System.out.println("Location:"+location);
    }
}
public class Absencesconstructor {
    public static void main(String[] args) {
        Customer c1=new Customer("chaitu","bidar");
    }
}
