package day_45_OOP_ReviewCont.abstraction;

public abstract class D3Print {
    String model;
    String fileFormat;

    public D3Print(String model,String fileFormat){
        this.model=model;
        this.fileFormat=fileFormat;
    }

    public abstract void extrude();
    public abstract void polish();

    public String fileFormatCheck(){
        if (fileFormat.equals("OBJ")){
            return "file format is suitable for polishing";
        }else{
            return "file format is not suitable for polishing";
        }
    }



}
