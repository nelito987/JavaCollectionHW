import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");

        List<Integer> longestSec = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(Integer.parseInt(numbers[0]));

        for (int i = 0; i < numbers.length-1; i++) {
            int number1  = Integer.parseInt(numbers[i]);
            int number2  = Integer.parseInt(numbers[i+1]);

            if(number1 < number2){
                temp.add(number2);
                if(temp.size()> longestSec.size()){

                    longestSec.clear();
                    longestSec.addAll(temp);
                }
            }else{
                if(temp.size()> longestSec.size()){

                    longestSec.clear();
                    longestSec.addAll(temp);
                }
                System.out.println(temp);
                temp.clear();
                temp.add(number2);
            }
        }

        System.out.println(temp);
        System.out.printf("Longest: %s", longestSec);
    }
}
