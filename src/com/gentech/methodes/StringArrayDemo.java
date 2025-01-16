package com.gentech.methodes;
class StringDemo
{
    void Demo(String  s[])
    {
        String result = " ";
        for (int i =s.length/2; i<=s.length-1; i++)
        {
            result += s[i];  // Concatenate directly
        }
        System.out.println("Concatenated String: " + result);
    }
}
public class StringArrayDemo {
    public static void main(String[] args) {
        String[] Arr = {"Hello", " ", "world", "!", " How", " are", " you?"};
        StringDemo o=new StringDemo();
        o.Demo(Arr);
    }
}
