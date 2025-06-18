package dieu_kien_va_vong_lap;

public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("==== Bang Cuu Chuong ====");
        for (int i =2;i<=9;i++){
            for (int j=1;j<=10;j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("==== Bang Cuu Chuong ====");
    }
}
