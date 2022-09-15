package day_39_Abstraction;

public class GeometryTest {
    public static void main(String[] args) {
        Circle circle=new Circle("Daire",3);
        System.out.println(circle.info());

        Sqare sqare=new Sqare("Kare",4);
        System.out.println(sqare.info());
    }
}
