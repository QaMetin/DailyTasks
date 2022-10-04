package day_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,44,65,46,89,6));
        list.forEach(p-> System.out.print(p+" "));
        System.out.println();
    }
}
