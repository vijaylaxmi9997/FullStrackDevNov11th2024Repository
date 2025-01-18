package com.gentech.Examples;
class Maths1 {
    Maths1(int num)
    {
        int fact = 1;
        for (int i = num; i >= 1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of num:" + num + " is:" + fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        Maths1 o1=new  Maths1(4);
        Maths1 o2=new  Maths1(5);
        Maths1 o3=new  Maths1(6);

    }
}
