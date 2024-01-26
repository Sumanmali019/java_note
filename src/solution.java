import java.util.Scanner;

public class solution {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] number = new int[t];

        for (int i = 0; i < t; i++) {
            number[i] = sc.nextInt();
        }
        int maxNumber = findMaxNumber(number);

        if (maxNumber % 2 == 0) {
            System.out.print("WON");
        } else {

            System.out.println("LOSE");
        }

    }

    private static int findMaxNumber(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
