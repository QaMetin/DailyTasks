package day_44_OOP_ReviewCont.finalKeyWord;

import Day_30.ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {
         final String[] BATCH2={"Talip","Alparslan"};
        BATCH2[0]="İbrahim";
        System.out.println(Arrays.toString(BATCH2));
      //  BATCH2=new String[]{"Ali","Mehmet"}; //BATCH2 final olduğu için yer refaransı değiştirilemez
        final ArrayList<String>NAME=new ArrayList<>();
        NAME.add("İhsan");
        NAME.add("Enes");




    }



}
