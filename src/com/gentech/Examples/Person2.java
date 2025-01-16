package com.gentech.Examples;

class Persons {
    String firstname;
    int age;
}
class Birds {
    String Feathercolor;
    int numberofwings;
}
class DomensticAnimal{
    String qualityofmilkprovides;
    String breedName;
}
class Product{
    String productname;
    double price;
}
public class Person2 {
    public static void main(String[] args) {
        Persons p1=new Persons();
        p1.firstname ="Asha";
        p1.age =21;
        System.out.println("Firstname:"+p1.firstname);
        System.out.println("age:"+p1.age);
        System.out.println("++++++++++++++++++++++++++++++++++++=");
        Birds b1=new Birds();
        b1.Feathercolor="Gray color";
        b1.numberofwings=2;
        System.out.println("Feathercolor:"+b1.Feathercolor);
        System.out.println("NumberofWings:"+b1.numberofwings);
        System.out.println("+++++++++++++++++++++++++++++++++++++++=");
        DomensticAnimal d1=new DomensticAnimal();
        d1.qualityofmilkprovides="5 liters";
        d1.breedName="jersey";
        System.out.println("QualityOfmilkProvides:"+d1.qualityofmilkprovides);
        System.out.println("BreedName:"+d1.breedName);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        Product pp=new Product();
        pp.productname="laptop";
        pp.price=500000;
        System.out.println("ProductName:"+pp.productname);
        System.out.println("Price:"+pp.price);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

    }

}
