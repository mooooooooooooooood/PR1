package PR1.tut5;
import java.util.Arrays;
import java.util.Scanner;

public class FloatArrayInspect {
    public static void main(String[] args) {
        double[] numbers = getValuesFromUser();

        if (numbers.length > 0) {
            double average = calculateAverage(numbers);
            double smallest = findSmallest(numbers);
            double largest = findLargest(numbers);
            double range = calculateRange(smallest, largest);

            System.out.println("Average: " + average);
            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);
            System.out.println("Range: " + range);
        } else {
            System.out.println("No values entered!");
        }
    }

    public static double[] getValuesFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter space-separated floating-point values: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] valuesString = input.split(" ");
        double[] values = new double[valuesString.length];

        try {
            for (int i = 0; i < valuesString.length; i++) {
                values[i] = Double.parseDouble(valuesString[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format!");
            return new double[0]; // Return an empty array if parsing fails
        }

        return values;
    }

    public static double calculateAverage(double[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static double findSmallest(double[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    public static double findLargest(double[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

    public static double calculateRange(double smallest, double largest) {
        return largest - smallest;
    }
}
