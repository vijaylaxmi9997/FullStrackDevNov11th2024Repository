package com.gentech.ExceptionHandling;
class Mathsx
{
    static int getcharectercount(String str)throws Exception
    {
       if(str==null)
       {
           throw new Exception("the given input is null ,please provides valued string value:");
       }
       return str.length();
    }
}
public class Executiondemo {
    public static void main(String[] args) {
        try {
            int v1=Mathsx.getcharectercount("java");
            System.out.println("# of chars:" + v1);
            int v2=Mathsx.getcharectercount(null);
            System.out.println("# of chars:" + v2);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
