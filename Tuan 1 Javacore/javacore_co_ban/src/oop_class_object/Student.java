package oop_class_object;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double score;
    public Student(){}

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sinh Vien Ten = " + name + ", Tuoi = " + age + ", Diem = " + score;
    }
    public void nhapThongtin (Scanner sc){
        System.out.println("Nhap ten sinh vien: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien: ");
        age = sc.nextInt();
        System.out.println("Nhap diem sinh vien: ");
        score = sc.nextInt();
    }
}
