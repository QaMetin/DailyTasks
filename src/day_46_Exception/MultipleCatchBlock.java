package day_46_Exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("program başladı");
        try{
            System.out.println((5/0));
        }catch (ArithmeticException e){
            System.out.println("Aritmetik exception yakalandı.");
            System.out.println(e.getMessage());
        }
        System.out.println("program sonlandı");
    }
}
