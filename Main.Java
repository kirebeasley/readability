package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Input text here:");
        Scanner key = new Scanner(System.in);
        String text = key.nextLine();
        int count_letters = 0;
        int count_words = 0;
        int count_sentences = 0;
        System.out.println("Text: " + text);
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count_letters++;
        }


        char ch[] = new char[text.length()];
        for (int j = 0; j < text.length(); j++) {
            ch[j] = text.charAt(j);
            if (((j > 0) && (ch[j] != ' ') && (ch[j - 1] == ' ')) || ((ch[0] != ' ') && (j == 0)))
                count_words++;
        }

        for (int k = 0; k < text.length(); k++) {
            ch[k] = text.charAt(k);
            if (ch[k] == ('.') || (ch[k] == '!') || (ch[k] == '?'))
                count_sentences++;
        }


        double cl = count_letters;
        int cs = count_sentences;
        double cw = count_words;

        double result = ((0.0588 * ((cl / cw) * 100)) - (0.296 * ((cs / cw) * 100)) - 15.8);
        if (result < 16 && result > 1) {

                System.out.println("(Grade " + Math.round(result) + ')');}

                if (result >= 16) {
                    System.out.println("(Grade 16+) ");
                }
                if (result < 1) {
                    System.out.println("(Before Grade 1)");
                }


            }
        }







