package com.gentech.Examples;
class  Maths3
{
    Maths3(char ch[][])
    {
        for(int i=0; i<ch.length; i++)
        {
            for(int j=0; j<ch[0].length; j++)
            {
                System.out.print(ch[j][i]+" ");
            }
            System.out.println();
        }
    }
}
public class CharactorArray {
    public static void main(String[] args) {
        char s[][]={{'a','s','d'},{'b','n','m'},{'c','i','o'}};
        Maths3 o=new  Maths3(s);
        Maths3 o1=new  Maths3(new char[][] {{'s','p'},{'a','b'}});
    }
}
