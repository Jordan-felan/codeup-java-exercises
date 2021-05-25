import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            if(i == 5){
//                System.out.println(i);
//                i++;
//            } else {
//
//                System.out.println(i);
//                i++;
//            }
//        }

//        int n = 5;
//        int i = 100;
//
//        do {
//            i-=n;
//            System.out.println(i);
//
//        } while(i > -10);

//        long i = 2;
//
//        do {
//            if(i == 2){
//                System.out.println(i);
//            }
//
//            System.out.println(i *= i);
//
//        } while(i < 1000000);

        //refactored loops above into for loops

//        for(int i = 100; i > -10; i-=5){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i < 1000000; i*=i){
//
//            System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

//        for(int i = 0; i <= 3; i++) {
//            System.out.println("Please enter pin:");
//            int pin = Integer.parseInt(scanner.next());
//            if(pin == 12345){
//                System.out.println("Output: Correct, Welcome Back!");
//                break;
//            } else if(i == 2){
//                System.out.println("Sorry, you have been locked out!");
//                break;
//            } else {
//                System.out.println("Output: Incorrect, please try again");
//            }
//        }

        System.out.println("What number would ypu like to go to?");
            int integerNext = Integer.parseInt(scanner.next());

        for (int i = 1; i <= integerNext; i++) {
            int numberSquared = (int) Math.pow(i, 2);
            int numberCubed = (int) Math.pow(i, 3);
            if(i == 1) {
                String table = "number" + " | " + "squared" + " | " + "cubed";
                System.out.println(table);
            }
            String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
            System.out.print(message);

        }

// see if the user wants to continue
//        System.out.print("\nContinue? (y/n): ");
//        String choice = scanner.next();
//        System.out.println();




        for (int i = 1; i <= 10; i++) {
            System.out.println("\nEnter numerical grade:");
            int integerGrade = Integer.parseInt(scanner.next());
            if(integerGrade >= 98 && integerGrade <= 100){
                System.out.println("A+");
            }else if(integerGrade >= 93 && integerGrade <= 97) {
                System.out.println("A");
            }else if(integerGrade >= 90 && integerGrade <= 92) {
                System.out.println("A-");
            }else if(integerGrade >= 88 && integerGrade <= 89) {
                System.out.println("B+");
            }
            else if(integerGrade >= 83 && integerGrade <= 87){
                System.out.println("B");
            }else if(integerGrade >= 80 && integerGrade <= 82) {
                System.out.println("B-");
            }else if(integerGrade >= 78 && integerGrade <= 79) {
                System.out.println("C+");
            }
            else if(integerGrade >= 73 && integerGrade <= 77){
                System.out.println("C");
            }else if(integerGrade >= 70 && integerGrade <= 72) {
                System.out.println("C-");
            }
            else if(integerGrade >= 60 && integerGrade <= 69){
                System.out.println("D");
            }
            else if(integerGrade >= 0 && integerGrade <= 59){
                System.out.println("F");
            }
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




    }
}
