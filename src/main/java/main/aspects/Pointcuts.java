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

    @Pointcut("execution(* main.entitys.librarys.UniLibrary.get*())")
    public void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.entitys.librarys.UniLibrary.return*())")
    public void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    public void allGetAndReturnMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.entitys.librarys.UniLibrary.*(..))")
    public void allUniLibraryMethods(){}

    @Pointcut("execution(public void main.entitys.librarys.UniLibrary.returnMagazine())")
    public void returnMagazinePointcut() {}
}
