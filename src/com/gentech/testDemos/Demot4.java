package com.gentech.testDemos;

public class Demot4 {

    // Static initialization block 1
    static {
        System.out.println("Static Block 1 Executed");
    }

    // Static initialization block 2
    static {
        System.out.println("Static Block 2 Executed");
    }

    // Instance initialization block 1
    {
        System.out.println("Instance Block 1 Executed");
    }

    // Instance initialization block 2
    {
        System.out.println("Instance Block 2 Executed");
    }

    // Constructor
    public Demot4() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        // Create an object of the class
        Demot4 obj = new Demot4(); // This will trigger the instance blocks and constructor
    }
}
