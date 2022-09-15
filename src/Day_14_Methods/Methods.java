package Day_14_Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        // ortalama();
//        kiloToOkka();
//        message4(3);
//yas(1981);
//        kuvvet(2,3);
//        kuvvet(3,2);

//gorunum(5,9);
//calculator(8,9,"*");

    }

    public static void ortalama() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ortalama için 3 sayı giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        int sayi3 = sc.nextInt();

        System.out.println("girmiş olduğunuz sayıların aritmetik ortalaması= " + (sayi1 + sayi2 + sayi3) / 3 + " dir");



    }



    public static void kiloToOkka(){
        Scanner sc = new Scanner(System.in);
        System.out.println("kiogramı girin : ");
        double kilogram= sc.nextDouble();
        System.out.println(kilogram / 1.282);


    }
    public static void message4(int num){
        System.out.println(num+" burada");
        System.out.println(num+3);

    }
    public static void yas(int born){

        System.out.println(2022-born);
    }

    public static void kuvvet(int sayi1,int sayi2) {
        double pow=Math.pow(sayi2,sayi1);
        System.out.println(pow);
    }
    public static void gorunum(int sayi1,int sayi2) {

        System.out.println(sayi1+" +"+sayi2+" ="+(sayi1+sayi2));
    }
    public static void calculator(double num1,double num2,String str){
        if(str.equals("+")){
            System.out.println(num1+num2);

        } else if (str.equals("-")) {
            System.out.println(num1-num2);
        }else if (str.equals("*")){
            System.out.println(num1*num2);
        } else if (str.equals(num1/num2)) {
            System.out.println(num1/num2);
        }else {
            System.out.println("Matematiksel operator geçerli değil");
        }
    }


}

