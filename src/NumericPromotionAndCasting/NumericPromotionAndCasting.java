package NumericPromotionAndCasting;

public class NumericPromotionAndCasting {

    public static void main(String[] args) {

        // promotion is converting "smaller to  "" "bigger" type
        int x = 5;
        double y = 10.55;
        System.out.println("x + y = " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;
        double result = b + c + d;
        System.out.println("result = " + result);

        // casting is converting bigger type to smaller type
        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble;
        // 5.55 in int --> 5
        // 4 + 5
        // 9
        System.out.println("result = " + myInt);

        int anAnotherInt = 125;
        byte myByte = 15;
        int intResult = anAnotherInt + myByte;
        byte byteresult = (byte)(anAnotherInt + myByte); // overflow
        System.out.println("intResult = " + intResult + ", byteResult = " + byteresult);

    }
}
