package main.librarys;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("We take a book from SchoolLibrary");
    }

    public String returnBook() {
        System.out.println("SchoolLibrary.returnBook()");
        return "ok";
    }
}
