package main.entitys;

public class Student {
    private String name;
    private int course;
    private double avgDegree;

    public Student(String name, int course, double avgDegree) {
        this.name = name;
        this.course = course;
        this.avgDegree = avgDegree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgDegree() {
        return avgDegree;
    }

    public void setAvgDegree(double avgDegree) {
        this.avgDegree = avgDegree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avgDegree=" + avgDegree +
                '}';
    }
}
