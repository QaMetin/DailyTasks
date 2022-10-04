package day_47_Exception_Cont;

import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {
        //integer değişken kabul eden bir metot
        /*
        boolean devam =true;
        while(devam){
            try{
                Scanner scan =new Scanner(System.in);
                System.out.println("Sayı: ");
                int x=scan.nextInt();


            }catch (Exception e){
                System.out.println("lütfen tekrar deneyiniz");
                continue;
            }
            System.out.println("programdan çıkış yapılıyor");
            devam=false;
        }

        //2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        // 2 adet catch bloğu kullanın

//        int x=45;
//        int y=5; // ynin 0 olabileceğini değerlendirin.

        boolean devam =true;
        while(devam){
            try{
                Scanner scan =new Scanner(System.in);
                System.out.println("Sayı1: ");
                int x=scan.nextInt();
                System.out.println("Sayı2: ");
                int y=scan.nextInt();
                int sonuc=x%y;
                System.out.println("sonuc: " +sonuc);

            }catch (ArithmeticException a){
                System.out.println("Aritmetik bir hata alındı.");
                continue;
            }catch (Exception e){
                System.out.println("lütfen tekrar deneyiniz");
                continue;
            }finally {
                System.out.println("finally block");
            }
            System.out.println("programdan çıkış yapılıyor");
            devam=false;
        }*/
// personel işlerini tutan bir array tanımlayın ve içerisinde 5 adet integer türünde
// id gönderin (arr[]={}) bu idlerin içerisinde 0 var ise illegalArgumentException hatası döndürün
// bunu bir checkArrayId metodun içerisinde yazın tru veya false return edebilirsiniz.



     int arr[]={111,125,0,36};
        System.out.println(checkArrayId(arr));

    }
    public static boolean checkArrayId(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                throw new IllegalArgumentException("Personel Id sıfır olamaz");
            }
        }
        return true;
    }
//array içinde en büyük sayının index numarasını getiren metodu yazınız.
// eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.


}
