package day_51_ListAndSet;

import java.util.Scanner;
import java.util.*;

public class OdevPalindrom {
//2.Ödev
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Cümleyi giriniz :");
        String cumle=scan.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < cumle.length()/2; i++) {
            stack.push(cumle.charAt(i));
        }
        if (isPalindrom(cumle,stack)){
            System.out.println("Cümle palindromdur.");
            System.out.println(cumle.replaceAll(cumle, "[ ]"));

        }
        else {
            System.out.println("Cümle palindrom değildir.");
        }

    }
    public static boolean isPalindrom(String cumle,Stack<Character> stack){
        for (int i = (cumle.length()/2)+1; i < cumle.length(); i++) {
            if(cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;

    }


}
