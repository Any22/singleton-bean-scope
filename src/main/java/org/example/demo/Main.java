//Auto wiring using property
package org.example.demo;
import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Customer customer1 = (Customer) applicationContext.getBean("customerSingleton");
        Customer customer2 = (Customer) applicationContext.getBean("customerSingleton");
        // == is used when references are compared
        if (customer1 == customer2){
            System.out.println("same instances -Singleton scope");
        }
        else{
            System.out.println(" different instances");
        }


    }
}