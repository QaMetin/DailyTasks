package day_48_Collections;

import java.util.Scanner;

public class Collections_Lessons {
    public static void main(String[] args) {
    veriAlveEkranaYazdır();
    }

    public static void veriAlveEkranaYazdır(){
        Scanner scan=new Scanner(System.in);
        System.out.print("kaç adet sayi girmek istiyorsunuz: ");
        int x= scan.nextInt();
        int[] array=new int[x];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("sayi: ");
            array[i]= scan.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
