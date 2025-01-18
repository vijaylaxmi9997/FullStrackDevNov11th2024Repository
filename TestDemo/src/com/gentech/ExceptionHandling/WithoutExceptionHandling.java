package com.gentech.ExceptionHandling;
class BasicMaths
{
    static void addition(int x, int y)
    {
        System.out.println("Addition result:"+(x+y));
    }
    static void Substaction(int x, int y)
    {
        System.out.println("Substaction result:"+(x-y));
    }
    static void Division(int x, int y)
    {
        int res=x/y;
        System.out.println("Division  result:"+res);
    }
    static void Multiplication(int x, int y)
    {
        System.out.println("Multiplication  result:"+(x*y));
    }
    static void isEvenNumber(int number)
    {
        if(number%2==0)
        {
            System.out.println(number+"is a Even number");
        }
    }
    static void isOddNumber(int number)
    {
        if(number%2==1)
        {
            System.out.println(number+"is a Odd Number");
        }
    }
    static void isPositiveNumber(int number)
    {
        if(number>0)
        {
            System.out.println(number+"is a Positive Number");
        }
    }
    static void isNegativeNumber(int number)
    {
        if(number<0)
        {
            System.out.println(number+"is a negative Number");
        }
    }
    static void AvergeValue(int x, int y)
    {
        int avg=(x+y)/2;
        {
            System.out.println("Average value of"+x+"and"+y+":"+avg);
        }
    }
    static void SquareOfNumber(int number)
    {
        int res=(number*number);
        {
            System.out.println("Square of"+number+"is"+res);
        }
    }

}
public class WithoutExceptionHandling {
    public static void main(String[] args) {
        BasicMaths.addition(10,20);
        BasicMaths.Substaction(20,10);
        BasicMaths.Division(20,5);
        BasicMaths.isOddNumber(7);
        BasicMaths.AvergeValue(40,30);
        BasicMaths.isEvenNumber(22);
        BasicMaths.isPositiveNumber(100);
        BasicMaths.SquareOfNumber(9);
        BasicMaths.Multiplication(9,5);
        BasicMaths.isNegativeNumber(-78);







    }
}
