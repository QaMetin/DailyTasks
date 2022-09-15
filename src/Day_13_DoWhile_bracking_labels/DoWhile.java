package Day_13_DoWhile_bracking_labels;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random=new Random();
        int i= random.nextInt(50);

        System.out.println("Tuttuğum sayıyı bul bakalııııım 7 hakkın var\n");
        int j=1;
        do{
            System.out.print(j+" Tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin==i){
                System.out.println("tebrikler sayıyı buldun");
                break;
            }
            else if(tahmin>i){
                System.out.println("aşağı");
            }
            else{
                System.out.println("yukarı");
            }
            j++;
        }while(j<6);

        System.out.println(" Tuttuğum sayı : "+i);
    }
}
