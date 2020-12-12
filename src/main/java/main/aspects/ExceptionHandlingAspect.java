package main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionHandlingAspect {

    @Before("main.aspects.Pointcuts.allGetMethods()")
    public void beforeGetExceptionAdvise() {
        System.out.println("beforeGetExceptionAdvise: catch exceptions " +
                "\n when trying to get the book/magazine");
    }
}
