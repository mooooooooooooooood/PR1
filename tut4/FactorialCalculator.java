package PR1.tut4;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main (String [] args){
        Scanner number = new Scanner(System.in);
        System.out.print ("What integer you want to calculate factorial for?");
        double a = number.nextDouble();
        int factorial = 1;
        int i = 1;
        if (a < 0) { System.out.print("Factorial cannot be calculated for negative number.");}
           else if ( a == 0) { System.out.print("Factorial of 0 is 1.");}
                else {
                    while ( i <= a) {
                        factorial = factorial * i;
                        i++;
                    }
                    System.out.print("The factorial of "+ a +" is "+ factorial);
        }
    }
}
