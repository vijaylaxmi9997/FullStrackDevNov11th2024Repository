package com.gentech.practices;

public class Test2 {
    public static void main(String[] args) {
        int count=0;
        for(int i=10; i<50; i++)
        {
            if(i%3==0)
            {
                count++;
                System.out.println(i+" ");
            }
        }
        System.out.println("count of numbers:"+count);
    }
}
