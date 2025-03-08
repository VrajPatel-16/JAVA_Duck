// Duck.java
 
//Abstract class for all ducks
public abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    QuackBehavior quackBehavior;

    // Constructor to assign behaviors dynamically
    public Duck(FlyBehavior flyBehavior, SwimBehavior swimBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
        this.quackBehavior = quackBehavior;
    }

    // Method to perform fly action
    public void performFly() {
        flyBehavior.fly();
    }

    // Method to perform swim action
    public void performSwim() {
        swimBehavior.swim();
    }