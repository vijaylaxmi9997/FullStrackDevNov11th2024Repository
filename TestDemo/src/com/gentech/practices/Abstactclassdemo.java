package com.gentech.practices;
abstract class collges
{
    abstract void Showcollegesname(String name);
    abstract  void Showcityname(String name);
    void showCousenames(String course[])
    {
        for(int i=0; i<course.length; i++)
        {
            System.out.println("course name:"+course[i]);
        }
    }
}
class  Lvdcollege extends collges
{
    void Showcollegesname(String name) {
        System.out.println("colleges name:"+name);
    }

    void Showcityname(String name) {
        System.out.println("city name:"+name);
    }
    void ShowAddress(String address)
    {
        System.out.println("Address of college :"+address);
    }
}
public class Abstactclassdemo {
    public static void main(String[] args) {
        Lvdcollege o=new Lvdcollege();
        o.ShowAddress("9th main 5th cross vijaynagar");
        o.Showcityname("bengalur");
        o.Showcollegesname("LvD college Bengalur");
        o.showCousenames(new String[] {"mca","puc","mcom","degree","ect"});
    }
}
