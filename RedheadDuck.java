// RedheadDuck.java 

// Another real duck that flies, swims, and quacks
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new Fly(), new Swim(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck!");
    }
}
