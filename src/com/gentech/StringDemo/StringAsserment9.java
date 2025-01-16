package com.gentech.StringDemo;

public class StringAsserment9 {
        public static void main(String[] args) {
            String str = "bengalur is gardern city";
            String[] words = str.split(" ");

            StringBuilder reversedSentence = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {

                reversedSentence.append(words[i]).append(" ");
            }
            System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
        }
    }
