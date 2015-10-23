import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _7_CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String subStr = scanner.next();
        Pattern pattern= Pattern.compile(subStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int counter = 0;
        int start = 0;
        while (matcher.find(start)){
            counter++;
            start = matcher.start()+1;
        }
        System.out.print(counter);
    }
}
