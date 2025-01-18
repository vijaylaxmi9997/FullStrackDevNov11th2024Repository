package com.gentech.testDemos;
// First class with two static methods
class ClassA {
    // Static method 1
    static void staticMethod1()
    {
        System.out.println("Static Method 1 called in ClassA!");
    }

    // Static method 2
    static void staticMethod2() {
        System.out.println("Static Method 2 called in ClassA!");
    }
}

// Second class with a constructor that calls static methods from ClassA
class ClassB {
    // Constructor
    public ClassB() {
        // Calling static methods of ClassA inside the constructor of ClassB
        ClassA.staticMethod1();  // Call to staticMethod1
        ClassA.staticMethod2();  // Call to staticMethod2
    }
}
public class Demot1 {
    public static void main(String[] args) {
        // Create an instance of ClassB which will invoke its constructor
        // and consequently call the static methods from ClassA
        ClassBs objB = new ClassBs();
    }
}
