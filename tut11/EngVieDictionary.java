package PR1.tut11;
import java.util.*;

public class EngVieDictionary {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("apple", "Táo");
        map.put("pineapple", "Dứa");
        map.put("avocado", "Bơ");

        int n = 0;
        while (n != 2) {
            System.out.print("Enter an English word: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            if (map.containsKey(word.toLowerCase())) {
                System.out.println("Vietnamese meaning: " + map.get(word.toLowerCase()));}
                else System.out.println("Meaning not found");
            System.out.println("Do you want to look up another word?(1 for yes, 2 for no)");
            n = sc.nextInt();
            System.out.print("Goodbye");
            sc.close();
        }
    }
}