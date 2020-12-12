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

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }

    public void returnBook(){
        System.out.println();
    }

    public void returnMagazine(){
        System.out.println();
    }

    public void addBook(){
        System.out.println();
    }

    public void addMagazine(){
        System.out.println();
    }
}
