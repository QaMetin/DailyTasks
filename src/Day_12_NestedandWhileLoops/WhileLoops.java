package Day_12_NestedandWhileLoops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        int i=0;
        while (i<5){
            System.out.println("metin");
            i++;
        }

        int i=0;
        while (i<21){
            System.out.println(i+"merhaba dünya");
            i++;
        }
        int i=0;
        while (i<100){
            System.out.println(i+"");
            i++;
        }
        int i=15;
        while (i<=100){
            System.out.print(i+" ");
            i++;
        }
        int i=100;
        while (i>0){
            System.out.print(i+" ");
            i--;
        }

        int i=0;
        while (i<=100) {
            System.out.print(i + " ");
            i += 2;

        }
        int i=0;
        while (i<=100) {
            System.out.print(i + " ");
            i += 2;

        }

        int i=10;
        while (i<1000) {
            System.out.print(i + " ");
            i += 10;


        }
        int i=1,sonuc=1;
        while (i<=8) {

            sonuc*=i;



        }
        System.out.print("sonuc= "+sonuc);

        int i = 0;
        while (i < 20) {

            int sonuc = i * i * i;
            System.out.println(i + " in küpü" + sonuc);
            i+=3;

        }*/

        Scanner scan=new Scanner(System.in);
        String exit="x";
        while (true){
            System.out.println("Lütfen kelime giriniz: ");
            String kelime= scan.next();

            if (kelime.equals("x")){
                break;

            }
            System.out.print("kaç defa yazdırmak istersiniz: ");
            int repeat= scan.nextInt();
                for (int i=0; i<repeat; i++){
                    System.out.println(kelime);
                }

        }



    }
}
