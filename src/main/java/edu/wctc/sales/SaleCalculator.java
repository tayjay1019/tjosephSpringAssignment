package edu.wctc.sales;


import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@Component
public class SaleCalculator {

    ArrayList<Sale> salesList = new ArrayList<>();

    public SaleCalculator() throws FileNotFoundException {
        System.out.println("Sale Calculator created");
        readFile();
        System.out.println(salesList);
    }

    public void readFile() throws FileNotFoundException {
        String filename = "sales.txt";
        Scanner keyboard = new Scanner(System.in);
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext())
        {
            String listener = inputFile.nextLine();
            String[] str = listener.split(",");
            String name = str[0];
            String country = str[1];
            double amount = Double.parseDouble(str[2]);
            double tax = Double.parseDouble(str[3]);
            Sale sale = new Sale(name, country, amount, tax);
            salesList.add(sale);
        }
    }


}
