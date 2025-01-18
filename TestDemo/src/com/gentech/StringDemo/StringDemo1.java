package com.gentech.StringDemo;
// String BufferDemo demos
public class StringDemo1 {
    public static void main(String[] args) {
        appendDemo();
        insertDemo();
        deleteDemo();
        reverseDemo();
    }

    private static void appendDemo()
    {
        StringBuffer s=new StringBuffer("Java");
        s.append(" Programming");
        System.out.println(s);
        System.out.println("+++++++++++++++");
    }

    private static void insertDemo()
    {
        StringBuffer s=new StringBuffer("It is a book");
        StringBuffer s1=s.insert(8,"new ");
        System.out.println("Insert Result:"+s1);
        System.out.println("+++++++++++++++");
    }

    private static void deleteDemo()
    {
        StringBuffer s=new StringBuffer("It is a new book");
        StringBuffer s1=s.delete(8,12);
        System.out.println("Delete Result:"+s1);
        System.out.println("+++++++++++++++");
    }

    private static void reverseDemo()
    {
        StringBuffer s=new StringBuffer("Programming");
        StringBuffer s1=s.reverse();
        System.out.println("Reverse Result:"+s1);
    }
}
