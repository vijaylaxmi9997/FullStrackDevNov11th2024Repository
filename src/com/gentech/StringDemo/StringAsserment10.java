package com.gentech.StringDemo;

public class StringAsserment10 {

    public static void main(String[] args) {
        String str = "bengalur is gardern city";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Reversed words: " + result.toString().trim());
    }
}
