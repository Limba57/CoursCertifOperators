package AssigmentOperators;

public class AssignmentOperators {

    public static void main(String[] args) {

//        int x = 1.0;             // no compilation
//        short y = 123456789;     // no compilation
//        int i = 9f;              // no compilation
//        long t = 123456789123465;  // no compilation

        int x = (int)1.0;
        short y = (short)123456789; // --> overflow
        int z = (int)9f;
        long t = 123456789123465L;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;
        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

//        myByte = myByte + 1;          // no compilation: les bytes sont convertis en int pour les calculs
//        myByte = (byte) (myByte + 1); // compilation ok
        myByte++;                       // best way to increment

//        mySecondByte = mySecondByte - 1;          // no compilation idem
//        mySecondByte = (byte) (mySecondByte - 1); // compilation ok
        mySecondByte--;                             // best way to decrement

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        short a = 10;
        short b = 20;
        short c = (short) (a * b);
        System.out.println("c = " + c);

    }
}
