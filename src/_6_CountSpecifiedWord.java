import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _6_CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.next();
        int counter = 0;

        String pat = String.format("(?<=[^\\w]|^)%s(?=[^\\w]|$)", word);
        Pattern pattern = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            counter++;
        }
        System.out.print(counter);
    }
}
