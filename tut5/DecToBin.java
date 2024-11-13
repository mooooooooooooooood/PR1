package PR1.tut5;
import java.util.Scanner;
public class DecToBin {
    public static void main (String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = number.nextInt();
        number.close();
        String bin = toBinary(a);
        System.out.print(bin);
    }

    public static String toBinary(int a) {
        if (a<0) {System.out.print("Null");}
            else if (a == 0) {System.out.print("Binary of 0 is 0");}
                else {
                    String out="";
                    while (a > 0) {
                        int remainder = a%2;
                        out = remainder + out;
                        a= a/2 ;
                    }
                    return out;
        }
        return null;
    }

}
