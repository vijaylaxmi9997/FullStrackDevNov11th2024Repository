package com.gentech.testDemos;

// Class A with instance block and static block
class ClassA2 {
    // Static block (executed when the class is loaded)
    static {
        System.out.println("Static Block of Class A Executed");
    }

    // Instance block (executed when an object of ClassA is created)
    {
        System.out.println("Instance Block of Class A Executed");
    }

    // Constructor for ClassA
    public ClassA2() {
        System.out.println("Constructor of Class A Executed");
    }
}

// Class B with a parameterized constructor
class ClassB2 {
    // Parameterized constructor
    public ClassB2(int value) {
        System.out.println("Parameterized Constructor of Class B Executed with value: " + value);

        // Create an object of ClassA, triggering its static and instance blocks
        ClassA2 objA = new ClassA2();  // This will execute static and instance blocks of ClassA
    }
}

public class Demot6 {
    public static void main(String[] args) {
        // Create an object of ClassB using the parameterized constructor
        ClassB2 objB = new ClassB2(10);
    }
}
