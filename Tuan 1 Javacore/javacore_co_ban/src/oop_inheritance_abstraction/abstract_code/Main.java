package oop_inheritance_abstraction.abstract_code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        boolean flag=true;
        do {
            System.out.println("Chon lua chon: ");
            System.out.println("1. Tinh dien tich hinh tron");
            System.out.println("2. Tinh dien tich hinh chu nhat");
            System.out.println("Bam nut khac de thoat chuong trinh.");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ban kinh hinh tron: ");
                    double radius=sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Dien tich hinh tron la: "+ circle.getArea());
                    break;
                case 2:
                    System.out.println("Nhap chieu dai: ");
                    double length=sc.nextDouble();
                    System.out.println("Nhap chieu rong: ");
                    double width=sc.nextDouble();
                    Retangle retangle = new Retangle(length, width);
                    System.out.println("Dien tich hinh chu nhat la: "+ retangle.getArea());
                    break;
                default:
                    System.out.println("Thoat chuong trinh thanh cong !");
                    flag=false;
                    break;
            }

        } while (flag);
        sc.close();
    }
}
