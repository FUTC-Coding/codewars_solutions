package com.codewars;

import java.util.Arrays;

public class Buying_car {

    public static void main(String[] args) {
	nbMonths(8000,8000,1000,1.5);
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int[] output = new int[2];
        if (startPriceOld > startPriceNew){
            output[1] = startPriceOld - startPriceNew;
            System.out.println(Arrays.toString(output));
            return output;
        } else {
            double priceNew = startPriceNew;
            double priceOld = startPriceOld;
            int month = 0;
            int money = 0;
            while (true){
                if (month != 0) {
                    priceNew = priceNew - priceNew / 100 * percentLossByMonth;
                    priceOld = priceOld - priceOld / 100 * percentLossByMonth;
                }
                if (money + priceOld >= priceNew) {
                    output[0] = month;
                    double leftover = (priceOld + money) - priceNew;
                    output[1] = (int) Math.round(leftover);
                    System.out.println(Arrays.toString(output));
                    return output;
                }
                money = money + savingperMonth;
                System.out.println("priceNew: " + priceNew + " priceOld: " + priceOld + " At end of Month: " + month);
                if (month % 2 != 0) {
                    percentLossByMonth = percentLossByMonth + 0.5; // add loss at end of month
                }
                month++;
            }
        }
    }
}
