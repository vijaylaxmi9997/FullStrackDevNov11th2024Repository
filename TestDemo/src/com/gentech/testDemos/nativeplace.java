package com.gentech.testDemos;
class Test1
{
    static String[] Ammu(String[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
}
public class nativeplace {
    public static void main(String[] args) {
        Test1.Ammu(new String[] {"jalasangi","bidar","balki","humanbad","basavakalyan"});

    }
}
