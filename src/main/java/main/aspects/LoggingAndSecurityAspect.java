package main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* main.librarys.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.librarys.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.librarys.UniLibrary.*(..))")
    private void allUniLibraryMethods(){}

    @Pointcut("execution(public void main.librarys.UniLibrary.returnMagazine())")
    private void returnMagazinePointcut() {}

    @Before("allUniLibraryMethods() && !returnMagazinePointcut()")
    public void beforeAllMethodsExeptGetMagazineAdvise() {
        System.out.println("beforeAllMethodsExeptGetMagazineAdvise: Log #10");
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvise() {
        System.out.println("beforeGetLoggingAdvise: Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvise() {
        System.out.println("beforeReturnLoggingAdvise: Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvise() {
        System.out.println("beforeReturnLoggingAdvise: Log #3");
    }

    /*@Pointcut("execution(* get*())")
    private void allGetMethods(){}

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

    @After("allGetMethods()")
    public void afterAllGetMethods() {
        System.out.println("afterAllGetMethods");
    }*/

}
