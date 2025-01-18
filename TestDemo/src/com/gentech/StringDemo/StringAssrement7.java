package com.gentech.StringDemo;

public class StringAssrement7 {
    public static void main(String[] args) {
        String str = "SUNDAYMONDAYTUESDAYWEDNESSDAYTHURSEDAYFRIDAYSATURDAY";
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {

            if (i + 2 < str.length() && str.substring(i, i + 3).equalsIgnoreCase("DAY")) {
                result.append("DAY, ");
                i += 3;
            } else {
                result.append(str.charAt(i));
                i++;

            }
        }

        System.out.println("Result with commas: " + result.toString());
    }
}
