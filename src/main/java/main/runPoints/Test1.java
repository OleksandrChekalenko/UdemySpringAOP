package main.runPoints;

import main.config.Config;
import main.entitys.Book;
import main.entitys.librarys.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        uniLibrary.returnMagazine();
        uniLibrary.getBook();
        uniLibrary.addBook("Peet", book);
        uniLibrary.addMagazine();

        /*Book book = context.getBean("book", Book.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook(book);
        *//*schoolLibrary.getBook();
        schoolLibrary.throwBook();*//*
        schoolLibrary.returnBook();*/

        context.close();
    }
}
