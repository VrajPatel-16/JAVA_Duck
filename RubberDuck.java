// RubberDuck.java 

//A toy duck that floats but doesn't fly, squeaks instead of quacking
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NotFly(), new Float(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
