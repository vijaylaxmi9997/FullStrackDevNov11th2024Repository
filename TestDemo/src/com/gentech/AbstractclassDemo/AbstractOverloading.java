package com.gentech.AbstractclassDemo;
abstract class Students
{
    Students(String fname,int id)
    {
        System.out.println("StudentFirstname:"+fname);
        System.out.println("StudentId:"+id);
    }
    Students(String course)
    {
        System.out.println("CourseName:"+course);
    }
    Students(int phonenumber,String loc)
    {
        System.out.println("phonenumner:"+phonenumber+"Location:"+loc);
    }
}
class Colleges extends Students
{
    Colleges(String name,int sid,String fname,int id)
    {
        super(fname,id);
        System.out.println("College name:"+name);
        System.out.println("collges Id:"+sid);
    }
    Colleges(String course)
    {
        super(course);
    }
    Colleges(int phonenumber,String loc)
    {
        super( phonenumber,loc);
    }
}
public class AbstractOverloading {
    public static void main(String[] args) {
        Colleges o=new Colleges("vtu college",3245,"Aisu",21);
        Colleges o1=new Colleges("mca");
        Colleges o2=new Colleges(80883232,"musure");

    }
}
