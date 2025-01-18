package com.gentech.practices;
abstract class Demos1
{
    abstract void Arrays(String name);
    static String name;
    static
    {
        System.out.println("block in sataics");
    }
}
class Demos extends Demos1
{
    void Arrays(String name)
    {
        System.out.println("Arrays names:"+name);
    }
    int[] Arraysdemo(int arr[] )
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(+arr[i]);
        }
        return arr;
    }
}
public class StaticsBlockDemo {
    public static void main(String[] args) {
        Demos o=new Demos();
        o.Arrays("integer");
        o.Arraysdemo(new int[] {1,2,3,4,5,6,7});
    }
}
