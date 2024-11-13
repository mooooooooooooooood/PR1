package PR1.tut12;

public class BinarySearchDemo {
    public static int binarySearch (int[] a, int k, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (a[mid] == k) {
                return mid;
            } else if (a[mid] > k) {
                return binarySearch(a, k, low, mid - 1);
            } else {
                return binarySearch(a, k, mid + 1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 11, 18, 20, 25, 29};
        int target = 11;
        int position = binarySearch(array, target,0, array.length -1);

        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}