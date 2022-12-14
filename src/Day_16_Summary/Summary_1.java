package Day_16_Summary;

import java.util.Scanner;

public class Summary_1 {
    public static void main(String[] args) {
//Sample_1
//        System.out.println("Math.max(45,60)= "+Math.max(45,60));

       /* Scanner scan=new Scanner(System.in);


        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi= scan.nextInt();
        System.out.println("basamakSayisi = " + basamakSayisi(sayi));
        System.out.println("mathPow(2,3) = " + mathPow(2, 3));
        amstrongTreeDigits(100,999);
        fibonacci(5);*/

        System.out.println("ebob(50,60) = " + ebob(85, 17));
    }
    //Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız.
    public static int basamakSayisi(int sayi){
       int basamak=0;
       while(sayi>0){
           sayi/=10;      //sayi=1345 sayi/10=134 sayi/10=13 sayi/10=1 sayi/10=0
           basamak++;     //                1           2      3         4

       }

        return basamak;

    }

//Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun mathPow metodu oluşturun işlemler bu metodun
// içerisinde yapılsın. (Math sınıfının pow metodunu siz yapacaksınız)
//Math.pow(2,3)=8
// mathPow(2,3)=8
    public static int mathPow(int taban, int us){
        int sonuc=1;
        for(int i=0;i<us;i++){
            sonuc*=taban;
        }
        return sonuc;
    }
    //100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın.
    // Sayının her basamağının küplerinin toplamı
    // sayının kendisine eşitse bu sayı Armstrong sayısı olarak adlandırılır.
    // 142   1*1*1+4*4*4+2*2*2=142 ise amstrong sayıdır.



    public static void amstrongTreeDigits(int start,int end){
        for (int i=start; i<=end;i++){
            int x,y,z,sonuc;
            x=i/100;
            y=i%100/10;
            z=i%10;
            sonuc=x*x*x+y*y*y+z*z*z;
            if(i==sonuc){
                System.out.print(sonuc+" ");
            }
        }
    }
    //Kullanıcı tarafından girilen n terimli Fibonacci
    // dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 21
    public static void fibonacci(int adet){
        int x=0,y=1;
        System.out.print(x+" "+y);
        for (int i=2;i<adet; i++){
            int z=y+x;
            System.out.print(" "+z);
            x=y;
            y=z;

        }
    }
    //Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırı. 1 ile 7 sonuc 1 6-12(6)

   public static int ebob(int x,int y){
        int sonuc=1;
        for(int i=1;i<=minimumSayi(x,y);i++) { //Math.min yerine 2. yol minimumsayı metodu kullandık
            if (x%i==0 && y%i==0) {
                sonuc = i;
            }
        }
      return sonuc;
   }
    public static int minimumSayi(int x,int y){
        int minimum=(x>=y) ? y:x;
        return minimum;
    }


}
