package PR1.tut7;
import java.util.Scanner;
public class RecursiveStringReverse {
    public static String reverse (String sentence) {
        StringBuilder line = new StringBuilder(sentence);
        line.reverse();
        return line.toString();
    }

    public static void main (String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sen = str.next();
        String reverse1 = reverse(sen);
        System.out.println("The reverse string is: " + reverse1);

    }
}
