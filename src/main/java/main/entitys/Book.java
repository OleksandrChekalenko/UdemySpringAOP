package main.entitys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("SOme bbok")
    private String bookName;

    public String getName() {
        return bookName;
    }
}
