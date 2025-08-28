import java.util.Scanner;

public class Utils {
    public static int getValidInt(Scanner input, int min, int max) {
        int value;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= min && value <= max) break;
            } else {
                input.next(); // discard invalid input
            }
            System.out.print("Invalid. Enter a number between " + min + " and " + max + ": ");
        }
        return value;
    }

    public static int getHighest(int[] arr, int count) {
        int max = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int getLowest(int[] arr, int count) {
        int min = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static double getAverage(int[] arr, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return (double) sum / count;
    }
}
