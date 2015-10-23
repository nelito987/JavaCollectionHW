import java.util.Scanner;

public class _15_RecursiveBinarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int searched = Integer.parseInt(scanner.nextLine());
        String [] input = scanner.nextLine().split("\\W+");

        int [] elements = new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            elements[i] = Integer.parseInt(input[i]);
        }
        int index = binarySearch(elements,0,elements.length-1,searched);
        System.out.print(index);
   }
    public static int binarySearch(int[] elements,int start, int end, int searched){
        int mid = start + (end - start) /2;
        if(end < start) {
            return -1;
        }
        if (searched < elements[mid]) {
                return binarySearch(elements, start, mid, searched);
        } else if (searched > elements[mid]) {
                return binarySearch(elements, mid + 1, end, searched);
        } else {
                return mid;
        }
    }

}

