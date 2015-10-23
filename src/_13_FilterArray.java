import java.util.*;
import java.util.stream.Collectors;

public class _13_FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\W+");
        List<String> words = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            words.add(input[i]);
        }

        result = words.stream()
                .filter(x -> x.length() >3).collect(Collectors.toList());

        for (String word : result) {
            System.out.printf("%s ", word);
        }

    }
}
