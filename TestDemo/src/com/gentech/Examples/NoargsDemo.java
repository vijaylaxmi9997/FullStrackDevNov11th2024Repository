package com.gentech.Examples;
class Personal {
    String firstname;
    int age;
    Personal() {
        firstname = "Asha";
        age = 21;
        System.out.println("Firstname:"+firstname);
        System.out.println("age:" +age);
        System.out.println("++++++++++++++++++++++++++++++++++++=");
    }
}
class Bird {
    String Feathercolor;
    int numberofwings;
    Bird()
    {
        Feathercolor = "Gray color";
        numberofwings = 2;
        System.out.println("Feathercolor:" +Feathercolor);
        System.out.println("NumberofWings:" +numberofwings);
        System.out.println("+++++++++++++++++++++++++++++++++++++++=");
    }
}
class DomensticAnimals{
    String qualityofmilkprovides;
    String breedName;
    DomensticAnimals()
    {
        qualityofmilkprovides = "5 liters";
        breedName = "jersey";
        System.out.println("QualityOfmilkProvides:" +qualityofmilkprovides);
        System.out.println("BreedName:" +breedName);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}
class Products{
    String productname;
    double price;
    Products()
    {
        productname = "laptop";
        price = 700000;
        System.out.println("ProductName:"+productname);
        System.out.println("Price:" +price);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
public class NoargsDemo {
    public static void main(String[] args) {
        Personal p1=new Personal();
        Bird b1=new Bird();

        DomensticAnimals d1=new DomensticAnimals();

        Products pp=new Products();


    }
}
