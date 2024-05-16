package org.learning;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0,count;
        count = scanner.nextInt();
        int[] listNumber = new int[count];

        for (int i = 0; i < count; i++) {
            listNumber[i] = (int)(Math.random()*100)+1;
            System.out.println("Numero alla posizione "+ i + " " + listNumber[i]);
            if(i % 2 != 0){
                sum += listNumber[i];
            }
        }

        System.out.println("La somma dei valori in pèosizione dispari è di: " + sum);
        scanner.close();
    }
}
