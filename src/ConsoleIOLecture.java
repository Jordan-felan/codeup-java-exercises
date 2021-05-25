import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        String name = "Jordan";
        System.out.printf("Hello, %s%n", name);

        System.out.format("%d is %s's favorite number", 42, name);
        System.out.println("Im on a new line.");
        System.out.println("Hello, " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey man, how's it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n", userInput);
        System.out.println("Give me a number.");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);
    }
}
