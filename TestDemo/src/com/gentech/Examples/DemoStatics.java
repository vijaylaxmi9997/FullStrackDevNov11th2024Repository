package com.gentech.Examples;
class Arraysint
{
    static  String name;
    static int age;
    static
    {
        name="vijju";
    }
    static void demos(int a,int b)
    {
        System.out.println("Addition"+(a+b));
    }
    static int[] Arrays(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
    static int multi(int x, int y)
    {
        System.out.println("multiplication:"+(x*y));
        return (x*y);
    }

}
public class DemoStatics {
    public static void main(String[] args) {
        Arraysint.Arrays(new int[]{1,2,3,4,5,6});
        Arraysint.demos(20,50);
        Arraysint.multi(6,9);
        Arraysint.age=21;
        System.out.println(Arraysint.name);
        System.out.println(Arraysint.age);
    }
}
