package main.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

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
}
