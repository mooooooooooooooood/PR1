package PR1.tut3;
import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the year: ");
        int a = sc.nextInt();
        if ( a % 4 != 0) {System.out.print("The year "+ a +" is not a leap year");}
        else if ( a % 100 != 0) {System.out.print("The year "+ a +" is a leap year");}
            else if ( a % 400 != 0) {System.out.print("The year "+ a +" is not a leap year");}
                else {System.out.print("The year "+ a +" is a leap year");}
                sc.close();

    }
}
