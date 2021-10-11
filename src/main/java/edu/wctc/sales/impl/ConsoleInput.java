package edu.wctc.sales.inpl;

import edu.wctc.sales.iface.SalesInput;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);
    
    @Override 
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}