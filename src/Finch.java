
public class Finch extends Bird{

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet Tweet!");
    }

    public Finch(){
        super();
        System.out.println("A Finch just got created");
    }


}
