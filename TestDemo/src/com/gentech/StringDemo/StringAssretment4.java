package com.gentech.StringDemo;

public class StringAssretment4 {
    public static void main(String[] args) {
        String str = "program";

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string using charAt: " + reversed);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        String str1= "program";

        char[] charArray = str1.toCharArray();
        String reversed1 = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed1 += charArray[i];
        }
        System.out.println("Reversed string using toCharArray: " + reversed1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        String str3 = "program";
        String reversed2 = "";
        for (int i = str3.length() - 1; i >= 0; i--)
        {
            reversed2 += str3.substring(i, i + 1);
        }
        System.out.println("Reversed string using substring: " + reversed2);

    }
}

