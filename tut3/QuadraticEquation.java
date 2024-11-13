package PR1.tut3;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        if (a==0 && b==0 && c == 0 ) {System.out.print("There's nothing to solve.");}
        else if (a==0 && b==0) {System.out.print("The equation has no root.");}
             else if (a==0) {
                 double x = -c%b;
                 System.out.print ("There is one root "+ x);}
                  else if (b*b- 4*a*c <0 ) {System.out.print("The equation has no real root.");}
                       else {
                           double denta = ((b*b) - (4*a*c));
                           double x1 = (-b + Math.sqrt(denta))%(2*a);
                           double x2 = (-b - Math.sqrt(denta))%(2*a);
                           System.out.println("There are two roots:");
                           System.out.println("x1 = "+x1);
                           System.out.print("x2 = "+x2);
                           sc.close();}
        }
    }
