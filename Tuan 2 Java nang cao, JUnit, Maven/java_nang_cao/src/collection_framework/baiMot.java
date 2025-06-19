package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class baiMot {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("1. Them ten nguoi");
            System.out.println("2. Hien thi danh sach");
            System.out.println("Phim bat ki de thoat chuong trinh !");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Nhap ten: ");
                        String name = sc.nextLine();
                        listOfNames.add(name);
                        break;
                    case 2:
                        System.out.println("Hien thi danh sach:");
                        Collections.sort(listOfNames);
                        int cnt = 0;
                        for (String n : listOfNames) {
                            System.out.printf("%d %s%n", ++cnt, n);
                        }
                        break;
                    default:
                        System.out.println("Ket thuc chuong trinh !");
                        flag = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ban da nhap sai dinh dang! Hay nhap so nguyen.");
                sc.nextLine(); //
            }
        }
        sc.close();
    }
}
