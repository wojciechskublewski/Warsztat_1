package com.company;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {

       getTitle();

    }

    static void getTitle(){
        Connection conect = Jsoup.connect("http://www.onet.pl");
        String str ="";

        try {


            PrintWriter out = new PrintWriter("popular_worlds.txt");
            Document document = conect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {

                str += elem.text() +" ";

            }

            str = str.replace("?","");
            str = str.replace("!","");
            str = str.replace(",","");
            str = str.replace(".","");
            str = str.replace("\"","");
            str = str.replace(":","");
            str =str.toLowerCase();

            String[] parts = str.split(" ");

           // System.out.println(Arrays.toString(parts));

            for (int i=0; i<parts.length; i++) {
                if (parts[i].length()>3) {
                    out.println(parts[i]);


                }
            }


            String[] filtered = {"jest","który", "oraz","auto","odry"};


            File file = new File ("popular_worlds.txt");
            StringBuilder reading = new StringBuilder();
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                reading.append(scanner.nextLine()+" ");
            }
            String strSup =reading.toString();

            //System.out.println(strSup);

            for (int i=0; i<filtered.length; i++) {
                strSup=strSup.replace(filtered[i],"");
            }
            strSup=strSup.replace("  "," ");

            String[] parts2 = strSup.split(" ");
            FileWriter fileWriter = new FileWriter("filtered_popular_worlds.txt",false);

            for (int i=0; i<parts2.length; i++) {
                fileWriter.append(parts2[i]+"\n");
            }
            fileWriter.close();



        } catch (IOException e) {
            e.printStackTrace();

        }

    }


}
