package PR1.tut3;
import java.util.Scanner;
public class BMI {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your weight (kg): ");
        double a = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        double b = sc.nextDouble();
        double BMI = a /(b*b);
        System.out.print("Your BMI: "+ BMI + "(kg/m2");
        sc.close();

    }

}
