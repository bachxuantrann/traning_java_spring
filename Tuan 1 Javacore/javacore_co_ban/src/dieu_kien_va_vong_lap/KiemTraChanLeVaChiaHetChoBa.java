package dieu_kien_va_vong_lap;

import java.util.Scanner;

public class KiemTraChanLeVaChiaHetChoBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra so chan le va chia het cho 3");
        System.out.println("Nhap so bat ki: ");
        long x = sc.nextLong();
        if (x%2==0){
            System.out.println(x+" la so chan");
        } else {
            System.out.println(x+" la so le");
        }
        if (x%3==0){
            System.out.println(x+" chia het cho 3");
        } else {
            System.out.println(x+" khong chia het het cho 3");
        }
        sc.close();
    }
}
