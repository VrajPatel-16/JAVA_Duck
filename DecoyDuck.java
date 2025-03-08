// DecoyDuck.java 

// A wooden duck that neither swims, flies, nor quacks
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new NotFly(), new Drown(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
