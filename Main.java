// Main.java 

// Name: Vraj Patel
// PRN: 23070126147
// Batch: AIML-B3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n🦆 Duck Simulation Menu");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Redhead Duck");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            Duck duck = null;

            switch (choice) {
                case 1 -> duck = new MallardDuck();
                case 2 -> duck = new RubberDuck();
                case 3 -> duck = new DecoyDuck();
                case 4 -> duck = new RedheadDuck();
                case 5 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }

            if (duck != null) {
                duck.display();
                duck.performFly();
                duck.performSwim();
                duck.performQuack();
            }
        }

        System.out.println("Exiting Duck Simulation. Goodbye! 🦆");
        scanner.close();
    }
}
