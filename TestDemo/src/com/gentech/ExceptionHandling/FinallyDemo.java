package com.gentech.ExceptionHandling;
class Maths2
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("it Executes always!!!!");
        }
    }
}
public class FinallyDemo {
    public static void main(String[] args) {
        Maths2.Division(9,0);
    }
}
