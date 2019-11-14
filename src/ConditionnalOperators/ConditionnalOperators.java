package ConditionnalOperators;

public class ConditionnalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // ici d et false car dans l'expression  b l'est
        boolean e = a || b; // ici e  et true
        System.out.println("d = " + d + ", e = " + e);

        // exam exemple
        int f = 4;
        boolean g = false && (f++ < 4);
        // g = false && (f++ < 4)
        // l'evaluation de l'expression s'arrete directement
        // car la premiere condition suffit à savoir le
        // resultat, donc avec l'opérateur && l'evalation
        // s'arrete et le f++ n'est pas fait
        // ici g = false et f = 4
        boolean h = (f-- == 4) && !g;
        // évaluation du premeier terme
        // h = (4 == 4) && !g
        // h = true && !g  ici f=3
        // h = true && !false
        // h = true && true
        // h = true
        System.out.println(("f = " + f + ", g = " + g + ", h = " + h));

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        // myBoolean = true && (anotherInt-- == 4) || (myInt++ == 4)
        // myBoolean = true && true || (myInt++ == 4) ici anotherInt=3
        // ici l'évaluation s'arrete car true || renvoie tjrs true
        // donc myInt = 3
        // anotherInt = 3
        // my boolean = true
        System.out.println("myInt = " + myInt + ", anthoerInt = " + anotherInt + ", myBoolean = " + myBoolean);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        // (y != 10 ) --> true
        // x = true ^ (z = false)
        // x = true ^ false
        // x = true
        // z = false
        // y = 20
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

    }
}
