package day_48_Collections;

import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayşe");
        arrayList.add("ahmet");
        System.out.println("ilk durum: "+ arrayList.size());
        arrayList.add(0,"harun");
        arrayList.remove(0);
        System.out.println("son durum:"+arrayList.size());
        arrayList.get(0);

        System.out.println(arrayList.isEmpty());


    }
}
