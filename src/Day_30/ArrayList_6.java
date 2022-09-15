package Day_30;

import java.util.ArrayList;

public class ArrayList_6 {
    public static void main(String[] args) {
        ArrayList<String>fruitInBasket=new ArrayList<>();
        fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
        fruitInBasket.add("erik");

        ArrayList<String> fruitInPlate=new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

        fruitInBasket.removeAll(fruitInPlate);
        System.out.println("fruitInBasket = " + fruitInBasket);

    }
}
