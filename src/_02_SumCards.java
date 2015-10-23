import java.util.Scanner;

public class _02_SumCards {
    static int num;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().trim().split("[SHDC ]+");
        String [] faces = new String[input.length];
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            faces[i] = input[i];
        }

        if (faces.length == 1){
            int card = switchFaces(faces[0]);
            System.out.print(card);
        }else {

            if (faces[0].equals(faces[1])) {
                sum += switchFaces(faces[0]) * 2;
            } else {
                sum += switchFaces(faces[0]);
            }

            for (int i = 1; i < faces.length - 1; i++) {

                if (faces[i].equals(faces[i - 1]) || faces[i].equals(faces[i + 1])) {
                    sum += switchFaces(faces[i]) * 2;
                } else {
                    sum += switchFaces(faces[i]);
                }
            }

            if (faces[faces.length - 1].equals(faces[faces.length - 2])) {
                sum += switchFaces(faces[faces.length - 1]) * 2;
            } else {
                sum += switchFaces(faces[faces.length - 1]);
            }

            System.out.print(sum);
        }
    }
    public static int switchFaces(String s){
        switch (s){
            case "2": num = 2;break;
            case "3": num = 3;break;
            case "4": num = 4;break;
            case "5": num = 5;break;
            case "6": num = 6;break;
            case "7": num = 7;break;
            case "8": num = 8;break;
            case "9": num = 9;break;
            case "10": num = 10;break;
            case "J": num = 12;break;
            case "Q": num = 13;break;
            case "K": num = 14;break;
            case "A": num = 15;break;

        }
        return  num;
    }
}
