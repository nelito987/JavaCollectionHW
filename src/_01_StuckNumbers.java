import java.util.Scanner;

public class _01_StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        String [] numbers = scanner.nextLine().split(" ");
        String [] elements = new String[lenght];
        boolean exist =false;

        for (int i = 0; i < lenght ; i++) {
            elements[i] = numbers[i];
        }

        for (int a = 0; a < elements.length ; a++) {
            for (int b = 0; b < elements.length ; b++) {
                for (int c = 0; c < elements.length ; c++) {
                    for (int d = 0; d < elements.length ; d++) {
                        if (((elements[a]+elements[b]).equals(elements[c]+elements[d])) &&
                                ( !elements[a].equals(elements[b]) &&
                                        !elements[c].equals(elements[d]) &&
                                        !elements[a].equals(elements[c]) &&
                                        !elements[a].equals(elements[d]) &&
                                        !elements[b].equals(elements[c]) &&
                                        !elements[b].equals(elements[d]))){
                            System.out.printf("%s|%s==%s|%s\n",elements[a],elements[b],elements[c],elements[d]);
                            exist = true;
                        }
                    }
                }
            }
        }

        if (!exist){
            System.out.print("No");
        }
    }
}
