package PR1.tut12;

public class SelectionSortDemo {
    public static  int[] selectionSort (int[] a) {
        int[] b = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i +1; j < a.length; j++) {
                if (a[j] < a[p]) { p = j; }
            }
            b[i] = a[p];
            a[p] = a[i];
        }
        return b;
    }

    public static void PrintArray(int [] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 25, 38, 30, 23, 1, 4};
        int[] originalArray = array.clone(); // Tạo bản sao của mảng gốc để in ra ko bị lỗi
        int[] SortedArray = selectionSort(array);
        System.out.print("The original array: ");
        PrintArray(originalArray);
        System.out.println();
        System.out.print("The sorted array: ");
        PrintArray(SortedArray);
    }
}
