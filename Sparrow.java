package SolidBird;

public class Sparrow extends Bird implements Flyable{
    FlyingBehaviour flyingBehaviour;
    public Sparrow(){
        flyingBehaviour=new FlyingLow();
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
    @Override
    public void sound() {
        System.out.println("Sparrow is singing");
    }

    @Override
    public void fly() {
        flyingBehaviour.doFly();
    }
}
