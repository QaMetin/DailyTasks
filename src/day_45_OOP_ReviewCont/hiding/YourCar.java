package day_45_OOP_ReviewCont.hiding;

import day_45_OOP_ReviewCont.hiding.MyCar;

public class YourCar extends MyCar {

    public static boolean haveSunroof(){
        return true;
    }
    public void getYourCarSunroofStatus(){

        System.out.println("Your car have sunroof:"+haveSunroof());
    }


}
