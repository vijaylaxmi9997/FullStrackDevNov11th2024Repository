package com.gentech.AbstractclassDemo;
 abstract class College
{
    abstract void showCollegeName(String name);
    abstract void showCityname(String name);
    static void courses(String courses[])
    {
        for(int i=0; i<courses.length; i++)
        {
            System.out.println("Course :"+courses[i]);
        }
    }

}
class LvdCollege extends College
{
    void showCollegeName(String name)
    {
        System.out.println("Colleges name:"+name);
    }
    void showCityname(String name)
    {
        System.out.println("City name:"+name);
    }
    void showAddress(String address)
    {
        System.out.println("address of the college:"+address);
    }
}
class Colllegesnames extends LvdCollege
{
    void CollegeNumbers(String name,String address,String[] courses,int num)
    {
        super.showAddress(address);
        super.showCityname(name);
        super.showCollegeName(name);
        super.courses(courses);
        System.out.println("numbers of college:"+num);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}
public class AbstractclassDemo {
    public static void main(String[] args) {
        Colllegesnames o=new Colllegesnames();
        o.CollegeNumbers("mysure","9th main jayanagar",new  String[] {"pcmb","bsc","b.com","pmcs"},7);
        College.courses(new  String[] {"msc","bsc","m.com","phd","bca"});
        o.showAddress("10 main ,vijaynagar");
        o.showCollegeName("lvg");
        o.showCityname("bengalur");

    }
}
