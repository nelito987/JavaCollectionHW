import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_LargestSequenceOFEqualStrings {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String [] words = scanner.nextLine().split(" ");
            List<String> result = new ArrayList<>();
            int count = 0;
            int max = 0;
            String maxStr = words[0];

            for (int i = 0; i < words.length -1 ; i++) {
                if (words[i].equals(words[i+1])){
                    count++;

                    if (count>max) {
                        max = count;
                        maxStr = words[i];
                    }
                }else{
                    count = 0;
                }
            }
            for (int i = 0; i <= max ; i++) {
                System.out.print(maxStr + " ");
            }
        }

}
