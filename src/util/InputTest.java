package util;

public class InputTest {

    public static void main(String[] args) {
        Input input2 = new Input();
        System.out.println(input2.getString());
        System.out.println(input2.yesNo());
        System.out.println(input2.getInt(1,10));
        System.out.println(input2.getInt());
        System.out.println(input2.getDouble(1.99, 99.99));
        System.out.println(input2.getDouble());

    }
}
