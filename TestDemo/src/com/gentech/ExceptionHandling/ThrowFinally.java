package com.gentech.ExceptionHandling;
class Maths8
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }
        finally {
            System.out.println("it Executes always!!!!");
        }
    }
}
public class ThrowFinally {
    public static void main(String[] args) {
        Maths8.Division(40,0);
    }
}
