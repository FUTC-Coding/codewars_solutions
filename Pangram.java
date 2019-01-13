package com.codewars;

import java.lang.*;

public class Pangram {

    public static void main(String[] args) {
	// write your code here
    }

    static char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public boolean check(String sentence){
        outerlooop:
        for (int i = 0; i < sentence.length(); i++){
            for (int j = 0; j <= a.length; j++){
                if (j == a.length) return false;
                if (sentence.charAt(i) == a[j] || Character.toUpperCase(sentence.charAt(i)) == a[j] || Character.isAlphabetic(sentence.charAt(i))){
                    continue outerlooop;
                }
            }
        }
        return true;
    }
}
