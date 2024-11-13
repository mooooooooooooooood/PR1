package PR1.tut9;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class LineNumbers {
    public static void main (String[] args) throws Exception {
        PrintWriter mary = new PrintWriter("src\\lecture\\tut9\\mary.txt");
        mary.println("Mary had a little lamb");
        mary.println("Whose fleece was white as snow.");
        mary.println("And everywhere that Mary went,");
        mary.println("The lamb was sure to go!");
        mary.close();

        Scanner sc = new Scanner(new File("src\\lecture\\tut9\\mary.txt"));
        PrintWriter mary2 = new PrintWriter("src\\lecture\\tut9\\mary2.txt");
        int i = 1;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            mary2.println(i + ". " + s);
            i++;
        }
        sc.close();
        mary2.close();
    }
}
