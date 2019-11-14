package CharactereAritmetics;

public class CharactereAritmetcs {

    public static void main(String[] args) {

        // char are integer from 0 to 65535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA = " + myCharA);
        System.out.println("myCharA isLetter = " + Character.isLetter(myCharA));
        System.out.println("myCharA isDigit = " + Character.isDigit(myCharA));

        System.out.println("myCharNum = " + myCharNum);
        System.out.println("myCharNum isLetter = " + Character.isLetter(myCharNum));
        System.out.println("myCharNum isDigit = " + Character.isDigit(myCharNum));

        // exam exemple
        char letter = 65; // A
        int myInt = letter + 3;
        char myNewLetter = (char) myInt;

        System.out.println("letter = " + letter);
        System.out.println("myInt = " + myInt);
        System.out.println("myNewLetter = " + myNewLetter);

        char essai1 = 65;
        char essai2 = 3;
        char essai3 = (char)(essai1 + essai2);
        System.out.println(essai1);
        System.out.println(essai2);
        System.out.println(essai3);

        char myChar = 65; // A
        char newChar = (char) (myChar + 1); // 66 -> B
        boolean b = newChar == 'B'; // true
        boolean c = (newChar++ < 'D'); // 67 < 68 // true
        boolean d = (newChar++ == 'C');
        System.out.println("mychar = " + myChar);
        System.out.println("newChar = " + newChar);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);

    }
}
