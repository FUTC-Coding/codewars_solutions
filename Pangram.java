package com.codewars;

import java.lang.*;

public class Pangram {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

    static char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static boolean check(String sentence){
        outerloop:
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j <= sentence.length(); j++){
                if (j >= sentence.length()){
                    return false;
                }
                if (!Character.isAlphabetic(sentence.charAt(j))){
                    continue;
                }
                if (a[i] == sentence.charAt(j) || sentence.charAt(j) == Character.toUpperCase(a[i])){
                    continue outerloop;
                }
            }
        }
        return true;
    }
}
