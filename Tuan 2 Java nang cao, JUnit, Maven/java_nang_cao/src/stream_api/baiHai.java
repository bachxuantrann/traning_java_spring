package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2{
    private String name;
    private int age;
    public Student2(){}
    public Student2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class baiHai {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("a",10));
        students.add(new Student2("ab",10));
        students.add(new Student2("abc",10));
        students.add(new Student2("aa",10));
        students.add(new Student2("bb",20));
        students.add(new Student2("bc",20));
        students.add(new Student2("d",40));
        students.add(new Student2("dd",40));
        Map<Integer,List<Student2>> result = students.stream().collect(Collectors.groupingBy(s -> s.getAge()));
        result.forEach((age,student)->{
            System.out.println(age);
            student.forEach(s->System.out.println(s.getName()));
        });
    }
}
