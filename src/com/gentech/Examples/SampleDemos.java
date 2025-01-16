package com.gentech.Examples;
class name
{
    String[] getname(String s[])
    {

        return s;
    }
}
public class SampleDemos {
    public static void main(String[] args) {
        name o=new name();
        String m[]={"viiju","ammu"};
        String v1[]=o.getname(m);

        for(int i=0; i< v1.length; i++)
        {
            System.out.println(v1[i]);
        }
    }
}
