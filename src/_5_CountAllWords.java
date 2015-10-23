import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _5_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String input = scanner.nextLine();
        Pattern pat = Pattern.compile("([A-Za-z]+)");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()){
            counter++;
        }
        System.out.print(counter);
    }
}
