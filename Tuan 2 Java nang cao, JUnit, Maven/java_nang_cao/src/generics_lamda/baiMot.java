package generics_lamda;

import java.util.ArrayList;

public class baiMot {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        printArrayList(list);
    }
    public static <T> void printArrayList(ArrayList<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }
}
