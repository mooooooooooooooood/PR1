package PR1.tut7;
import java.util.Scanner;
public class RecursiveDec2Bin {
    public static String toBinary (int n) {
        if (n == 0 ) return "0";
            else if (n == 1) return "1";
                else
                    return toBinary(n / 2) + (n % 2);
    }

    public static void main (String[] args) {
        Scanner integer = new Scanner (System.in);
        System.out.print ("Enter a positive integer: ");
        int n = integer.nextInt();
        if (n <0) {System.out.print("This is not a positive integer");}
            else {
                String binary = toBinary(n);
                System.out.print("The binary number of " + n + " is " + binary);
        }
    }
}