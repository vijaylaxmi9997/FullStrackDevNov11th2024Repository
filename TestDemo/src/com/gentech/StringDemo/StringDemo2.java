package com.gentech.StringDemo;
//String Builder Demos
public class StringDemo2 {
    public static void main(String[] args) {
        appendDemo();
        insertDemo();
        deleteDemo();
        reverseDemo();
    }

    private static void appendDemo()
    {
        StringBuilder s=new StringBuilder("Java");
        s.append(" Programming");
        System.out.println(s);
        System.out.println("+++++++++++++++");
    }

    private static void insertDemo()
    {
        StringBuilder s=new StringBuilder("It is a book");
        StringBuilder s1=s.insert(8,"new ");
        System.out.println("Insert Result:"+s1);
        System.out.println("+++++++++++++++");
    }

    private static void deleteDemo()
    {
        StringBuilder s=new StringBuilder("It is a new book");
        StringBuilder s1=s.delete(8,12);
        System.out.println("Delete Result:"+s1);
        System.out.println("+++++++++++++++");
    }

    private static void reverseDemo()
    {
        StringBuilder s=new StringBuilder("Programming");
        StringBuilder s1=s.reverse();
        System.out.println("Reverse Result:"+s1);
    }
}
