package edu.wctc.sales;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SalesApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
    }
}
