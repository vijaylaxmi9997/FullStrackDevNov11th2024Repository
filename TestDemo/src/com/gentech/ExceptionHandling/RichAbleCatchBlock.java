package com.gentech.ExceptionHandling;
class Maths5
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class RichAbleCatchBlock {
    public static void main(String[] args) {
        Maths5.Division(40,0);
    }
}
