import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};
        numbers[1] = 33;
        //numbers[4] = 33; cannot do this since there is no index 4

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) { //enhanced for loop
            System.out.println(number);
        }

        String[] topFiveExampleNames = new String[6];

        topFiveExampleNames[0] = "Greg";
        topFiveExampleNames[1] = "Jim";
        topFiveExampleNames[2] = "Geoff";
        topFiveExampleNames[3] = "Naysa";
        topFiveExampleNames[4] = "Hideo";

        for (String name : topFiveExampleNames){
            System.out.println(name);
        }

        boolean[] lookingAtDefaultVals = new boolean[3];

        for(boolean boo : lookingAtDefaultVals){
            System.out.println(boo);
        }

        Arrays.fill(topFiveExampleNames, "Jim");
        for(String name : topFiveExampleNames){
            System.out.println(name);
        }

        int[] alsoNums = {14, 33, 34, 44};

        for(int number : numbers){
            System.out.println(number);
        }
        for(int number : alsoNums){
            System.out.println(number);
        }

        System.out.println(Arrays.equals(numbers, alsoNums));

        int[] yetMoreNums = Arrays.copyOf(numbers, 5);

        for(int number : yetMoreNums){
            System.out.println(number);
        }

        int[] numbersAgain = numbers;

        System.out.println(yetMoreNums == numbers);

        int[] unsortedNightmare = {99,-19,88,0,3,44,14};

        Arrays.sort(unsortedNightmare);

        System.out.println(Arrays.toString(unsortedNightmare));
        System.out.println(Arrays.toString(unsortedNightmare));

        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        for (char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");




    }
}
