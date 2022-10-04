package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExampleInterview {
    public static void main(String[] args) {

        Integer[] arr1={0,2,0,4,5};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr1));
        System.out.println(moveAllZeroAddEnd(list));

        //Inetrview questions
        //list içerisindeki tüm sıfırları lstin sonu yazan metodu yazınız.
        // giriş 0,2,3,5,0,4,5 çıkış: 2,3,5,4,5,0,0

    }
    public static List<Integer> moveAllZeroAddEnd(List<Integer> list){
        int originalSize= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize= list.size();

        for (int i = 0; i < originalSize-newSize; i++) {
            list.add(0);

        }
        return list;
    }
    //ödev1
    //interview questions List<Strings>
    //List içerisindeki polidrom kelimeleri list içerisinden silen metodu yazınız.
    //  ey, edip, adanada, pide, ye


    //ödev2
    // list içerisindeki polindrom kelimeler varsa list içerisinden her iki kelimeyi silen metodu yazınız.
    // ey, edip , adanada, pide, ye    sonuç= boş


}
