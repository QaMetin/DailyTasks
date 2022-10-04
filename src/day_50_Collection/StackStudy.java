package day_50_Collection;

import java.util.Arrays;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {

        //push()-peek()-pop()...

        Stack<Integer> stc = new Stack<>();
        stc.addAll(Arrays.asList(2,4,6,7,8));
        System.out.println("stc = " + stc);

        stc.push(1);
        System.out.println("stc = " + stc); //[2, 4, 6, 7, 8, 1]

        stc.push(11);
        System.out.println("stc = " + stc);

        //pop()
        System.out.println("stc.pop() = " + stc.pop());//pop() metodu remove yapar, remove yaptığı
        System.out.println("stc = " + stc);

        //peek()
        System.out.println("stc.peek() = " + stc.peek()); //1 en üstteki değeri döndürür

        System.out.println("stc = " + stc);//[2, 4, 6, 7, 8, 1]


        //search
        System.out.println("stc.search(0) = " + stc.search(8));


    }
}
