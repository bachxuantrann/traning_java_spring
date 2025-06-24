package stream_api;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private int score;
    public Student(){}
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int age) {
        this.score = age;
    }
    @Override
    public String toString() {
        return name +" - "+score;
    }
}

public class baiMot {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A",5));
        students.add(new Student("B",10));
        students.add(new Student("C",20));
        students.add(new Student("D",30));
        List<Student> result = students.stream().filter(student -> student.getScore() >=7).
                sorted(Comparator.comparing(Student::getScore).reversed()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
