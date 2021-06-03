import java.util.Random;

public class ServerNameGenerator {
   private static String[] adjectives = {"adorable", "brave", "calm", "adventurous", "breakable", "cautious", "aggressive", "bright", "cheerful", "dangerous"};

    private static String[] nouns = {"lion", "tiger", "bear", "dog", "cat", "alligator", "cricket", "bird", "wolf", "monkey"};

  private static String randomElement(String[] strings){
      Random random = new Random();
      int index = random.nextInt(adjectives.length);
      return strings[index];
  }

  public static String makeServerName(String[] arr1, String[] arr2){
      String adj = randomElement(arr1);
      String noun = randomElement(arr2);
      return adj + "-" + noun;
  }

    public static void main(String[] args) {
        System.out.println("Your new server name is:");
        System.out.println(makeServerName(adjectives,nouns));
    }




}
