package HomeWork;

import java.util.Scanner;

public class Day_19_HomeWork {
    public static void main(String[] args) {
      siralayici();
    }

    public static void siralayici(){
        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelime giriniz");
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        String str3=scan.nextLine();
        int a=str1.length();
        int b=str2.length();
        int c=str3.length();
        String str4=" ";
        if(a>b && a>c){
            if(b>c) {
                System.out.println(str1.concat((str2.concat(str4.concat(str3)))));
            }else{
                System.out.println(str1.concat(str4.concat(str3.concat(str4.concat(str2)))));
            }
        } else if (b>a && b>c) {
            if(a>c){
                System.out.println(str2.concat(str4.concat(str1.concat(str4.concat(str3)))));
            }else {
                System.out.println(str2.concat(str4.concat(str3.concat(str4.concat(str1)))));
            }
        } else if (c>a && c>b) {
            if(a>b){
                System.out.println(str3.concat(str4.concat(str1.concat(str4.concat(str2)))));
            }else{
                System.out.println(str3.concat(str4.concat(str2.concat(str4.concat(str1)))));
            }
        }




    }
}
