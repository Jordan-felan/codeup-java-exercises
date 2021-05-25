import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowLecture {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, it means x is 5");
//        }
//
//        System.out.println("on the other hand , this says nothing about x, because it runs regardless of what x is");

//        int y = 2;
//        if (y == 3)  {
//            System.out.println("I've carried out a conditional test and i can confirm that the statement 'y==2' is true.");
//        } else {
//            System.out.println("I have tested to see if 'y==2' is true, and its not. It is false.");
//        }
//        short y = -5;
//        y = 12;
//        y = 32000;
//        // y = 33000 cant put an int into a short
//        if(y < 0){
//            System.out.println("The variable y contains a negative number value.");
//        } else if(y >= 0 && y < 30000) {
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }
//
//        String customerChoice;
//        customerChoice = "strawberry";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up!");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate coming right up!");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry coming right up!");
//                break;
//            default:
//                System.out.println("We dont have that! Go away!");
//                break;
//
//        }

//        Logical Operators
        //wont increment
//        int c = 0, d = 100, e = 50;
//        if(c == 1 && e++ < 100){
//            //do nothing
//        }
//        System.out.println("e = " + e);
//
//        //will increment
//        if(c == 0 && e++ < 100){
//            //do nothing
//        }
//        System.out.println("e = " + e);
//
//        //will also increment
//        if(c == 0 & e++ < 100){
//            //do nothing
//        }
//        System.out.println("e = " + e);
//
//        boolean existence = true;
//        boolean solipism = true;
//        boolean weAllLiveInSomeoneElsesDream = false;
//        boolean thisDeskIsRealNotAProjectionOfMyMind = true;
//
//        if(thisDeskIsRealNotAProjectionOfMyMind || weAllLiveInSomeoneElsesDream) {
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("Im really confused now");
//        }
//
//        if(thisDeskIsRealNotAProjectionOfMyMind | weAllLiveInSomeoneElsesDream) {
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("Im really confused now");
//        }
//
//        if(solipism | weAllLiveInSomeoneElsesDream) {
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("Im really confused now");
//        }

        //comparison operator ==
        //no strict equality operator
        //inequality operator !=
        //there is no strict inequality operator as well

//        String myName = "Jordan";
//        String anotherJordan = "Jordan";
//        String jordan = new String("Jordan");
//
//        System.out.println(myName == anotherJordan);
//        System.out.println(myName == jordan);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//        if(userInput == myName){
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me!");
//        }

        //how to compare strings
//        if(userInput.equals(myName)){
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me!");
//        }

        //LOOPSSSSS

//LOOPSSSSS
//        //while loop
//        int i = 1;
//        while(i < 10) {
//            System.out.println("Now I'm in the loop, i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
//
//        }
//        System.out.println("This is outside the loop, after it was executed. The conditional has tested false. The value of i is now " + i);
//
//        //do while loop
//
//        do {
//            System.out.println("Now I'm in the loop, i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
//
//        } while(i < 10);
//        System.out.println("This is outside the loop, after it was executed. The conditional has tested false. The value of i is now " + i);

        //for loops
        for(int i = 0; i < 10; i++){
            System.out.println("Now I'm in the loop, i has not incremented yet and its value is " + i);
        }

        //if wanting to do anthing after the increment mu use a while style loop

        //group code 99 cans of big red

        for(int i = 99; i >= 0; i--){
            String word = "cans";
            if(i == 1){
                System.out.println(i + " cans of big red on the wall.");
                System.out.println(i + " can of Big Red on the wall");
                System.out.println(i + " can of big red");
                System.out.println("Take one down and pass it around, ");
            }else if(i == 0) {
                System.out.println("No more cans of big red on the wall ");
                System.out.println("No more cans of big red,");
                System.out.println("You go to the store and buy some more, ");
                System.out.println("99 cans of big red on the wall, ");
            } else  {
                System.out.println(i + " cans of big red on the wall");
                System.out.println(i + " cans of big red on the wall ");
                System.out.println(i + " cans of big red  ");
                System.out.println("Take one down and pass it around, ");
            }
        }



    }
}
