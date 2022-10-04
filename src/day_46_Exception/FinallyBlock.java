package day_46_Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Try bloğu çalıştı");
        }catch (Exception e){
            System.out.println("");
        }finally {
            System.out.println();
        }

    }
}
