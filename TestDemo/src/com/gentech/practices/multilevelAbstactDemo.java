package com.gentech.practices;

abstract class CollegesD
{
    abstract void ShowCollegesName(String name);
    abstract void ShowCityName(String name);
    void showCourseNames(String[] course) {
        for (int i = 0; i < course.length; i++) {
            System.out.println("Course name: " + course[i]);
        }
    }
}
class Lvdcolleges extends CollegesD {
    void ShowCollegesName(String name) {
        System.out.println("College name: " + name);
    }

    void ShowCityName(String name) {
        System.out.println("City name: " + name);
    }

    void ShowAddress(String address) {
        System.out.println("Address of college: " + address);
    }
}

class ResearchCollege extends Lvdcolleges
{
    void ShowResearchPrograms(String[] programs)
    {
        for (String program : programs)
        {
            System.out.println("Research Program: " + program);
        }
    }
}

public class multilevelAbstactDemo  {
    public static void main(String[] args) {
        ResearchCollege o = new ResearchCollege();

        o.ShowAddress("9th Main, 5th Cross, Vijayanagar");
        o.ShowCityName("Bengaluru");
        o.ShowCollegesName("LvD College Bengaluru");
        o.showCourseNames(new String[] { "MCA", "PUC", "MCom", "Degree", "ETC" });

        o.ShowResearchPrograms(new String[] { "AI Research", "Data Science", "Machine Learning" });
    }
}
