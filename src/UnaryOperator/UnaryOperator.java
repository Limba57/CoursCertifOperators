package UnaryOperator;

public class UnaryOperator {

    public static void main(String[] args) {

        int x = +3; // here sign + is redudent
        System.out.println("x = " + x);

        double y = -x;
        System.out.println("x = " + x + ", y = " + y);

        y = -y; // --> -1 * y
        System.out.println("x = " + x + ", y = " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a = " + a + ", b = " + b);

        b = !b;
        System.out.println("a = " + a + ", b = " + b);

//        int myInt = !5; // no compilation
//        boolean myBoolean = -true; // no compilation

        // attention : increment and decrement have a higher order than + - * /
        int myInt = 5;
        int otherInt = ++myInt; // ici on incremente myInt ET on affecte cette nouvelle valeur à myOtherInt
        System.out.println("myInt = " + myInt + ", otherInt = " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++; // ici on initiallise newOtherint à la valeur de newInt ET EN SUITE on incremente newInt
        System.out.println("newInt = " + newInt + ", newOtherint = " + newOtherInt);

        int count = 0;
        System.out.println(count);   // --> 0
        System.out.println(++count); // --> 1
        System.out.println(count);   // --> 1
        System.out.println(count--); // --> 1 et en suite decremente
        System.out.println(count);   // --> 0

        // exams questions
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // 4 * 5 / e-- + --e  ici e=4
        // 4 * 5 / 4 + --e    ici e=3
        // 4 * 5 / 4 + 2      ici e=2
        // 20 / 4 + 2
        // 5 + 2
        // f = 7
        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // 3 + --g * 3 + 2 * g++ - h-- % --g    ici h=3 g=6
        // 3 + 5 * 3 + 2 * g++ - h-- % --g      ici h=3 g=5
        // 3 + 5 * 3 + 2 * 5 - h-- % --g        ici h=3 g=6
        // 3 + 5 * 3 + 2 * 5 - 3 % --g          ici h=2 g=6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5            ici h=2 g=5
        // 3 + 15 + 2 * 5 - 3 % 5
        // 3 + 15 + 10 - 3 % 5
        // 3 + 15 + 10 - 3
        // 25
        System.out.println("g = " + g + ", h = " + h + ", i = " + i);

        int o = 5;
        int u = ++o * (o++ + 5);
        // 6 * (o++ + 5) ici o=6
        // 6 * (6 + 5)   ici o=7
        // 6 * 11
        // 66
        System.out.println("o = " + o + ", u = " + u);






    }
}
