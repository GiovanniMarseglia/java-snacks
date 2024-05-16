package org.learning;

import java.util.Scanner;

public class CountTypeChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci dei caratteri,numeri e caratteri speciali e ti dirò il totale di ognuno di loro");
        String list = scanner.nextLine();
        int countAlph=0, countSpec=0, countNum=0;
        for (int i = 0; i < list.length(); i++) {
            if(Character.isDigit(list.charAt(i))){
                countNum++;
            }else if(Character.isAlphabetic(list.charAt(i))){
                countAlph++;
            }else if(!Character.isDigit(list.charAt(i)) && !Character.isLetter(list.charAt(i))){
                countSpec++;
            }

        }
        System.out.println("Totale caratteri alfabetici: " + countAlph);
        System.out.println("Totale caratteri speciali:  " + countSpec);
        System.out.println("Totale numeri " + countNum);
        scanner.close();
    }
}
