package main.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvise() {
        System.out.println("beforeGetStudentsLoggingAdvise: log getting list of students before getStudents() method");
    }

    @AfterReturning(pointcut = ("execution(* getStudents())"),
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvise(JoinPoint joinPoint, List<Student> students) {
        Student student = students.get(0);
        student.setName("Mr. " + student.getName());
        student.setAvgDegree(student.getAvgDegree() + 1.25);

        System.out.println("afterReturningGetStudentsLoggingAdvise: after returning log getting list of students before getStudents() method");
    }*/

    @AfterThrowing(pointcut = ("execution(* getStudents())"),
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvise(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvise: after throwing log getting list of students before getStudents() method" +
                exception);
    }
}
