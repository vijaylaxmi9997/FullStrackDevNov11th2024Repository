package com.gentech.Inheritances;
//
class Program
{
    void Showfirstnamedemo(String firstname, int age)
    {
        System.out.println("Firstname: " + firstname);
        System.out.println("Age: " + age);
    }
    void Displaythenames(String lastname, int phonenumber)
    {
        System.out.println("Lastname: " + lastname);
        System.out.println("Phonenumber: " + phonenumber);
    }
}

class Program2 extends Program
{
    String address;
    Program2(String address, String firstname, int age)
    {
        super.Showfirstnamedemo(firstname, age);
        this.address = address;
        System.out.println("Address: " + this.address);
    }
    Program2(String lastname, int phonenumber) {
        super.Displaythenames(lastname, phonenumber);
    }
    void ShowBestFriendDetails(String fname, int age)
    {
        System.out.println("Best Friend's Name: " + fname);
        System.out.println("Best Friend's Age: " + age);
    }
}

class Program3 extends Program2
{
    String fullname;
    int pincode;
    Program3(String address, String fullname, int pincode, String firstname, int age, String bestFriendName)
    {
        super(address, firstname, age);
        this.fullname = fullname;
        this.pincode = pincode;
        System.out.println("Fullname: " + this.fullname);
        System.out.println("Pincode: " + this.pincode);
        ShowBestFriendDetails(bestFriendName, 25);
    }
}

public class MultilevelSign {
    public static void main(String[] args) {
        Program3 o = new Program3("Bijapur", "Ashaammu", 456738, "Ashu", 22, "Priya");

        o.Displaythenames("Dosti", 80886543);
        o.Showfirstnamedemo("Ammu", 20);

    }
}
