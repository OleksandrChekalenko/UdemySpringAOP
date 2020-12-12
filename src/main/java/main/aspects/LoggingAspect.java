package main.aspects;

import main.entitys.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    /*@Before("main.aspects.Pointcuts.allUniLibraryMethods() && !main.aspects.Pointcuts.returnMagazinePointcut()")
    public void beforeAllMethodsExceptGetMagazineAdvise() {
        System.out.println("beforeAllMethodsExceptGetMagazineAdvise: Log #10");
    }

    @Before("main.aspects.Pointcuts.allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvise() {
        System.out.println("beforeGetLoggingAdvise: Log #1");
    }

    @Before("main.aspects.Pointcuts.allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvise() {
        System.out.println("beforeReturnLoggingAdvise: Log #2");
    }

    @Before("main.aspects.Pointcuts.allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvise() {
        System.out.println("beforeReturnLoggingAdvise: Log #3");
    }

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to take a book");
    }

    @After("execution(void main.entitys.librarys.UniLibrary.throwBook())")
    public void afterThrowBookAdvice() {
        System.out.println("afterThrowBookAdvice: Thrown the book");
    }

    @Before("execution(public void get*())")
    public void beforeAllGet() {
        System.out.println("beforeAllGet: try to take a something");
    }

    @After("execution(* *())")
    public void afterAllEmptyParameters() {
        System.out.println("afterAllEmptyParameters: -----------");
    }

    @Before("execution(* *(..))")
    public void beforeEverythingAdvice() {
        System.out.println("beforeEverythingAdvice: ///////////");
    }

    @Before("execution(* getBook(main.entitys.Book))")
    public void beforeBookAdvice() {
        System.out.println("beforeBookAdvice: book");
    }*/
    @Before("main.aspects.Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvise(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("signature() = " + signature);
        System.out.println("signature.getMethod() = " + signature.getMethod());
        System.out.println("signature.getReturnType() = " + signature.getReturnType());
        System.out.println("signature.getName() = " + signature.getName());

        if (signature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj :
                    arguments) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Information about book: " +
                            "\n book name: " + book.getBookName() + "\n book author: " + book.getAuthor() +
                            "\n year of publication: " + book.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Person name who adding the book: " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvise: logging add book");
        System.out.println("----------------------------------------------");
    }
}
