package main.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("main.aspects.Pointcuts.allUniLibraryMethods() && !main.aspects.Pointcuts.returnMagazinePointcut()")
    public void beforeAllMethodsExeptGetMagazineAdvise() {
        System.out.println("beforeAllMethodsExeptGetMagazineAdvise: Log #10");
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

    @After("execution(void main.librarys.UniLibrary.throwBook())")
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
    }
}
