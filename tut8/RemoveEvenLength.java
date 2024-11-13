package PR1.tut8;

import java.util.ArrayList;

public class RemoveEvenLength {
    public static void removeEvenLength (ArrayList<String> arrList) {
        for (int i = arrList.size() - 1; i >= 0; i--) {
            if ( arrList.get(i).length() % 2 == 0) {
                arrList.remove(i);
            }
        }
    }

    public static void main (String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("odd");
        arList.add("even");
        arList.add("abc");
        arList.add("abcd");
        System.out.println("Original list: " + arList);
        removeEvenLength(arList);
        System.out.print("Output list: " + arList);
    }
}
