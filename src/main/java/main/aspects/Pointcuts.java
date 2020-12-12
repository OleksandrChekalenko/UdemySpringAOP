package main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {

    @Pointcut("execution(* get*())")
    public void allGetMethods(){}

    @Pointcut("execution(* add*(.. ))")
    public void allAddMethods(){}

    @Pointcut("execution(* main.librarys.UniLibrary.get*())")
    public void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.librarys.UniLibrary.return*())")
    public void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    public void allGetAndReturnMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.librarys.UniLibrary.*(..))")
    public void allUniLibraryMethods(){}

    @Pointcut("execution(public void main.librarys.UniLibrary.returnMagazine())")
    public void returnMagazinePointcut() {}
}
