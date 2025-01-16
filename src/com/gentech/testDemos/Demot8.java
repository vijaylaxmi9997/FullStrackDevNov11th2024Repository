package com.gentech.testDemos;

// Class A with an instance method and a static method
class ClassAy {
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method of Class A Executed");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method of Class A Executed");
    }
}

// Class B with an instance block
class ClassBy {
    // Instance block (executed when an object of ClassB is created)
    {
        System.out.println("Instance Block of Class B Executed");

        // Create an object of ClassA to call the instance method
        ClassAy objA = new ClassAy();
        objA.instanceMethod();  // This invokes the instance method of ClassA

        // Directly call the static method of ClassA
        ClassAy.staticMethod();  // This invokes the static method of ClassA
    }
}

public class Demot8 {
    public static void main(String[] args) {
        // Create an object of ClassB, which will trigger the instance block of ClassB
        ClassBy objB = new ClassBy();
    }
}
