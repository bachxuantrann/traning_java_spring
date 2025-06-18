package tong_quan_java;

import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap so a: ");
        a= sc.nextInt();
        System.out.println("Nhap so b: ");
        b= sc.nextInt();
        try{
            long tong,hieu,tich;
            float thuong;
            tong=a+b;
            hieu=a-b;
            tich=a*b;
            thuong=a/b;
            System.out.println("Tong cua a+b : "+tong);
            System.out.println("Hieu cua a-b : "+hieu);
            System.out.println("Tich cua a*b : "+tich);
            System.out.println("Thuong cua a/b : "+thuong);
        } catch (ArithmeticException ex){
            System.out.println("b phai la so khac 0 !");
        }
        sc.close();
    }
}
