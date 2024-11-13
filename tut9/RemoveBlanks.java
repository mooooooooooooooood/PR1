package PR1.tut9;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class RemoveBlanks {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("src\\lecture\\tut9\\input.txt");
        pw.println("Hello");
        pw.println(" ");
        pw.println("Nice");
        pw.println(" ");
        pw.println(" ");
        pw.println("Hey");
        pw.close();

        Scanner sc = new Scanner(new File("src\\lecture\\tut9\\input.txt"));
        PrintWriter output = new PrintWriter("src\\lecture\\tut9\\output.txt");
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (!s.trim().isEmpty()) {
                output.println(s); // Ghi các dòng không trống (có nội dung) vào output.txt
            }
        }
        output.close();
        sc.close();
    }
}

