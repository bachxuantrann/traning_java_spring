package generics_lamda;

import java.util.ArrayList;
import java.util.List;

public class baiHai {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        FilterInteger filterNumber = (item) -> {
            if(item % 2 == 0){
                System.out.println(item);
            }
        };
        list.forEach(item -> filterNumber.filter(item));
    }

}
