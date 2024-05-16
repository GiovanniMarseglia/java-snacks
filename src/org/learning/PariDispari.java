package org.learning;

import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero, se è pari verrà stampato altrimenti se è dispari verrà satampato il numero successivo");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Il numero è pari: " + number);
        }else{
            System.out.println("Il numero è dispari, stamperò il numero successivo " + (number+1));
        }
        scanner.close();
    }
}
