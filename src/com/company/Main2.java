package com.company;

import org.apache.commons.lang3.ArrayUtils;

import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    static String exit ="quit";

    public static void main(String[] args) {

        lottoGame();

    }



    static void lottoGame () {

        Scanner scanner = new Scanner(System.in);
        int[] intArr = {-1,-1,-1, -1, -1,-1};
        String supStr = "";
        int aNum = -1;
        int bNum = -1;
        int cNum = -1;
        int dNum = -1;
        int eNum = -1;
        int fNum = -1;

        while (intArr[0] == -1 || intArr[1]== -1 || intArr[2] == -1 || intArr[3] == -1 || intArr[4] == -1 || intArr[5] == -1) {

            if (intArr[0] == -1) {
                System.out.println("Podaj 1 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else {
                    intArr[0] = Integer.valueOf(supStr);
                }
            } else if (intArr[1] == -1) {
                System.out.println("Podaj 2 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (intArr[0] == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    intArr[1] = Integer.valueOf(supStr);
                }

            } else if (intArr[2] == -1) {
                System.out.println("Podaj 3 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (intArr[0] == Integer.valueOf(supStr) || intArr[1] == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    intArr[2] = Integer.valueOf(supStr);
                }
            } else if (intArr[3] == -1) {
                System.out.println("Podaj 4 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (intArr[0] == Integer.valueOf(supStr) || intArr[1] == Integer.valueOf(supStr) || intArr[2] == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    intArr[3] = Integer.valueOf(supStr);
                }
            } else if (intArr[4] == -1) {
                System.out.println("Podaj 5 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (intArr[0] == Integer.valueOf(supStr) || intArr[1] == Integer.valueOf(supStr) || intArr[2] == Integer.valueOf(supStr) || intArr[3] == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    intArr[4] = Integer.valueOf(supStr);
                }
            } else if (intArr[5] == -1) {
                System.out.println("Podaj 6 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    intArr[0] = intArr[1] = intArr[2] = intArr[3] = intArr[4] = intArr[5] = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (intArr[0] == Integer.valueOf(supStr) || intArr[1] == Integer.valueOf(supStr)|| intArr[2] == Integer.valueOf(supStr) || intArr[3] == Integer.valueOf(supStr)|| intArr[4] == Integer.valueOf(supStr))  {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    intArr[5] = Integer.valueOf(supStr);
                }

            }
        }

        if (!supStr.equals(exit)) {

            Arrays.sort(intArr);
            System.out.println(Arrays.toString(intArr));

            Random r = new Random();

            while (aNum == -1 || bNum == -1 || cNum == -1 || dNum == -1 || eNum == -1 || fNum == -1) {
                aNum = r.nextInt(50);
                bNum = r.nextInt(50);
                if (aNum==bNum) {
                    bNum=-1;
                }
                cNum = r.nextInt(50);
                if (aNum==cNum || bNum==cNum) {
                    cNum=-1;
                }
                dNum = r.nextInt(50);
                if (aNum==dNum || bNum==dNum || cNum==dNum) {
                    dNum=-1;
                }
                eNum = r.nextInt(50);
                if (aNum==eNum || bNum==eNum || cNum==eNum || dNum==eNum) {
                    eNum=-1;
                }
                fNum = r.nextInt(50);
                if (aNum==fNum || bNum==fNum || cNum==fNum || dNum==fNum || eNum==fNum) {
                    fNum=-1;
                }
            }

            int licznik = 0;

            System.out.println(aNum + " " + bNum + " " + cNum + " " + dNum + " " + eNum + " " + fNum + " ");

            if (ArrayUtils.contains(intArr, aNum)) {
                licznik++;
            } else if (ArrayUtils.contains(intArr, bNum)) {
                licznik++;
            } else if (ArrayUtils.contains(intArr, cNum)) {
                licznik++;
            } else if (ArrayUtils.contains(intArr, dNum)) {
                licznik++;
            } else if (ArrayUtils.contains(intArr, eNum)) {
                licznik++;
            } else if (ArrayUtils.contains(intArr, fNum)) {
                licznik++;
            }

            if (licznik == 6) {
                System.out.println("wygrales 6");
            } else if (licznik == 5) {
                System.out.println("wygrales 5");
            } else if (licznik==4) {
                System.out.println("wygrales 4");
            } else   if (licznik==3) {
                System.out.println("wygrales 3");
            } else {
                System.out.println("nic nie wygrales");
            }
        }

    }


    static boolean isIntegerNotmoreThan49 (String str) {
        try{
            if (Integer.valueOf(str) > 0 && Integer.valueOf(str)<50) {
                return true;
            } else  {
                return false;
            }

        } catch (Exception e) {
            return false;

        }

    }



}
