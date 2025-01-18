package com.gentech.Examples;
interface University
{
    abstract void showUniversityName(String name);
}
interface college
{
    void showcourseName(String course[]);
}
class RgmCollege implements University, college
{
    public void showUniversityName(String name)
    {
        System.out.println("University name:"+name);
    }
    public void showcourseName(String course[])
    {
        for (int i=0;i<course.length; i++)
        {
            System.out.println("course name:" + course[i]);
        }
    }
    public void showAddress(String address)
    {
        System.out.println("address of the college:"+address);
    }

}
class Rammas extends RgmCollege
{
    public void Domms(String name,String course[],String address,String snames)
    {
        super.showAddress(address);
        super.showcourseName(course);
        super.showUniversityName(name);
        System.out.println("Student name:"+snames);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Rammas o=new Rammas();
        o.Domms("vtu university",new String[]{"phd","puc","msa","mcom"},"9th main vijaynagar","vijju");

    }
}
