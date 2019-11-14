package ObjectEquality;

public class ObjectEquality {

    public static void main(String[] args) {

        // comparing object
        Integer myInteger = 127;
        Integer myanotherInteger = 127;

        System.out.println("myinteger hash = " + System.identityHashCode(myInteger));
        System.out.println("myAnotherinteger hash = " + System.identityHashCode(myanotherInteger));

        System.out.println("myInteger==myanotherInteger :"+(myInteger==myanotherInteger));
        System.out.println("128 == 128: " + (128==128));

        //myInteger = 128;
        //myanotherInteger = 128;

        System.out.println("myInteger = " + myInteger);
        System.out.println("myAnotherInteger = " + myanotherInteger);
        System.out.println("myInteger==myanotherInteger :"+(myInteger==myanotherInteger));

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1==int2: " + (int1 == int2)); // false
        System.out.println("int1==int3: " + (int1 == int3)); // false
        System.out.println("int2==int3: " + (int2 == int3)); // false

        System.out.println("int1.equals(int2): "+int1.equals(int2)); // true
        System.out.println("int1.equals(int3): "+int1.equals(int3)); // true
        System.out.println("int2.equals(int3): "+int2.equals(int3)); // true

        System.out.println("int1 has= " + System.identityHashCode(int1));
        System.out.println("int2 has= " + System.identityHashCode(int2));
        System.out.println("int3 has= " + System.identityHashCode(int3));
    }
}
