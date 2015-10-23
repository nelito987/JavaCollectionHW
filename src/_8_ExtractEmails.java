import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _8_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([\\w.-]+)@([a-z-.]+[a-z]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){

            System.out.println(matcher.group());
        }
    }
}
