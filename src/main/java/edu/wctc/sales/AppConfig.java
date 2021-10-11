package edu.wctc.sales;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new ConsolInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new ConsoleOutput();
    }
}
