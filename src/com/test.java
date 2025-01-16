package com;
class Numbers
{
    int numberDemo()
    {
        int count =0;
        for(int i=40; i<=80; i++)
        {
            if(i%3==0)
            {
                count++;
                System.out.println("is divisible by 10:"+i);
            }
        }
        return count;
    }
}
public class test {

    public static void main(String[] args) {
        Numbers o=new Numbers();
        int v=o.numberDemo();
        System.out.println("countof number between 40 to 80:"+v);

    }
}

