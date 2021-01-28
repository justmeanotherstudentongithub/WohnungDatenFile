package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder dataX = new StringBuilder();
        File file = new File("src/com/company/txtdataImporrt.txt");

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                dataX.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Datei einlesen: " + dataX + "\n");
        String dataI = String.valueOf(dataX);
        String[] dataA = dataI.split(";");

        // ansprechnar aus Wohnungsprojekt

        System.out.println("einzelner Wert: " + dataA[0]);

        // alle Werte ausgeben
        System.out.println("_______________________"); // nur zur Übersicht

        for (String s : dataA) {
            System.out.println(s);

        }


    }
}
