import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int remainder(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }



    public static int factorialLoop(){
        System.out.println("Give me a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if ((userNumber >= 10) || (userNumber <= 1)) {
            System.out.println("Try again! That number was not between 1 and 10");
            return factorialLoop();
        } else {
            long result = 1;
            for(int i = 1; i <= userNumber; i++){
              result = result * i;

                System.out.println(i + "! = " + result);
                String yes = "y";
                String no = "n";
                System.out.print("\nContinue? (y/n): ");
                String choice = scanner.next();
                if(choice.equals(yes)){
                    continue;
                } else {
                    break;
                }

            }
            System.out.println("Original number to be factorialed was ");
            return userNumber;
        }
    };

    public static int rollTheDice(){
        System.out.println("How many sides do you want each die to have?");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        for(int i = 1; i <= 4; i++) {
            String yes = "y";
            String no = "n";
            System.out.println("Would you like to roll the dice? (y/n): ");
            Scanner sc = new Scanner(System.in);
            String userReply = scanner.next();

                if (userReply.equals(yes)) {


                    int die1;   // The number on the first die.
                    int die2;   // The number on the second die.
                    int roll;   // The total roll (sum of the two dice).

                    die1 = (int) (Math.random() * userNumber) + 1;
                    die2 = (int) (Math.random() * userNumber) + 1;
                    roll = die1 + die2;
                    System.out.println("The first die comes up " + die1);
                    System.out.println("The second die comes up " + die2);
                    System.out.println("Your total roll is " + roll);


                    System.out.print("\nContinue? (y/n): ");
                    String choice = scanner.next();
                    if (choice.equals(yes)) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    System.out.println(" You don't want to roll the dice? you make me sad :(");
                    break;

                }

        }

        return userNumber;
    };

    public static int highLow() {

        Random random = new Random();

        // Use Scanner for getting input from user

        Scanner scanner = new Scanner(System.in);

        // Use the random generator to
        // pick a number between 0 and 99 (inclusive)

        int number = random.nextInt(100);
        int guess = -1;

        // Loop until the user has guessed the number

        while (guess!=number) {

            // Prompt the user for their next guess

            System.out.print("Enter your guess: ");

            // Read the users guess

            guess = scanner.nextInt();

            // Check if the guess is high, low or correct

            if (guess<number) {

                // Guess is too low

                System.out.println("HIGHER, please try again");

            } else if (guess>number) {

                // Guess is too high

                System.out.println("LOWER, please try again");

            } else {

                // Guess is correct !!

                System.out.println("GOOD GUESS, the number was " + number);
            }
        }
        return number;
    };




    public static void main(String[] args) {
//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(21, 7));
//        System.out.println(multiply(5, 2));
//        System.out.println(division(21, 7));
//        System.out.println(remainder(24, 5));
//        int product = multiply(7, 3);
//        System.out.println(getInteger(1,10));
//        System.out.println(factorialLoop());
//        System.out.println(rollTheDice());
//        System.out.println(highLow());


    }
}
