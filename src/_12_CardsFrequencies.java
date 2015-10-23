import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\W+");
        Map<String, Integer> cards = new LinkedHashMap<>();

        for (String card : input) {
            Integer count = cards.get(card);
            if (count == null){
                count = 0;
            }
            cards.put(card, count+1);
        }

        for (Map.Entry<String, Integer> entry : cards.entrySet()) {
            double percentage = ((double)entry.getValue()/input.length)*100;
            System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
        }
    }
}
