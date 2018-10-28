package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String exit = "quit";

    public static void main(String[] args) {

        getNumberGame();
    }

    static void getNumberGame() {

        Random r = new Random();
        int a = r.nextInt(101);
        boolean bVar =false;
        System.out.println(a);


        while (!bVar) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Zgadnij liczbe: ");

            String str = scanner.nextLine();
            if (str.equals(exit)) {
                System.out.println("Program zakonczy swoje dzialanie");
                bVar=true;

            } else if (!isIntegeMoreThanZero(str)) {
                System.out.println("To nie jest liczba wieksza od zera");

            } else if (Integer.valueOf(str)==a) {

                System.out.println("Zgadles");

                bVar = true;

            } else if (Integer.valueOf(str)>a) {
                System.out.println("Za duzo");
            } else if(Integer.valueOf(str)<a) {
                System.out.println("Za Malo");
            }


        }


    }

    static boolean isIntegeMoreThanZero(String str){
       try {
           if (Integer.valueOf(str)>0) {
               return true;
           } else {
               return false;
           }
       } catch (Exception e) {

           return false;
       }

    }
}
