import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _14_SortArrayWithAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        String command = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> descending = new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {
            numbers.add(Integer.parseInt(array[i]));
        }

        if (command.equals("Ascending")){
            numbers.stream().sorted()
                    .forEach(x -> System.out.printf("%d ", x));
        }else{
            descending = numbers.stream()
                    .sorted()
                    .collect(Collectors.toList());
            Collections.reverse(descending);

            for (Integer integer : descending) {
                System.out.printf("%d ", integer);
            }
        }

    }
}
