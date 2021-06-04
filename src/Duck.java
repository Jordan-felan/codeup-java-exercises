public class Duck extends Bird {
    //duck inherits from Bird and is subclass of Bird
    //Duck inherits all public methods
    //lets override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack Quack!");
    }


}
