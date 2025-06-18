package tong_quan_java;

import java.util.Scanner;

public class ChuViVaDienTichHinhTron {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh cua hinh tron: ");
        double banKinh = sc.nextDouble();
        double chuVi = 2*PI*banKinh;
        double dienTich = PI*banKinh*banKinh;
        System.out.printf("Chu vi cua hinh tron la: %.2f",chuVi);
        System.out.println();
        System.out.printf("Dien tich cua hinh tron la %.2f",dienTich);
        sc.close();
    }
}
