package Day_32_Constructor_Cont;

public class Cat {
    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPet;

    public Cat() {
    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(String eyeColor, String breed) {
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public Cat(String eyeColor, String breed, boolean isFat) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
    }

    public Cat(String eyeColor, String breed, boolean isFat, boolean isPet) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
        this.isPet = isPet;
    }

    public void sleep(){
        System.out.println("uyuyorum");
    }
    public String food(){
        return  "yemek yiyiyorum";
    }
    public void run(){
        System.out.println("koşuorum");
    }




}
