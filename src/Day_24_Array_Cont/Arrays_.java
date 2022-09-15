package Day_24_Array_Cont;

import java.util.*;

public class Arrays_ {
    public static void main(String[] args) {
       /* int[] iArry=new int[5];
        iArry[0]=10;
        iArry[1]=20;
        iArry[2]=30;
        iArry[3]=40;
        iArry[4]=50;
        for (int i:iArry) {
            System.out.println(i);
        }
        for (int i = 0; i < iArry.length; i++) {
            System.out.println(iArry[i]);

        }

        String[] sArry=new String[3];
        sArry[0]="muhammed";
        sArry[1]="Alpaslan";
        sArry[2]="beytullah";
        System.out.println(sArry[0].length());
        System.out.println(sArry[0]);
        System.out.println(Arrays.toString(sArry));
        System.out.println(Arrays.toString(iArry));     */

        int[] iArr1={1,2,3,4,5,6,7};
        int[] iArr2={1,2,3,4,5};
        //System.out.println(checkLength(iArr));
       //System.out.println(checknumber(iArr1));
        //boolean b=iArr[0]==iArr2[0]; //task3 farklı biryol
       // System.out.println(b);       //task3 farklı biryol
        //System.out.println(twoArrayFirstNumber(iArr, iArr2));
        //System.out.println(Arrays.toString(newArrayWithFirstElements(iArr, iArr2)));
        //System.out.println(sumArrayElements(iArr));
       // System.out.println(Arrays.toString(concatArray(iArr1, iArr2)));
        //System.out.println(Arrays.toString(concatArray(iArr1,iArr2)));
       //System.out.println(biggestArry(iArr1));
        //System.out.println(Arrays.toString(swapFirstAndLast(iArr1)));
        //System.out.println(Arrays.toString(reverseArray(iArr1)));
        System.out.println(sumOfOddIdx(iArr2));
    }
//1_Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean checkLength(int[] iArry){
        return  iArry.length>5;
    }
//2_Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean checknumber(int[] iArry){
        int param=5;
        for (int i = 0; i < iArry.length; i++) {
            if(iArry[i]==param){
                return true;
            }

        }
        return false;


    }
//3_Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
    public static boolean twoArrayFirstNumber(int [] sayi1,int[] sayi2 ){

            return sayi1[0]==sayi2[0];
    }
//4_ 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.

    public static int[] newArrayWithFirstElements(int[] iArr,int[] iArr2){
        int [] newArr=new int[2];
        newArr[0]=iArr[0];
        newArr[1]=iArr2[0];
        return newArr;
    }

//5_ Int array in elemanlarının toplamını veren bir method yazın

    public static int sumArrayElements(int[] iArry){
        int sum=0;
        for (int i = 0; i < iArry.length; i++) {
            sum+=iArry[i];
        }

        return sum;
    }
 //Verilen 2 arrayi birleştirip array döndüren bir method yazın

    public static int[] concatArray(int[] Arr1,int[] Arr2){
        int[] newArry=new int[Arr1.length+ Arr2.length];
        for (int i = 0; i < newArry.length; i++) {
           if(i< Arr1.length){
               newArry[i]=Arr1[i];
           }else{
               newArry[i]=Arr2[i- Arr1.length];
           }
        }
        return newArry;
    }

    //İnt arry in en büyük elemanının döndüren bir method yazın
    public static int  biggestArry(int[] arr) {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }

    //Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.

    public static int[] swapFirstAndLast(int[] arr){
        int temp=arr[0];
        arr[0]=arr[arr.length-1]; //{7,2,3,4,5,6,7}
        arr[arr.length-1]=temp;   //{7,2,3,4,5,6,1}

        return arr;
    }

    public static int[] reverseArray(int[] arr){   //******************reverse array önemli
        int[] ints=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ints[i]=arr[(arr.length-1)-i];

        }
        return ints;
    }
//Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static int sumOfOddIdx(int [] arr){
        int sum=0;
        for (int i = 1; i <arr.length ; i+=2) {
          sum+=arr[i];
        }
        return sum;
    }


}
