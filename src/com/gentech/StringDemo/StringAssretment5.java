package com.gentech.StringDemo;

public class StringAssretment5 {
    public static void main(String[] args) {

        String str = "program";

        int count = 0;
        try {
            while (true)
            {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        System.out.println("Number of characters: " + count);
        System.out.println("++++++++++++++++++++++++++++++++");
                String str2 = "program";

                char[] charArray = str2.toCharArray();
                int count1 = 0;
                for (char c : charArray) {
                    count1++;
                }

                System.out.println("Number of characters: " + count1);


    }
}
