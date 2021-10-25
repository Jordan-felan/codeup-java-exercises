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
        //ints range is -2,147,483,648 to 2,147,483,647. Occupies 32 bits in memories


        //BYTES


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
//      BYTE range is from -128 to 127.Byte occupies 8 bits in memory
//
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
//      Short range is from -32768 to 32767. Short occupies 16 bits in memory

        long myLongValue = 100L; // have to add an L to recognize it as a long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
//      Longs range is from --9223372036854775808 to 9223372036854775807. Short occupies 64 bits in memory


        //// Arithmatic and CASTING

        int myTotal = (myMinIntValue / 2);

      //  byte myNewByteValue = (myMinByteValue / 2); doesnt work. have to use casting
       byte myNewByteValue = (byte) (myMinByteValue / 2); //this causes the error to disapear

        short myNewShortValue = (short) (myMinShortValue / 2);


        // CHALLLENGE

        byte myByte = 21;

        short myShort = 22000;

        int myInt = 256000;

        long myLong = ((myByte + myShort + myInt) * 10 + 50000);

        System.out.println(myLong);


        //FLOATING POINT NUMBERS

        //theres float and double. float is a single precision number which occupies 32 bits where as a double is a double precision number which occupies 64 bits

        //Float has a range from 1.4E-45 to 3.4028235E+38
    //Double has a range from 4.9E-324 to 1.7976931348623157E+308

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25; // can use casting as well for these
        double myDoubleValue = 5.25d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


    }
}
