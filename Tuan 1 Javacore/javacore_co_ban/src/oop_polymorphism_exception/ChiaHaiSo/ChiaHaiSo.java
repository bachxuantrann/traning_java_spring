package oop_polymorphism_exception.ChiaHaiSo;

import java.util.Scanner;

public class ChiaHaiSo {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        double a,b;
        System.out.println("Nhap so a: ");
        a=sc.nextDouble();
        System.out.println("Nhap so b: ");
        b=sc.nextDouble();
        try {
            System.out.println("Ket qua cua phep chia 2 so: ");
            System.out.println(divide(a,b));
        } catch (CustomArithmeticException ex){
            System.out.println("Ngoai le xay ra: "+ex.getMessage());
        } finally {
            sc.close();
            System.out.println("Ket thuc chuong trinh");
        }
    }
    public static double divide(double a,double b) throws  CustomArithmeticException{
        if (b==0){
            throw new CustomArithmeticException("Khong the chia cho 0 !");
        }
        return a/b;
    }
}
