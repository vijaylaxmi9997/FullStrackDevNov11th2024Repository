package com.gentech.StringDemo;

public class StringAssretment1 {
        public static void main(String[] args)
        {
            String str = "program";
            for (int i = 1; i <= str.length(); i++)
            {
                System.out.println(str.substring(0 ,i));
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++");

            String v1 = "program";
            for (int i = 1; i <= v1.length(); i++)
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.print(v1.charAt(j));
                    if (j < i - 1)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            String v2 = "program";
            for (int i = v2.length(); i > 0; i--)
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.print(v2.charAt(j));
                    if (j < i - 1)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            String str3 = "program";

            for (int i = 1; i <= str3.length(); i++)
            {
                for (int j = 0; j < str3.length() - i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++)
                {
                    System.out.print(str3.charAt(j));
                    if (j < i - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = str3.length() - 1; i > 0; i--)
            {

                for (int j = 0; j < str3.length() - i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++)
                {
                    System.out.print(str3.charAt(j));
                    if (j < i - 1)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}



