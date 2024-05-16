package org.learning;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero in lettere");
        String number = scanner.nextLine().toLowerCase();
        int numberConvert=0;
        switch (number){
            case "uno":
                numberConvert=1;
                break;
            case "due":
                numberConvert=2;
                break;
            case "tre":
                numberConvert=3;
                break;
            case "quattro":
                numberConvert=4;
                break;
            case "cinque":
                numberConvert=5;
                break;
            case "sei":
                numberConvert=6;
                break;
            case "sette":
                numberConvert=7;
                break;
            case "otto":
                numberConvert=8;
                break;
            case "nove":
                numberConvert=9;
                break;
            case "dieci":
                numberConvert=10;
                break;
        }
        System.out.println(numberConvert);
        scanner.close();
    }
}
