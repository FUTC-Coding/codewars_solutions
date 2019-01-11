package com.codewars;

public class Odd_int {

    public static void main(String[] args) {
	    int[] a = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
	    findIt(a);
    }

    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++){
            int number = a[i];
            int count = 0;
            for (int j = 0; j < a.length; j++){
                int current = a[j];
                if (current == number){
                    count++;
                }
            }
            if (count % 2 != 0){
                return number;
            }
        }
        return 0;
    }
}
