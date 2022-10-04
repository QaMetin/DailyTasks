package day_52;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,5,6,7,8));
        // Union
//        set1.addAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        //Intersection
//        set1.retainAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        //differnce item(fark)

//        set1.removeAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        set2.removeAll(set1);
        set2.forEach(p-> System.out.print(p+" "));
    }
}
