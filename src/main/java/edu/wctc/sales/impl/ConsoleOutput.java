package edu.wctc.sales.impl;

import edu.wctc.sales.iface.SalesReport;
import org.springframework.stereotype.Component;


public class ConsoleOutput implements SalesReport {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}