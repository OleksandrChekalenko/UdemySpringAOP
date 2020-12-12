package main.librarys;

import main.entitys.Book;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {

    public void getBook(Book book) {
        System.out.println("We take a book from SchoolLibrary" + book.getName());
    }

    public String returnBook() {
        System.out.println("SchoolLibrary.returnBook()");
        return "ok";
    }
}
