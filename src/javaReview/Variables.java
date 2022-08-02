package javaReview;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int firstNumber = randomGenerator.nextInt(8) + 2;
        int secondNumber = randomGenerator.nextInt(8) + 2;

       var subtraction = randomGenerator.nextInt(8) + 2;
       int answer = firstNumber * secondNumber - subtraction;;
       String prompt = ". Don't type in the answer, just press ENTER when ready";
        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();

        System.out.println(" Multiply the number by " + firstNumber + prompt);
        scanner.nextLine();

        System.out.println(" Multiply the number by " + secondNumber + prompt);
        scanner.nextLine();

        System.out.println("Divide the result by the number you originally thought of" + prompt);
        scanner.nextLine();

        System.out.println("Now subtract " + subtraction + prompt);
        scanner.nextLine();

//        answer = firstNumber * secondNumber - subtraction;
        System.out.println("The answer is " + answer);


       scanner.close();
    }

}
