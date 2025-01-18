package com.gentech.practices;

public class ImplicitesDemo {
    public static void main(String[] args) {
        int a=24;
        System.out.println("int a:"+a);
        long b=a;
        System.out.println("long b:"+b);
        short s=25;
        System.out.println("short s:"+s);
        long l=s;
        System.out.println("long l:"+l);
        int v=100;
        double d=v;
        System.out.println("double d:"+d);
        byte bb=25;
        float ss=bb;
        System.out.println("float f:"+ss);
    }
}
