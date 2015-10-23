import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine().trim().replaceAll("\\s+", "");
        
        String [] numbers = input.split("[+-]");
        List<BigDecimal> nums = new ArrayList<>();
        for (String number : numbers) {
            nums.add(new BigDecimal(number));
        }

        BigDecimal result = nums.get(0);
        nums.remove(0);
        
        Pattern pattern = Pattern.compile("[+-]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            if(matcher.group().equals("+")){
                result = result.add(nums.get(0));
            }else{
                result = result.subtract(nums.get(0));
            }
            nums.remove(0);
        }

        System.out.print(result);
    }
}
