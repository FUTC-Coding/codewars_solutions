package com.codewars;

public class Salesman_travel {

    static String ad = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432,"
            + "54 Holy Grail Street Niagara Town ZP 32908,3200 Main Rd. Bern AE 56210,1 Gordon St. Atlanta RE 13000,"
            + "10 Pussy Cat Rd. Chicago EX 34342,10 Gordon St. Atlanta RE 13000,58 Gordon Road Atlanta RE 13000,"
            + "22 Tokyo Av. Tedmondville SW 43098,674 Paris bd. Abbeville AA 45521,10 Surta Alley Goodtown GG 30654,"
            + "45 Holy Grail Al. Niagara Town ZP 32908,320 Main Al. Bern AE 56210,14 Gordon Park Atlanta RE 13000,"
            + "100 Pussy Cat Rd. Chicago EX 34342,2 Gordon St. Atlanta RE 13000,5 Gordon Road Atlanta RE 13000,"
            + "2200 Tokyo Av. Tedmondville SW 43098,67 Paris St. Abbeville AA 45521,11 Surta Avenue Goodtown GG 30654,"
            + "45 Holy Grail Al. Niagara Town ZP 32918,320 Main Al. Bern AE 56215,14 Gordon Park Atlanta RE 13200,"
            + "100 Pussy Cat Rd. Chicago EX 34345,2 Gordon St. Atlanta RE 13222,5 Gordon Road Atlanta RE 13001,"
            + "2200 Tokyo Av. Tedmondville SW 43198,67 Paris St. Abbeville AA 45522,11 Surta Avenue Goodville GG 30655,"
            + "2222 Tokyo Av. Tedmondville SW 43198,670 Paris St. Abbeville AA 45522,114 Surta Avenue Goodville GG 30655,"
            + "2 Holy Grail Street Niagara Town ZP 32908,3 Main Rd. Bern AE 56210,77 Gordon St. Atlanta RE 13000";

    public static void main(String[] args) {
        System.out.println(travel(ad, "OH 43071"));
        System.out.println(travel(ad, "EX 34342"));
        System.out.println(travel(ad, "AA 45521"));
    }

    public static String travel(String r, String zipcode) {
        String output = "";
        String numbers = "";
        String[] addresses = ad.split(",");
        for (String address : addresses) {
            String[] words = address.split(" "); //split into words
            String[] z = zipcode.split(" ");
            if (z[0].equals(words[words.length-2]) && z[1].equals(words[words.length-1])){
                if (output.equals("")){
                    output = output + zipcode + ":";
                }
            } else {
                continue;
            }

            if (!output.substring(output.length() - 1).equals(":")){
                output = output + ",";
            }

            for (int i = 1; i < words.length; i++){
                if(!isAllUpper(words[i])){
                    if (output.substring(output.length() - 1).equals(":") || output.substring(output.length() - 1).equals(",")){
                        output = output + words[i];
                    } else {
                        output = output + " " + words[i];
                    }
                }
            }

            if (numbers.equals("")){
                numbers = numbers + words[0];
            } else {
                numbers = numbers + "," + words[0];
            }
        }
        if (output.equals("")){
            output = zipcode + ":/";
        } else {
            output = output + "/" + numbers;
        }
        return output;
    }

    private static boolean isAllUpper(String s) {
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c) && Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
