package com.gentech.Inheritances;
// parameter constructor
class Students
{
    Students(String name,int sid)
    {
            System.out.println("Student name:"+name);
            System.out.println("Student Id:"+sid);
    }

}
class Course extends Students
{
    String coursenames;
    int courseid;
    Course(String sname, int studentid, String cname,int courseId)
    {
        super(sname,studentid);
        coursenames= cname;
        courseid = courseId;
        System.out.println("Course name:" + coursenames);
        System.out.println("Course Id:" + courseid);
    }
}
class Deptments extends Course
{
    String dname;
    Deptments(String sname, int studentid, String cname,int courseId,String deptname)
    {
        super(sname,studentid,cname,courseId);
        dname=deptname;
        System.out.println("Deparment name is:"+ dname);
    }
}
public class MultileveluseConstructor {
    public static void main(String[] args) {
        Deptments o=new Deptments("vijaylaxmi",35,"mca",12,"Research");
    }
}
