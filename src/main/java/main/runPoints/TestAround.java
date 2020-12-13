package main.runPoints;

import main.config.Config;
import main.entitys.librarys.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {

    public static void main(String[] args) {
        System.out.println("Main method starts");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        System.out.println("Book name: " + uniLibrary.returnBook());

        context.close();
        System.out.println("Main method ends");
    }
}
