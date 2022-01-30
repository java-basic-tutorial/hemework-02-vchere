package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        String[] months = {"I"  , "II" , "III" , "IV" ,  "V"  ,  "VI" , "VII" , "VIII" , "IX"  ,  "X"  , "XI" ,  "XII"};
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        double averageTemp = 0.0;
        for (double temp : temperature) {
            averageTemp += temp;
        }
        averageTemp = averageTemp / temperature.length;
        System.out.println("Average annual temperature: " + averageTemp);
        int coldMonthIndex = 0;
        int warmMonth = 0;
        for (int i = 1; i < temperature.length ; i++) {
            if(temperature[i] < temperature[coldMonthIndex]) {
                    coldMonthIndex = i;
            }
            if(temperature[i] > temperature[warmMonth]) {
                warmMonth = i;
            }

        }
        System.out.println("Month with the lowest temperature in a year: " + months [coldMonthIndex]);
        System.out.println("Month with the highest temperature in a year: " + months [warmMonth]);

    }
}


