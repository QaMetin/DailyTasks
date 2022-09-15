package Day_27_Array_Lab_Cont;

import Day_26_Arrays_Lab.ArrayExample_1;

import java.util.Arrays;

public class Array_Example_2 {
    public static void main(String[] args) {
        int[] sayilar = {1, 5, 8, 99, 74, 85, 36};
        int[] sayilar1 = {1, 5, 2, 3, 4, 85, 36};
        int[] sayilar2 = {1, 1, 4, 2, 5, 7, 9};
        int[] sayilar3 = {1, 2, 3, 5, 4, 1, 4, 4};
        String alinti = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek dolu karnı horlarken\\n\" +\n" +
                "//                \"// bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,\\n\" +\n" +
                "//                \"// filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının üzerine oturdu, salıncak gibi\\n\" +\n" +
                "//                \"// bir o yana bir bu yana sallanırken eğleniyordu";
        String alinti2 = "araba ile yola çıktık fakat araba arıza yaptı";

        //System.out.println(enBuyukIkıncıSayi(sayilar));
        //System.out.println(ardArdaUc(sayilar1));
        //ArrayExample_1.arrayYazdir(yalnızSayilar(sayilar2));
        //System.out.println(enCokSayi(sayilar3));
        //System.out.println(dublicateControl(sayilar3));
        //System.out.println(findCountLetter(alinti, "o"));
        //System.out.println(findCountLetter_2(alinti, "o"));
        //System.out.println(findCountLetter_3(alinti, "o"));
        //System.out.println(findCountLetter_4(alinti, "o"));
        //System.out.println(dublicateControlString(alinti2));
        //ArrayExample_1.arrayYazdir(enKucukSayiVeSifirAta(sayilar));
        //ArrayExample_1.arrayYazdir(degerAtamaKontrol(sayilar,5,8,1));
    }

    //Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140 arasında rasgele
    // sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun. (Array.sort kullanılmayacak)
    public static int enBuyukIkıncıSayi(int[] arr) {
        int a = arr[0];
        int b = arr[0];
        for (int sayi : arr) {
            if (sayi > a) {
                a = sayi;
            }
        }
        for (int sayi : arr) {
            if (sayi > b && sayi < a) {   //sayi!=a da olabilir
                b = sayi;
            }
        }
        return b;
    }

    //Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
// [2,3,3,4,5,6,5,6,3] → true
// [2,4,5,8,8] → false
    public static boolean ardArdaUc(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return true;
            }
        }
        return false;
    }


//Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu yazınız.
// (sağında veya solunda aynı sayı yoksa yalnızdır.) (return array)
//[2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
// [2,2,5,8,8] →5

    public static String[] yalnızSayilar(int[] arr) {
        String yalnızSayilar = "";
        if (arr.length == 1) {
            yalnızSayilar += arr[0] + " ";
            return yalnızSayilar.split(" ");
        }

        if (arr[0] != arr[1]) yalnızSayilar += arr[0] + " ";

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                yalnızSayilar += arr[i] + " ";
        }

        if (arr[arr.length - 1] != arr[arr.length - 2])
            yalnızSayilar += arr[arr.length - 1] + " ";


        return yalnızSayilar.split(" ");


    }
    //Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
// (eşitlik durumda herhangi birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
//[2,3,3,3,6,6,5,6,3] → 3
// [2,4,5,8,8] → 8
// [2,4,5,8] → -1


    public static int enCokSayi(int[] arr) {
        int enCok = -1;
        int count;
        int adet = 1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > adet) {
                enCok = arr[i];
                adet = count;
            }
        }
        return enCok;
    }

//Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
//[1,2,8,1] true
//[25,89,78,98] false

    public static boolean dublicateControl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    //Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek dolu karnı horlarken
// bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,
// filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının üzerine oturdu, salıncak gibi
// bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o harfi vardır.
// (Büyük ve küçük ihmal edilecek)
    public static int findCountLetter(String str, String harf) {
        str = str.toLowerCase();
        String[] arr = str.split("");
        int count = 0;
        for (String harf_1 : arr) {
            if (harf_1.equals(harf)) {
                count++;
            }
        }
        return count;
    }

    //   2.yol
    public static int findCountLetter_2(String str, String harf) {
        return str.toLowerCase().split(harf).length - 1;

    }

    // 3.yol
    public static int findCountLetter_3(String str, String harf) {

        return str.toLowerCase().length() - str.toLowerCase().replace("o", "").length();

    }

    // 4.yol
    public static String findCountLetter_4(String str, String harf) {
        return "";
    }

    //Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
//araba ile yola çıktık fakat araba arıza yaptı true
// araba ile yola çıktık fakat arıza yaptı  false
    public static boolean dublicateControlString(String str) {
        // str=str.replace(",","").replace(";","").replace(".","").replace("'","");  //özel karakterleri temizlemek için
        String[] strArray = str.toLowerCase().split(" ");


        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i != j && strArray[i].equals(strArray[j])) {
                    return true;
                }
            }
        }
        return false;

    }

    //Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
//    indekslere 0 atayan metodu yazınız.
//   [5,7,1,9] [1,0,0,0]
    public static int[] enKucukSayiVeSifirAta(int[] arr) {
        int enKucukSayi = arr[0];
        for (int sayi : arr) {
            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }
        int[] yeniArray = new int[arr.length];
        yeniArray[0] = enKucukSayi;
        for (int i = 1; i < yeniArray.length; i++) {
            yeniArray[i] = 0;
        }
        return yeniArray;

    }

    // Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
    // [6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
    // [5,7,8,5,9] → [5,7,8,5,9]

    public static int[] degerAtamaKontrol(int[] arr,int ilkDeger,int kontroldegeri, int atanacakSayi){
        int[] yeniArray=new int[arr.length];

        yeniArray[0]=arr[0];

        for(int i=0; i<yeniArray.length-1; i++){
            if(arr[i]==ilkDeger && arr[i+1]==kontroldegeri){
                yeniArray[i+1]=atanacakSayi;
            }
            else{
                yeniArray[i+1]=arr[i+1];
            }
        }
        return yeniArray;
    }
}

















