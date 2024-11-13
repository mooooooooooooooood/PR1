package PR1.tut9;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    static public void main (String[] args) throws Exception {
        File file = new File("src//lecture//tut9//hello.txt");
        PrintWriter pw = new PrintWriter("src//lecture//tut9//hello.txt");
        pw.println("Hello, World!");
        pw.close();

        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.print(s);
        }
        sc.close();
    }
}
