import java.util.Scanner;

public class _2_SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        System.out.print(words[0]);

        for (int i = 0; i < words.length -1 ; i++) {
            if (words[i].equals(words[i+1])){
                System.out.print(" " + words[i+1]);
            }else{
                System.out.println();
                System.out.print(words[i+1]);
            }
        }
    }
}
