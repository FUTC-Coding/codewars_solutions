package com.futc.fun;

public class Product_of_consecutive_fib {
    public static void main(String[] args) {
    }

    public static long[] productFib(long prod) {
    	long[] output = new long[3];
    	output[1] = 1;
    	while(output[0] * output[1] <= prod){
			long first = output[0];
			long second = output[1];
    		if (first * second == prod){
    			output[2] = 1;
    			return output;
			} else {
    			output[0] = second;
    			output[1] = first + second;
			}
		}
		return output;
	}
}
