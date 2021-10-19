package UDEMYReviews;

public class PrimitiveTypes {

    public static void main(String[] args) {

        //primitive types
//        boolean
//        byte
//        char
//        short
//        int
//        long
//        float


        //INTEGERS

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //ints range is -2,147,483,648 to 2,147,483,647


        //BYTES


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
//      BYTE range is from -128 to 127
//
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
//      Short range is from -32768 to 32767

    }
}
