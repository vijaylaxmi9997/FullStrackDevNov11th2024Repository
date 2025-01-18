package com.gentech.testDemos;

// Class A with an instance method and a static method
class ClassAm {
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method of Class A Executed");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method of Class A Executed");
    }
}

// Class B with a constructor
class ClassBg {
    // Constructor of ClassB
    public ClassBg() {
        System.out.println("Constructor of Class B Executed");

        // Create an object of ClassA to call the instance method
        ClassAm objA = new ClassAm();
        objA.instanceMethod();  // This invokes the instance method of ClassA

        // Directly call the static method of ClassA
        ClassAm.staticMethod();  // This invokes the static method of ClassA
    }
}

public class Demot9 {
    public static void main(String[] args) {
        // Create an object of ClassB, which will trigger the constructor of ClassB
        ClassBg objB = new ClassBg();
    }
}
