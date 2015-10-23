import java.util.ArrayList;
import java.util.Scanner;

public class _9_CombineListOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] l1 = scanner.nextLine().replaceAll(" ", "").toCharArray();
        char [] l2 = scanner.nextLine().replaceAll(" ", "").toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < l1.length; i++) {
            list.add(l1[i]);
        }

        for (int i = 0; i < l2.length ; i++) {
            if(!list.contains(l2[i])){
                list.add(l2[i]);
            }
        }
        for (Character character : list) {
            System.out.print(character + " ");
        }
    }
}
