package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Main {


public static void main(String[] args) {
        String csvFile = "C:\\Users\\pavel\\OneDrive\\Рабочий стол\\Java\\Parsing\\123.csv";
        String line;
        String csvSplitBy = ",";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
                List<String[]> records = reader.readAll();

                for (String[] record : records) {

                        for (String field : record) {
                                System.out.print(field + " ");
                        }
                        System.out.println();
                }
        } catch (IOException e) {
                e.printStackTrace();
        }
}
}