package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        cubeInfo();

    }

        static void cubeInfo () {

            Scanner scanner = new Scanner(System.in);


            String str = "";
            int cubeNum =0;
            int cubeMod=0;
            int cubeMulti =0;
            try {


                while (!str.contains("D")) {
                    System.out.println("Podaj dane kostki");
                    str = scanner.nextLine();
                }


                    int supNumLenght = str.length();
                    int supCharIndex = str.indexOf("D");

                if (str.contains("+")) {

                    System.out.println("modyfikator: " + str.substring(str.indexOf("+")+1));
                    cubeMod = Integer.valueOf(str.substring(str.indexOf("+")+1));

                    if (supCharIndex == 0) {

                        System.out.println("rodzaj kostki: " + str.substring(0, str.indexOf("+")));
                        System.out.println("liczba rzutow: 1");
                        cubeNum = Integer.valueOf(str.substring(1, str.indexOf("+")));
                        cubeMulti =1;


                    } else {
                        System.out.println("rodzaj kostki: " + str.substring(supCharIndex, str.indexOf("+")));
                        System.out.println("liczba rzutow: " + str.substring(0, supCharIndex));
                        cubeNum = Integer.valueOf(str.substring(supCharIndex+1, str.indexOf("+")));
                        cubeMulti = Integer.valueOf(str.substring(0, supCharIndex));
                    }

                } else if (str.contains("-")) {

                    System.out.println("modyfikator: " + str.substring(str.indexOf("-")));
                    cubeMod = Integer.valueOf(str.substring(str.indexOf("-")));

                    if (supCharIndex == 0) {

                        System.out.println("rodzaj kostki: " + str.substring(0, str.indexOf("-")));
                        System.out.println("liczba rzutow: 1");
                        cubeNum = Integer.valueOf(str.substring(1, str.indexOf("-")));
                        cubeMulti=1;


                    } else {
                        System.out.println("rodzaj kostki: " + str.substring(supCharIndex, str.indexOf("-")));
                        System.out.println("liczba rzutow: " + str.substring(0, supCharIndex));
                        cubeNum = Integer.valueOf(str.substring(supCharIndex+1, str.indexOf("-")));
                        cubeMulti = Integer.valueOf(str.substring(0, supCharIndex));
                    }

                } else {

                    System.out.println("modyfikator: 0");
                    cubeMod=0;

                    if (supCharIndex == 0) {

                        System.out.println("rodzaj kostki: " + str);
                        System.out.println("liczba rzutow: 1");
                        cubeNum = Integer.valueOf(str.substring(1));
                        cubeMulti=1;


                    } else {
                        System.out.println("rodzaj kostki: " + str.substring(supCharIndex));
                        System.out.println("liczba rzutow: " + str.substring(0, supCharIndex));
                        cubeNum= Integer.valueOf(str.substring(supCharIndex+1));
                        cubeMulti= Integer.valueOf(str.substring(0, supCharIndex));
                    }


                }

                System.out.println(cubeMulti);
                System.out.println(cubeNum);
                System.out.println(cubeMod);



                for (int i =1; i<=cubeMulti; i++) {

                    Random r = new Random();
                    int a = r.nextInt(cubeNum) + 1;

                    System.out.println(a);

                    System.out.println("wylosowana liczba to: " + (a + cubeMod));
                }

            } catch (Exception e) {
                System.out.println("sprawdz dane kostki i uruchom program jeszcze raz");
            }
        }

}
