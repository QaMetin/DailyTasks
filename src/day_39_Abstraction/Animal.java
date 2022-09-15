package day_39_Abstraction;

public abstract  class Animal {
    String name;

    public Animal(String name) {
        this.name=name;
    }

    public abstract void eat();
    public abstract void move();
}
