package SolidBird;

public class Penguin extends Bird{
    public void eat(){
        System.out.println("Penguine is eating");
    }

    @Override
    public void sound() {
        System.out.println("Penguine is singing");
    }
}