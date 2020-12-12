package main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SecurityAspect {

    @Before("main.aspects.Pointcuts.allGetMethods()")
    public void beforeGetSecurityAdvise() {
        System.out.println("beforeGetSecurityAdvise: security check for the rights");
    }
}
