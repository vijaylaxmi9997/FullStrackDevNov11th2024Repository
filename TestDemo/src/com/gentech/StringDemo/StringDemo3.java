package com.gentech.StringDemo;
// String methodes Demos
public class StringDemo3 {
    public static void main(String[] args) {
        upper();
        lower();
        strLength();
        extractASingleCharacter();
        appendString();
        compareString1();
        compareString2();
        existanceOfString();
        replaceDemo();
        findPosition1();
        findPosition2();
        convertToString();
        charArray();
        splitString();
        subStringDemo();
    }

    private static void upper()
    {
        String s="welcome";
        String s1=s.toUpperCase();
        System.out.println("Uppercase :"+s1);
        System.out.println("+++++++++++++++++");
    }

    private static void lower()
    {
        String s="PROGRAM";
        String s1=s.toLowerCase();
        System.out.println("Lowercase :"+s1);
        System.out.println("+++++++++++++++++");
    }

    private static void strLength()
    {
        String s=new String("Welcome");
        int v1=s.length();
        System.out.println("# of Characters :"+v1);
        System.out.println("+++++++++++++++++");
    }

    private static void extractASingleCharacter()
    {
        String s=new String("Welcome");
        char ch=s.charAt(0);
        System.out.println("character ch:"+ch);
        System.out.println("+++++++++++++++++");
    }

    private static void appendString()
    {
        String s=new String("Welcome");
        String s1=s.concat("To Bangalore");
        System.out.println("Concateanted String :"+s1);
        System.out.println("+++++++++++++++++");
    }

    private static void compareString1()
    {
        String s1="JavaScript";
        String s2="JAVASCRIPT";
        boolean v1=s1.equals(s2);
        System.out.println("s1 and s2 are equal :"+v1);
        boolean v2=s1.equalsIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :"+v2);
        System.out.println("+++++++++++++++++");
    }

    private static void compareString2()
    {
        String s1="JavaScript";
        String s2="JAVASCRIPT";
        int v1=s1.compareTo(s2);
        System.out.println("s1 and s2 are equal :"+v1);
        int v2=s1.compareToIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :"+v2);
        System.out.println("+++++++++++++++++");
    }

    private static void existanceOfString()
    {
        String s="It is a new palace";
        boolean v1=s.startsWith("It");
        System.out.println("Starts With :"+v1);
        boolean v2=s.endsWith("palace");
        System.out.println("Ends With :"+v2);
        boolean v3=s.contains("new");
        System.out.println("contains :"+v3);
        System.out.println("+++++++++++++++++");
    }

    private static void replaceDemo()
    {
        String s="It is a new palace";
        String s1=s.replace("is","was");
        System.out.println(s1);
        System.out.println("+++++++++++++++++");
    }

    private static void findPosition1()
    {
        String s="It is a new palace, It is";
        int v1=s.indexOf("is");
        System.out.println("Position of 'is' :"+v1);
        int v2=s.indexOf("is",4);
        System.out.println("Position of 'is' :"+v2);
        System.out.println("+++++++++++++++++");
    }

    private static void findPosition2()
    {
        String s="It is a new palace, It is";
        int v1=s.lastIndexOf("is");
        System.out.println("Position of 'is' :"+v1);
        System.out.println("+++++++++++++++++");
    }

    private static void convertToString()
    {
        int a=450;
        String s1=String.valueOf(a);
        System.out.println("Result:"+s1);
        double d=14.55;
        String s2=String.valueOf(d);
        System.out.println("Result:"+s2);
        System.out.println("+++++++++++++++++");
    }

    private static void charArray()
    {
        String s="PROGRAM";
        char ch[]=s.toCharArray();
        for(char ch1:ch)
        {
            System.out.println(ch1);
        }
        System.out.println("+++++++++++++++++");
    }

    private static void splitString()
    {
        String s="Bangalore and Mysore";
        String[] str =s.split(" ");
        String res="";
        for(int i=str.length-1;i>=0;i--)
        {
            res=res+str[i]+" ";
        }
        System.out.println(res);
        System.out.println("+++++++++++++++++");
    }

    private static void subStringDemo()
    {
        String s="Programming";
        String s1=s.substring(3);
        System.out.println(s1);
        String s2=s.substring(3,7);
        System.out.println(s2);
        System.out.println("+++++++++++++++++");
    }
}
