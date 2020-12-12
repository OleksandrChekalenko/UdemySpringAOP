package main.entitys;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Alex Bengee", 4, 10.5);
        Student student2 = new Student("Ben Fotre", 2, 6);
        Student student3 = new Student("Cagy Johnson", 1, 9.2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
