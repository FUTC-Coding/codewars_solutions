package com.futc.fun;

public class Parity_outlier {

    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
	    System.out.println(find(exampleTest1));
	    System.out.println(find(exampleTest2));
    }

    static int find(int[] integers){
        int outlier = 0;
        for (int i = 0; i < integers.length ; i++){
            if (i == 0){
                //check if the two nearest elements, next two, are of different parity
                if ((isEven(integers[i]) && !isEven(integers[i+1]) && !isEven(integers[i+2])) || (!isEven(integers[i]) && isEven(integers[i+1]) && isEven(integers[i+2]))){
                    outlier = integers[i];
                    break;
                }
            } else {
                if (i != integers.length -1){
                    //check if the two nearest elements, left and right, are different
                    if ((isEven(integers[i]) && !isEven(integers[i-1]) && !isEven(integers[i+1])) || (!isEven(integers[i]) && isEven(integers[i-1]) && isEven(integers[i+1]))){
                        outlier = integers[i];
                        break;
                    }
                } else {
                    //check if the two nearest elements, last two,  are of different parity
                    if ((isEven(integers[i]) && !isEven(integers[i-1]) && !isEven(integers[i-2])) || (!isEven(integers[i]) && isEven(integers[i-1]) && isEven(integers[i-2]))){
                        outlier = integers[i];
                        break;
                    }
                }
            }
        }
        return outlier;
    }

    static boolean isEven(int i){
        if ( (i & 1) == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
