package com.gentech.testDemos;

// Class A with an instance method and an instance block
class ClassAx {
    // Instance block (executed when an object of ClassA is created)
    {
        System.out.println("Instance Block of Class A Executed");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method of Class A Executed");
    }
}

// Class B with a static block
class ClassBx {
    // Static block (executed when ClassB is loaded)
    static {
        System.out.println("Static Block of Class B Executed");

        // Create an object of ClassA inside the static block to invoke instance block and method
        ClassAx objA = new ClassAx(); // This triggers the instance block of ClassA
        objA.instanceMethod();  // This invokes the instance method of ClassA
    }
}

public class Demot7 {
    public static void main(String[] args) {
        // Main method, creating ClassB will trigger the static block of ClassB
        ClassBx objB = new ClassBx();
    }
}
