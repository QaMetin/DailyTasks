package day_40_Interface;

public class Fish implements Animal,Food  { // Multi inheritance
// Animal classına implement olmasa bile her iki methoduda
// implement yapmak zorundadır. Hiyerarşik olarak bağlı.
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
class chicken implements Food{
//chicken class ı hiyerarşik olarak 2 interface de bağlı olduğu
//tüm abstract classların implementasyonlarını yapmak zorundadır.
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}