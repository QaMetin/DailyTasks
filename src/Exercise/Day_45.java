package Exercise;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class Day_45 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int n = scan.nextInt();

        if(word.length()<n){
            System.out.println(word.substring(0,word.length()).concat(word));
        }else {
            System.out.println(word.substring(0, n).concat(word.substring(word.length() - n)));
        }





    }
}
