package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        numberGame();

    }

    static void numberGame () {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj liczbe do ogadniecia:");
        int number = scanner1.nextInt();
        int min= 0;
        int max =1000;
        int guess=0;
        String answer ="";



        System.out.println("Pomysl liczbe od 0 do 1000 a ja zgadne ja w max 10 ruchach");

        for (int i=1; i<11; i++) {

            guess= ((max-min)/2)+min;
            boolean loopVar = false;

            while (!loopVar && !answer.equals("zgadles")) {

                System.out.println("Zgaduje " + guess);
                answer = scanner2.nextLine();

                if (answer.equals("zgadles")) {
                    System.out.println("WYGRALEM!");
                    loopVar=true;
                    break;

                } else if (answer.equals("za duzo")) {
                    max = guess;
                    loopVar=true;
                } else if (answer.equals("za malo")) {
                    min = guess;
                    loopVar=true;
                } else {
                    System.out.println("Nie oszukuj");
                }

            }
        }


    }
}
