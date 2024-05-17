package org.learning;

import java.util.Scanner;

public class SecondToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i secondi");
        int inputSecond = scanner.nextInt();
        int second, minute=0, hour=0;
        if(inputSecond > 59){
            minute = inputSecond / 60;
            second = inputSecond % 60;
            if (minute>59){
                hour = minute / 60;
                minute = minute % 60;
            }
        }else{
            second = inputSecond;
        }
        System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
    }
}
