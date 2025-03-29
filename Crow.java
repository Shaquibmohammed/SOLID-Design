package SolidBird;

public class Crow extends Bird implements Flyable{
    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    public void sound() {
        System.out.println("Crow is singing");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying low");
    }
}
