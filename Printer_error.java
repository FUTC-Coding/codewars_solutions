package com.codewars;

public class Printer_error {

    static char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
	    printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz");
    }

    public static String printerError (String s) {
        int counter = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < 14; j++){
                if (j > 12) {   //m = 12th letter in alphabet array
                    counter++;
                    break;
                }
                if (c[i] == a[j]){
                 break;
                }
            }
        }
        String output = counter + "/" + c.length;
        System.out.println(output);
        return output;
    }
}
