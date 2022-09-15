package Interview;

import java.util.ArrayList;

public class Interview {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> sayiKaydir(int[] array, int kaymaMiktari){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int sayi:array) {
            arrayList.add(sayi);
        }

        for(int i=0; i<kaymaMiktari; i++){
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        return arrayList;

    }
}
