import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String [] input = scanner.nextLine().toLowerCase().split("\\W+");
        TreeMap<String, Integer> map = new TreeMap();
        int maxValue = 0;

        for (String word : input) {
            Integer count = map.get(word);
            if(count == null){
                count = 0;
            }
            map.put(word,count+1);
        }

        for (Integer value: map.values()) {
            if(value> maxValue){
                maxValue = value;
            }
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxValue){
                System.out.println(entry.getKey() + " -> " + maxValue + " times");
            }
        }
        
    }
}
