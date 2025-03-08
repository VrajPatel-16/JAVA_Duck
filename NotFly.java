// NotFly.java  

//Implements non-flying behavior
public class NotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}