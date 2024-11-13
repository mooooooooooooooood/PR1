package PR1.tut10;
import java.util.Scanner;

public class act1 {
    static public void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n = 0;
        while (n != 5) {
            // loop content
            System.out.println("[1] Add item");
            System.out.println("[2] Item list");
            System.out.println("[3] Edit an item");
            System.out.println("[4] Remove an item");
            System.out.println("[[5] Quit!");
            System.out.print("Choose an option: ");
            n = input.nextInt();
            if (n == 1) {System.out.println("Adding a new item...");}
                else if (n == 2) {System.out.println("Listing all items...");}
                    else if (n == 3) {System.out.println("Editing items...");}
                        else if (n == 4) {System.out.println("Removing an items...");}
                            else if (n == 5) {System.out.println("Goodbye!");}
                                else {System.out.println("Invalid option");}
            System.out.println(" ");
        }
    }
}
