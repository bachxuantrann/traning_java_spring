package collection_framework;

import java.util.*;

public class baiHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String word,paragraph;
        boolean flag = true;
        Map<String,Integer> map = new HashMap<>();
        while(flag){
            System.out.println("Chon lua chon: ");
            System.out.println("1. Nhap van ban");
            System.out.println("2. Nhap tu khoa");
            System.out.println("Nhap so khac de thoat chuong trinh !");
            try{
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        map.clear();
                        System.out.println("Nhap doan van ban:");
                        sc.nextLine();
                        paragraph = sc.nextLine();
                        paragraph = paragraph.trim();
                        List<String> words = Arrays.asList(paragraph.split("\\s+"));
                        for (String w  : words){
                            map.put(w,map.getOrDefault(w,0)+1);
                        }
                        break;
                    case 2:
                        if(map.isEmpty()){
                            System.out.println("Can nhap doan van ban truoc");
                            break;
                        }
                        System.out.println("Nhap tu khoa can dem: ");
                        sc.nextLine();
                        word = sc.nextLine();
                        word = word.trim();
                        if (!map.containsKey(word)){
                            System.out.println("Khong ton tai "+ word);
                        } else {
                            System.out.println(map.get(word));
                        }
                        break;
                    default:
                        System.out.println("Ket thuc chuong trinh !");
                        break;
                }
            } catch (InputMismatchException ex){
                System.out.println("Ban da nhap sai dinh dang! Hay nhap lua chon so nguyen.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
