package PR1.tut4;
import java.util.Scanner;
public class PrimeCheck {
    public static void main (String[] args) {
        Scanner number = new Scanner (System.in);
        System.out.print("Enter the positive integer: ");
        double a = number.nextDouble();
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && a > 1) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}
