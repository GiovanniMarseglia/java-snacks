package org.learning;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un nume per sapere se è palindromo oppure no");
        String name = scanner.nextLine();
        int count = name.length()-1;
        boolean flag = true;
        for (int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i) == name.charAt(count)){
                count--;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Il nome è palindromo");
        }else{
            System.out.println("Il nome non è palindromo");
        }
    }
}
