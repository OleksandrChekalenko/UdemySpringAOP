package main;

import main.entitys.Book;
import main.librarys.SchoolLibrary;
import main.librarys.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();


        /*Book book = context.getBean("book", Book.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook(book);
        *//*schoolLibrary.getBook();
        schoolLibrary.throwBook();*//*
        schoolLibrary.returnBook();*/

        context.close();
    }
}
