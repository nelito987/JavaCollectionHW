import java.util.Scanner;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        String [] input = scanner.nextLine().toLowerCase().split("\\W+");
        TreeSet<String> dict = new TreeSet<>();

        for (int i = 0; i <input.length ; i++) {
            if(!dict.contains(input[i])){
                dict.add(input[i]);
            }
        }
        for (String s : dict) {
            System.out.print(s + " ");
        }
    }
}
