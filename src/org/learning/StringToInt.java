package org.learning;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero in lettere");
        String number = scanner.nextLine().toLowerCase();
        int numberConvert=0;

        for (int i = 0; i < number.length(); i++) {

            numberConvert *= 10;
            switch (number.charAt(i)) {
                case '1':
                    numberConvert += 1;
                    break;
                case '2':
                    numberConvert += 2;
                    break;
                case '3':
                    numberConvert += 3;
                    break;
                case '4':
                    numberConvert += 4;
                    break;
                case '5':
                    numberConvert += 5;
                    break;
                case '6':
                    numberConvert += 6;
                    break;
                case '7':
                    numberConvert += 7;
                    break;
                case '8':
                    numberConvert += 8;
                    break;
                case '9':
                    numberConvert += 9;
                    break;
            }

        }
        System.out.println(numberConvert);
        scanner.close();
    }
}
