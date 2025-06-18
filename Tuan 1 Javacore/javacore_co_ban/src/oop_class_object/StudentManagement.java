package oop_class_object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int choice,quantity;
        boolean flag = true;
        do {
            System.out.println("Chon lua chon: ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xem danh sach sinh vien");
            System.out.println("3. Xem diem trung binh cua danh sach sinh vien");
            System.out.println("Nhap so khac de thoat chuong trinh !");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong sinh vien can them: ");
                    quantity = sc.nextInt();
                    for (int i=0;i<quantity;i++) {
                        System.out.println("Nhap thong tin sinh vien so: "+(i+1));
                        Student student = new Student();
                        student.nhapThongtin(sc);
                        students.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien: ");
                    for (Student student : students) {
                        System.out.println(student.toString());
                    }
                    break;
                case 3:
                    System.out.printf("Diem trung binh cua danh sach sinh vien la: %.2f",diemTrungBinhCuaDanhSachSinhVien(students));
                    System.out.println();
                    break;
                default:
                    System.out.println("Thoat chuong trinh !");
                    flag= false;
                    break;

            }
        } while (flag);
    }
    public static double diemTrungBinhCuaDanhSachSinhVien(List<Student> students) {
        if (students.isEmpty()){
            return 0;
        }
        double sum =0;
        for (Student student : students) {
            sum+=student.getScore();
        }
        return sum/students.size();
    }
}
