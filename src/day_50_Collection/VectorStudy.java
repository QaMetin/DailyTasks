package day_50_Collection;

import java.util.Arrays;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec = " + vec);

        //addAll
        vec.addAll(Arrays.asList("aa","ab","ddd","al","aa","nn"));
        System.out.println("vec = " + vec);

        //addElement()
        vec.addElement("tc");
        System.out.println("vec = " + vec);

        //capacity()
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec.capacity() = " + vec.capacity());

        //clear
//        vec.clear();
//        System.out.println("vec = " + vec);

        //clone
        Object clone=vec.clone();
        System.out.println("clone = " + clone);

        //contains
        System.out.println("vec.contains(nn) = " + vec.contains("nn"));

        //containsAll
        System.out.println(vec.containsAll(Arrays.asList("aa", "tc")));

        //copyInto()
        String[] strings=new String[9];
        strings[0]="1";
        vec.copyInto(strings);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));


        //ensureCapacity
        System.out.println("vec.capacity() = " + vec.capacity());
        vec.ensureCapacity(30);
        System.out.println("vec.capacity() = " + vec.capacity());

        //trim



    }
}
