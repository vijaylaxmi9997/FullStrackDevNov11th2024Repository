package com.gentech.testDemos;


// Class A with an instance block
class ClassAaa {
    // Instance block in ClassA
    {
        System.out.println("Instance Block of Class A Executed");
        // Creating an object of ClassB inside ClassA's instance block
        ClassBB objB = new ClassBB();  // This will trigger ClassB's instance block
    }
}

// Class B with an instance block
class ClassBB {
    // Instance block in ClassB
    {
        System.out.println("Instance Block of Class B Executed");
    }
}

public class Demot5 {
    public static void main(String[] args) {
        // Create an object of ClassA, which will trigger ClassA's instance block
        ClassAaa objA = new ClassAaa();
    }
}
