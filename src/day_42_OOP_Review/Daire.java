package day_42_OOP_Review;

public class Daire {
    private final static double PI = 3.14;
    private double radius;


    Daire(){}
    Daire(int radius){
        this.radius=radius;
    }

    public void setRadius(double radius){
        if (radius>0){
            this.radius=radius;
        }else {
            System.out.println("Yarıçap 0 ve 0 dan küçük olamaz");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double alan(){
        return PI*Math.pow(radius,2);


    }
    public double cevre(){
        return 2*PI*radius;
    }

    public static double alan(double radius){
        return PI*radius*radius;
    }
    public static double cevre(double radius){
        return 2*PI*radius;
    }
}
