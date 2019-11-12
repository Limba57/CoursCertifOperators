package CompoundAssignmentOperators;

public class CompoundAssignmentOperation {

    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        x = x * z; // simple assignement
        x *= z; // compund assignement, ecual to x = x *z

        System.out.println("x = " + x);

//        int a = += 5; // no compilation -- > a is not define before

        // without explicite cast
        long a = 10;
        int b = 4;
//        b = b * a; // no compilation: b is int and a is a long so b is promoted to long for the operation and can not be assign to b as int
//        b = (int) (b * a); // complation ok because we cast the result of the operation in int to reaffect it to b
        b *= a; // short for of b = (int) ( b * a)
        System.out.println("b = " + b);

        // exam exemple
        long c = 4;
        long d = (c = 2); // shorter form of c =2; long d = c;
        System.out.println("c = " + c + ", d = " + d);

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e + 3 * (f = 3) - (h -= 2);
        // i = 3 + 3 * (f = 3) - (h -= 2) ici e = 3
        // i = 3 + 3 * 3 - (h -= 2) ici e=3 et f=3
        // i = 3 + 3 * 3 - (h = h - 2)
        // i = 3 + 3 * 3 - (h = 1 - 2)
        // i = 3 + 3 * 3 - -1 ici h=-1
        // i = 3 + 9 - -1
        // i = 12 - -1
        // i = 13
        // e=3 f=3 h=-1 i=13
        System.out.println("e = " + e + ", f = " + f + ", h = " + h + ", i = " + i);




    }
}
