package main.entitys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("SOme bbok")
    private String bookName;
    @Value("I`Are")
    private String author;
    @Value("1813")
    private int yearOfPublication;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
