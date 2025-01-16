package com.gentech;
class NativePlace
{
    static String[] getNativePlace(String[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
}
public class TestQuestion {
    public static void main(String[] args) {
        NativePlace.getNativePlace(new String[]{"jalasangi","bidar","humanbad","sakarigi"});
    }
}
