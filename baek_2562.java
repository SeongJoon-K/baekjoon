import java.util.Scanner;

public class baek_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxIndex=0;

        for (int i = 0; i < 9; i++) {
            int A = sc.nextInt();
            arr[i] = A;
            if (A > max && A < 100) {
                max = A;
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}

