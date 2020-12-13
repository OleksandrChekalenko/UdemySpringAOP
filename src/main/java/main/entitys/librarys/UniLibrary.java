package main.entitys.librarys;

import main.entitys.Book;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends Library {

    //    @Override
    public void getBook() {
        System.out.println("We take the book from UniLibrary");
        System.out.println("----------------------------------------------");
    }

    public String returnBook() {
        int ex = 10 / 0;
        System.out.println("We get book back to UniLibrary");
        return "AOP Book";

    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We get magazine back to UniLibrary");
        System.out.println("----------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Add book to UniLibrary");
        System.out.println("----------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Add magazine to UniLibrary");
        System.out.println("----------------------------------------------");
    }

    @Override
    public void throwBook() {
        System.out.println("Throw the book from UniLibrary");
    }
}
