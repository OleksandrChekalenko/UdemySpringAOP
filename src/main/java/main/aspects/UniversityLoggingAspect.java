package main.aspects;

import main.entitys.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
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
    }
}
