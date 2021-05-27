import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
        System.out.println(pinkFloyd);

        String parenthesis ="Check \"this\" out!, \"s inside of \"s!";
        System.out.println(parenthesis);

        String window = "In windows, the main drive is usually C:\\";
        System.out.println(window);

        String backslash = "I can do backslashes \\, double backslashes \\\\, \n and the amazing triple backspace \\\\\\ ";
        System.out.println(backslash);


        //bob convo

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey, my name's Bob... My mom said you wanted to talk to me or something... Whatever...");

        String response = "";
        while(!response.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want?");
            response = sc.nextLine();
            if(response.isEmpty()) {
                System.out.println("Fine, Be that way!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if(response.endsWith("!")){
                System.out.println("Woah. chill out!");
            } else {
                System.out.println("Whatever");
            }
        }
        System.out.println("I'm outa here...");

    }
}
