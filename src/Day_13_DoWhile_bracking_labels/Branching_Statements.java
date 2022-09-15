package Day_13_DoWhile_bracking_labels;

import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1-Toplama \n 2-Çıkarma" + "\n 3-Çarpma\n 4-Bölme\n 5-Çıkış");
            System.out.println("Seçiminiz: ");
            int i = scan.nextInt();
            if (i == 1) {
                while (true) {

                    System.out.println("Toplama işlemi çıkış için toplam 0 olmalı");
                    System.out.println("1.Sayı: ");
                    int a = scan.nextInt();
                    System.out.println("2.Sayı: ");
                    int b = scan.nextInt();
                    System.out.println("toplam= " + (a + b));
                    if ((a + b) == 0) {
                        break;
                    }
                }
            }

            if (i == 5) {
                break;
            }
        }
    }
}
