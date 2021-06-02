package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence is: " + userSentence);
        return userSentence;
    };
    public boolean yesNo(){
        System.out.println("Enter a yes or no?");
        String userYesNo = scanner.nextLine();
        boolean result = false;
        if(userYesNo.equalsIgnoreCase("yes")){
            result = true;
        } else if(userYesNo.equalsIgnoreCase("y")){
            result = true;
        } else {
            result = false;
        }
        System.out.println("Your boolean is: " + result );
        return result;
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter a number between %d and %d.%n", min, max);
        int userNum = scanner.nextInt();
        if(userNum < min || userNum > max){
            System.out.println("Oops, that wasnt within the range!");
            getInt(min, max);
        } else {
            System.out.printf("Thank you! Your number %d is between the range!%n", userNum);
        }
        return userNum;
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userNum = scanner.nextInt();
        return userNum;

    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a number between %f and %f.%n It may include a decimal! %n", min, max);
        double userDouble = scanner.nextDouble();
        if(userDouble < min || userDouble > max){
            System.out.println("Oops, that wasn't within the range!");
            getDouble(min, max);
        } else {
            System.out.printf("Thank you! Your number %f is between the range!%n", userDouble);
        }
        return userDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a decimal number!");
        double userDouble = scanner.nextDouble();
        return userDouble;
    };









}
