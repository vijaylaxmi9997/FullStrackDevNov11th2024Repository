package com.gentech.StringDemo;

public class StringAssrement8 {
    public static void main(String[] args) {
        String str = "the temple is at the top of the hill";

        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') {
                inWord = false;
            } else if (!inWord) {
                wordCount++;
                inWord = true;
            }
        }
        System.out.println("Number of words: " + wordCount);
    }
}
