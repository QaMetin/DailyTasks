package day_46_Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi :");
            int x=scan.nextInt();
            System.out.println("bölüm :");
            int y=scan.nextInt();
            System.out.println("sonuc: "+(x/y));

        }catch (Exception e){ //hata alındıktan sonra yapılan işlem
            e.printStackTrace();
            System.out.println("Lütfen tekrar deneyiniz");

        }
        System.out.println("program sonladı");
    }
}
