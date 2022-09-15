package day_39_Abstraction;

public abstract class Geometry {
    String nameOfShape;

    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    public Geometry() {
    }

    abstract double area();
    abstract String info();

    String getNameOfShape(){
        return nameOfShape;
    }
}

class Circle extends Geometry{
    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius=radius;

    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2) ;
    }

    @Override
    String info() {
        return "Name of shape is " +nameOfShape+",Area is "+area();
    }
}
class Sqare extends Geometry{
    double edge;
    public Sqare(String nameOfShape,double edge) {
        super(nameOfShape);
        this.edge=edge;
    }

    @Override
    double area() {
        return Math.pow(edge,2);
    }

    @Override
    String info() {
        return "Name of shape is " +nameOfShape+",Area is "+area();
    }
}