package EqualityOperator;

public class EqualityOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        boolean c = a == b;
        // ici on assigne a "c" le retour boolean de
        // l'expression: "a" est-il egal à "b"
        // --> c = false
        boolean d = a != b; // ici d = true

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);

//        boolean g = true == 0; // no compilation: on ne peut pas comparer nombre et booleen
//        boolean h = false != "test"; // idem

        // exam exemple

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false);
        // z = true && false = false, y = true, x =false
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        boolean h = true;
        boolean i = false;
        boolean j = (h != true) && (i = true);
        // h != true --> renvoie false
        // h = false && (i = false) --> la deuxieme partie n'est pas evalué
        // h = true
        // i = false
        // j = false
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }

}
