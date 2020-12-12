package main.librarys;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends Library{

//    @Override
    public void getBook() {
            System.out.println("We take the book from UniLibrary");
    }

    @Override
    public void throwBook() {
        System.out.println("Throw the book from UniLibrary");
    }

    protected void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }
}