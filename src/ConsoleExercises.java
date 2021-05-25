import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);

        System.out.println("Give me three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("The three words you entered were:");
        System.out.printf("%s%n %s%n %s%n", firstWord, secondWord, thirdWord);

        System.out.println("Hey, give me a sentence?");
        scanner.nextLine();
        String userInput = scanner.nextLine();
        System.out.printf("%s%n", userInput);

        System.out.println("Give me the length, the width and the height of your classroom.");
//        int numbers = Integer.parseInt(scanner.nextLine());
//        int area = numbers * numbers;
//        System.out.printf("The area is %d", area);
        int length = Integer.parseInt(scanner.next());
        int width = Integer.parseInt(scanner.next());
        int height = Integer.parseInt(scanner.next());
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        int volume = length * width * height;
        System.out.printf("The area is %d%n", area);
        System.out.printf("The perimeter is %d%n", perimeter);
        System.out.printf("The volume is %d", volume);

    }
}
