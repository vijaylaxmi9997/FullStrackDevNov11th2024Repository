package com.gentech.TestInterfacesInheritancesDemo;
//5
interface  University1
{
    abstract void showUniversityname(String name);
}
interface Classname
{
    void Showname(String batchname);
}
interface colleges extends University1,Classname
{
    void showcousrse(String courses[]);
}
class Demossa1 implements colleges
{
    public void showUniversityname(String name)
    {
        System.out.println("University name is:"+name);
    }
    public void showcousrse(String courses[])
    {
        for(int i=0; i<courses.length; i++)
        {
            System.out.println("course name:"+courses[i]);
        }
    }
    public  void ShowAddress(String address)
    {
        System.out.println("Address of college :"+address);
    }

    public  void Showname(String batchname)
    {
        System.out.println("class name"+batchname);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Demossa1 o=new  Demossa1();
        o.ShowAddress("7th main vijaynaagar");
        o.Showname("A batch");
        o.showcousrse(new String[] {"mca ","bsc"});
        o.showUniversityname("Akkamahadevi");
    }
}
