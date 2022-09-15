package review;

import java.util.Arrays;

public class LiveStudy {
    public static void main(String[] args) {
       /* int[] arry;
        arry=new int[10];
        arry[3]=5;
        arry[5]=5;
        for (int i:arry){
//            System.out.print(i+" ");
        }

        int[] arr=new int[6];
        arr[4]=5;
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        arr[arr.length-1]=10;
        for(int i: arr){
            System.out.print(i+" ");
        }*/

        String[] arr1={"merhaba", "dünya"};
        Arrays.fill(arr1,"metin10");
        for(String str:arr1){
            System.out.print(str+10+"\n");
        }
    }


}
