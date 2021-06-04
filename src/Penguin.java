public class Penguin extends Bird{
    // override makenoise
    public void makeNoise() {
        System.out.print(this.getName() + " goes honk honk!");
    }

    // override move
    public void move() {
        System.out.println(this.getName() + " goes waddle waddle.");
    }

}
