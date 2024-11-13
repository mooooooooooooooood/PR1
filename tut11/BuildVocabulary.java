package PR1.tut11;
import java.util.*;
import java.io.*;
public class BuildVocabulary {
    public static void main(String[] args) throws Exception {
        Set<String> uniqueWords = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader("src\\lecture\\tut11\\file.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\s+"); // Chuyển đổi sang chữ thường và tách thành từng từ
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", ""); // Loại bỏ các ký tự không phải chữ cái
                if (!word.isEmpty()) {
                    uniqueWords.add(word); // Thêm từ vào HashSet nếu không trùng và không rỗng
                }
            }
        }

        System.out.println("Danh sách từ vựng duy nhất trong file:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
