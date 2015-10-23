import java.util.Scanner;

public class _16_CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(factorial(n));
    }
    public static long factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
