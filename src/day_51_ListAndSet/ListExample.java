package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Bir arrayi listin içine alan ve list return eden bir metod yazınız?
    int[] arr1={1,2,3,4,5};
        System.out.println(addListMethod(arr1));
        List<Integer>list2=new ArrayList<>(addListMethod(arr1));
        System.out.println(list2.get(0));


    }

    public static List<Integer> addListMethod(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonunda bir integer değer
    //döndüren metodu yazanız.

    public static List<Integer> clearAllList(List<Integer> list, Integer data){
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)){
                list2.add(list.get(i));

            }

        }
        return list2;
    }

}
