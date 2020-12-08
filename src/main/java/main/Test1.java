package main;

import main.librarys.SchoolLibrary;
import main.librarys.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        /*uniLibrary.getBook();
        uniLibrary.throwBook();*/

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        /*schoolLibrary.getBook();
        schoolLibrary.throwBook();*/
        schoolLibrary.returnBook();

        context.close();
    }
}
