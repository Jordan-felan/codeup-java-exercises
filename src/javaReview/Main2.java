package javaReview;

public class Main2 {

    public static void main(String[] args) {

        boolean playAgain = true;

        while (playAgain) {
            BitcoinMiner game = new BitcoinMiner();
            game.play();
            playAgain = BitcoinMiner.getYesOrNo("Would you like to play again?");
        }

        System.out.println("Goodbye");
    }
}
