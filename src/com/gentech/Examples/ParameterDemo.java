package com.gentech.Examples;
class Personals {
    String firstname;
    int age;
    Personals(String name,int Age){
        firstname=name;
        age=Age;
        System.out.println("Firstname:"+firstname+ "Age:"+age);
    }
}
class Birds1 {
    String Feathercolor;
    int numberofwings;
    Birds1(String color, int wings)
    {
        Feathercolor = color;
        numberofwings = wings;
        System.out.println("Feathercolors:"+Feathercolor+"NumberofWings:"+numberofwings);
    }

}
class DomensticAnimal1{
    String qualityofmilkprovides;
    String breedName;
    DomensticAnimal1(String provides,String name)
    {
         qualityofmilkprovides=provides;
         breedName=name;
        System.out.println("QualityofmilkProvides:"+qualityofmilkprovides+ "BreedName:"+breedName);
    }
}
class Product1{
    String productname;
    double price;
    Product1( String names,double Price){
        productname=names;
        price=Price;
        System.out.println("Productname:"+productname+ "Prices:"+Price);
    }
}
public class ParameterDemo {
    public static void main(String[] args) {
        Personals p1=new Personals("Aishu",21);
        Birds1 b1=new Birds1("graycolor",2);
        DomensticAnimal1 d1=new DomensticAnimal1("2 liters","Jersey");
        Product1 pp=new  Product1("laptop",675000);
    }
}
