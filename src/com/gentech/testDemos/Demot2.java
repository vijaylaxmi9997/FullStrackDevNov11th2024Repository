package com.gentech.testDemos;

// ClassA with instance variables, static variables, instance method, and static method
class ClassAs {
    // Instance variables
    int instanceVar1;
    int instanceVar2;

    // Static variables
    static int staticVar1;
    static int staticVar2;

    // Constructor to initialize instance variables
    public ClassAs(int var1, int var2)
    {
        instanceVar1 = var1;
        instanceVar2 = var2;
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method called!");
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method called!");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
}

// ClassB with a constructor that accesses methods and variables of ClassA
class ClassBs {
    public ClassBs() {
        // Creating an instance of ClassA and accessing instance variables and methods
        ClassAs objA = new ClassAs(10, 20);  // Creating an object of ClassA and initializing instance variables
        objA.instanceMethod();  // Calling the instance method

        // Accessing static variables and methods of ClassA
        ClassAs.staticVar1 = 100;  // Setting static variable
        ClassAs.staticVar2 = 200;  // Setting static variable
        ClassAs.staticMethod();  // Calling static method
    }
}

public class Demot2 {
    public static void main(String[] args)
    {
        // Create an object of ClassB, which will invoke the constructor and execute the methods
        ClassBs objB = new ClassBs();
    }
}
