package PR1.tut3;
import java.util.Scanner;
public class AgeCheck {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("What's your age?");
        int a = sc.nextInt();
        if (a<13) {System.out.print("Not for kids!");}
            else if (a<= 19) {System.out.print("Welcome, teenager!");}
            else {System.out.print("You're too old!");}
            sc.close();
    }

}
