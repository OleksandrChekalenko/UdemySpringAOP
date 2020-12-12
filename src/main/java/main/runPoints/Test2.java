package main.runPoints;

import main.config.Config;
import main.entitys.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        System.out.println(university.getStudents());

        context.close();
    }
}
