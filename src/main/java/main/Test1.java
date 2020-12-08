package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Library library = context.getBean("libraryBook", Library.class);
        library.getBook();

        context.close();
    }
}
