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
        int[] intArr = new int[6];
        String supStr = "";
        int aNum = -1;
        int bNum = -1;
        int cNum = -1;
        int dNum = -1;
        int eNum = -1;
        int fNum = -1;

        while (aNum == -1 || bNum == -1 || cNum == -1 || dNum == -1 || eNum == -1 || fNum == -1) {

            if (aNum == -1) {
                System.out.println("Podaj 1 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else {
                    aNum = Integer.valueOf(supStr);
                    intArr[0] = aNum;
                }
            } else if (bNum == -1) {
                System.out.println("Podaj 2 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (aNum == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    bNum = Integer.valueOf(supStr);
                    intArr[1] = bNum;
                }

            } else if (cNum == -1) {
                System.out.println("Podaj 3 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (aNum == Integer.valueOf(supStr) || bNum == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    cNum = Integer.valueOf(supStr);
                    intArr[2] = cNum;
                }
            } else if (dNum == -1) {
                System.out.println("Podaj 4 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (aNum == Integer.valueOf(supStr) || bNum == Integer.valueOf(supStr) || cNum == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    dNum = Integer.valueOf(supStr);
                    intArr[3] = dNum;
                }
            } else if (eNum == -1) {
                System.out.println("Podaj 5 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (aNum == Integer.valueOf(supStr) || bNum == Integer.valueOf(supStr) || cNum == Integer.valueOf(supStr) || dNum == Integer.valueOf(supStr)) {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    eNum = Integer.valueOf(supStr);
                    intArr[4] = eNum;
                }
            } else if (fNum == -1) {
                System.out.println("Podaj 6 liczbe:");
                supStr = scanner.nextLine();
                if (supStr.equals(exit)) {
                    aNum = bNum = cNum = dNum = eNum = fNum = 0;
                    System.out.println("Program zakonczy sowje dzialanie");
                } else if (!isIntegerNotmoreThan49(supStr)) {
                    System.out.println("To nie jest liczba z zakresu");
                } else if (aNum == Integer.valueOf(supStr) || bNum == Integer.valueOf(supStr)|| cNum == Integer.valueOf(supStr) || dNum == Integer.valueOf(supStr)|| eNum == Integer.valueOf(supStr))  {
                    System.out.println("Podana liczba jest juz wprowadzone");
                } else {
                    fNum = Integer.valueOf(supStr);
                    intArr[5] = fNum;
                }

            }
        }

        if (!supStr.equals(exit)) {

            Arrays.sort(intArr);
            System.out.println(Arrays.toString(intArr));

            Random r = new Random();
            aNum = r.nextInt(50);
            bNum = r.nextInt(50);
            cNum = r.nextInt(50);
            dNum = r.nextInt(50);
            eNum = r.nextInt(50);
            fNum = r.nextInt(50);
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
