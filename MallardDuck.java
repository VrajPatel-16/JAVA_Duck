// MallardDuck.java 

//A real duck that can fly, swim, and quack
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Fly(), new Swim(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
