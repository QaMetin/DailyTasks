package Exercise;

import java.util.Scanner;

public class Day_32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1,num2;
        num1=scan.nextInt();
        num2=scan.nextInt();
        int max=(num1<=num2)? num2:num1;
        System.out.println(max+" büyüktür");

    }
}
