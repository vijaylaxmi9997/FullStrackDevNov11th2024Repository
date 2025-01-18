package com.gentech.Examples;
class  factorails
{
    void Demos(int num)
    {
        int fact = 1;
        for (int i =num; i>=1; i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of:"+num+"is"+fact);
    }
    int getfactorial(int num)
    {
        int fact=1;
        for(int i=num; i>=1; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
public class FactorailDemo {
    public static void main(String[] args) {
        factorails o=new  factorails();
        o.Demos(6);
        int v1=o.getfactorial(5);
        System.out.println(v1);

    }
}
