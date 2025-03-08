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