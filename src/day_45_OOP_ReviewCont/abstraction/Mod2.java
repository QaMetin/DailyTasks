package day_45_OOP_ReviewCont.abstraction;

public class Mod2 extends D3Print{
    public Mod2(String model, String fileFormat) {
        super(model, fileFormat);
    }

    @Override
    public void extrude() {
        System.out.println("printing a "+model+" with "+fileFormat+" fileformat");

    }

    @Override
    public void polish() {
        System.out.println(model+" is polishing");

    }
}
