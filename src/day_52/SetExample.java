package day_52;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
     /*   Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);
        System.out.println(set); //[35, 5, 26, 45] */

        Set<String> set=new HashSet<>();
        String str=new String("ahmet");
        set.add("ahmet");
        set.add("35");
        set.add("ahmet");
        set.add(str);
        System.out.println(set);

        //içerisinde hangi harfler geçmektedir
        String str2="bugün eve çok geldim ama endimi çok mutlu hissediyorum";

        str2=str2.replaceAll(" ","");
        str2=str2.replaceAll(",","");
        String[] strArray=str2.split("");
        Set<String> newSet=new HashSet<>(Arrays.asList(strArray));
        /*for (int i = 0; i < strArray.length; i++) {
            newSet.add(strArray[i]);

        }*/
        System.out.println(newSet);


        List<String> newList=new ArrayList<>(Arrays.asList(strArray));
        System.out.println("list: "+newList);

    }
}
