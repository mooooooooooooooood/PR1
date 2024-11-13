package PR1.tut8;

public class TextCleaning {
    public static String CleanText (String sentence) {
        StringBuilder str = new StringBuilder();
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((c >= 'a' && c<= 'z') || c == ' ' || (c >= '0' && c <= '9')) {
                str.append(c);
            }
        }
        return str.toString();
    }

    public static void main (String[] args) {
        String line = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.println("Original: " + line);
        System.out.println("Cleaned: " + CleanText(line));
    }
}
