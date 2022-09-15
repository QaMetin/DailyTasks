package review.class_object;

public class Vehicle {
    //attributes veya fields
    String type;
    String color;
    int tires;
    int price;

    // methods

    public void getInfo(){
    System.out.println("Vehicle{ type: "+type+" color: "+color+" tires: "+tires+"price:"+price+"}");
    }
    public void setWinter(){
        System.out.println(color+" "+type+" için "+tires+" adet kışlık lastik lazım");
    }
    public void forRent(){
        System.out.println(color+" "+type+" için 1 günlük kiralama bedeli "+price+" Tl dir");
    }
    public void forRentOptions(int daycount){
        System.out.print("\r***"+color+" renkli "+type+" için " +daycount+" günlük kiralama bedeli "+price*daycount+" Tl dir");
    }
}
