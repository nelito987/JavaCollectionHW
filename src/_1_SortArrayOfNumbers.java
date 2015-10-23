import java.util.Arrays;
import java.util.Scanner;

public class _1_SortArrayOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int n = Integer.parseInt(N);

        String[] array = scanner.nextLine().trim().split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
