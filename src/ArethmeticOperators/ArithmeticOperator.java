package ArethmeticOperators;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 5 + 3
        // 8
        System.out.println("result = " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 4 * 2 + 10
        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10 +
        // 5
        System.out.println("result = " + result);

        int a = 4;
        int b = 3 - 2 * --a;
        // pour a --> decremantation puis utilisation donc ici a = 3
        // 3 - 6
        // a = 3 et b = -3
        System.out.println("a = " + a + ", b = " + b);

        a = 4;
        b = 3 - 2 * a--;
        // pour a --> on utilise a = 4
        // 3 - 8 et en suite on decremente a --> a = 3
        // a = 3 et b = -5
        System.out.println("a = " + a + ", b = " + b);

        long c = 2;
        long d = 4 + 3 * c++;
        // pour c --> on utilise c = 2
        // 4 + 6 et en suite on incremente c --> c = 3
        // c = 3 et d = 10
        System.out.println("c = " + c + ", d = " + d);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - 3 * 3 - 4 / (1 + 3)
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 4 / 4
        // 10 - 9 - 1
        // 1 - 1
        // 0
        System.out.println("result = " + result);

        int i = 10;
        int j = 3;
        int k = i % j;
        // 10 / 3 = 3
        // i * 3 = 9
        // j - 9 = 1
        // k = 1
        int e = 10 % 2;
        // 10 / 2 = 5
        // 2 * 5 = 10
        // 10 - 10 = 0
        // e = 0
        int ee = 15 % 4;
        // 15 / 4 = 3
        // 4 * 3 = 12
        // 15 - 12 = 3
        // ee = 3
        System.out.println("k = " + k + ", e = " + e + ", ee = " + ee);

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        // 12 / 2 - 10 % (4 + 3) - 2 * 12 % 5 - 2 * 3
        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 6
        // 6 - 3 - 4 - 6
        // 3 - 4 - 6
        // -1 - 6
        // -7
        System.out.println("m = " + m);
    }
}
