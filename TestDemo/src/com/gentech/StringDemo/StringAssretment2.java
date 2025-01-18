package com.gentech.StringDemo;

public class StringAssretment2 {

    public static void main(String[] args) {
        String str = "program";

        // Loop through each character in the string
        for (int i = 1; i <= str.length(); i++) {
            // Initialize an empty string to build each row
            StringBuilder row = new StringBuilder();

            // Loop through the first i characters of the string
            for (int j = 0; j < i; j++) {
                row.append(str.charAt(j)); // Append character
                if (j < i - 1) {
                    row.append(" "); // Add a space between characters
                }
            }

            // Print the row
            System.out.println(row.toString());
        }
    }
}
