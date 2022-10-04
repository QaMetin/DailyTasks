package day_45_OOP_ReviewCont._interface;

public interface A {
    public static final int i=10;
                         int j=20;

     public abstract void M1();
     public abstract void M2();
     public abstract void M3();
     public abstract void M4();


    default void M5(){}; //java 8
    //tüm alt sınıfları kolayca etkilemek için default method kullanımına izin verilmiş.
    static void M6(){};  //java 8
   // private void M7(){}; //java 9

}
