package Day_23_Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        //for döngüsü ile yazdır
/*
        int[] sayi=new int[4];
        sayi[0]=7;
        sayi[1]=8;
        sayi[2]=10;
        sayi[3]=12;
        for (int i = 0; i < 4; i++) {

            System.out.println(sayi[i]*sayi[i]);  //veya(Math.pow(sayi[i].2];

        }*/
// for döngüsünde arayımızın içerisindeki sayıların tümünün kareleri

        String[] gunler=new String[7];
        gunler[0]="Pazartesi";
        gunler[1]="Salı";
        gunler[2]="Çarşamba";
        gunler[3]="Perşembe";
        gunler[4]="Cuma";
        gunler[5]="Cumartesi";
        gunler[6]="Pazar";
       // System.out.println("Bugün günlerden "+ gunler[2]);

//haftanın 3. günün çarşamba olup olmadığını kontrol edin çarşamba ise bugün günlerden çarşambadır yazın,
// eğer değise bugün çarşamba değildir.

        if(gunler[2].equals("Çarşamba")){
           // System.out.println("haftanın üçüncü günü çarşambadır");
        }
        else{
            //System.out.println("haftanın üçüncü günü çarşamba değildir");
        }


        // günlerin içinde cuma var mıdır varsa true yoksa false şeklinde ekrana bir değer yazdırın.*/

       /* for (int i = 0; i < 7; i++) {
            if (gunler[i].equalsIgnoreCase("Cuma")){
                System.out.println("true");
                break;
            }else{
                if(i==6){
                    System.out.println("false");
                }
            }
        }
        //2.yol **********kullanışlı bir yöntem*********
        int count=0;
        for (int i = 0; i < 7; i++) {
            if (gunler[i].equalsIgnoreCase("Cuma")) {
                count++;
            }
        }
        if(count>0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("arraylerimizin içerisinde " + count + " adet " + "cuma kelimesi vardır");


       // String str[]={"pazartesi","salı","çarşamba","perşembe","cuma","cumartesi"+"pazar"};
//        String str2[]={"ahmet"};
//        System.out.println(str2[0]);


        String isim="metin";
        String[] str={"ahmet","mehmet","necati","metin","riza"};
        int count=0;
        for (int i = 0; i < 5; i++) {
            if (str[i].equalsIgnoreCase(isim)) {
                count++;
            }
        }
        if(count>0){
            System.out.println("isminiz grup içerisinde vardır");
        }else{
            System.out.println(false);
        }
        System.out.println("isminiz grup içerisinde yoktur");

        Random random=new Random();
        int x= random.nextInt(100);
        System.out.println(x); */

        Random random=new Random();
        int[] sayi=new int[20];
        for (int i = 0; i < 20; i++) {
            sayi[i]=random.nextInt(100);
            System.out.println((i)+" sayi :"+sayi[i]);

        }
        System.out.println("17. indexteki sayımız: "+sayi[17]);



// arrayimizn içindeki çift ve tek sayılarımız kaç adettir.

        int tek=0,cift=0;
        for (int i=0; i<20; i++){
            if(sayi[i]%2==0){
                cift++;
            }else {
                tek++;
            }
        }
        System.out.println("tek sayi adedi: "+tek);
        System.out.println("tek sayi adedi: "+cift);
        System.out.println("Arrayin uzunluğu: "+sayi.length);




    }

}
