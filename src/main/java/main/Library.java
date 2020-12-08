package main;

import org.springframework.stereotype.Component;

@Component("libraryBook")
public class Library {

    public void getBook() {
        System.out.println("We take the book");
    }
}
