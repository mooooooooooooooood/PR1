package PR1.tut12;
import java.util.*;
public class ArrayIntersectionDemo {
    public static Set<Integer> intersect (int[] a, int[] b) {
        Set<Integer> setC = new HashSet<>();

        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a.length; j++) {
                 if (a[i] == b[j]) {
                     setC.add(a[i]);
                     break; //break vòng lặp for
                 }
             }
        }

        return setC;
    }

    public static void main(String[] args) {
        int[] setA = {1, 3, 5, 6, 8, 10};
        int[] setB = {2, 3, 4, 5, 7, 11};
        Set<Integer> intersection = intersect(setA, setB);
        System.out.print ("The intersection of two integer arrays are: " + intersection);
    }

}
