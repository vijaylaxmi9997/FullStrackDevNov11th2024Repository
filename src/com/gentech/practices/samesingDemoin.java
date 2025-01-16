package com.gentech.practices;


class Students {
    String name;

    void displayStudentName() {
        System.out.println("Student name: " + name);
    }
}

class Courses extends Students {
    String name;

    Courses(String name) {
        super.name = name;
    }

    void ShowCourseName() {
        System.out.println("Course name: " + name);
    }
}

class SubjectMark extends Courses {
    String name;

    SubjectMark(String name) {
        super(name);  // Calling Course constructor
    }

    void ShowSubjectName() {
        System.out.println("Subject name: " + name);  // Referring to this class' name
    }
}

public class samesingDemoin {
    public static void main(String[] args) {
        // Creating an object of SubjectMarks class
        SubjectMark o = new SubjectMark("Maths");

        // Assigning values to name in different classes
        o.name = "Vijju";
        o.name="mca";// This refers to the name variable in SubjectMarks class

        // Print output from each class
        o.ShowSubjectName();  // Refers to name in SubjectMarks class
        o.ShowCourseName();   // Refers to name in Course class
        o.displayStudentName();  // Refers to name in Student class
    }
}
