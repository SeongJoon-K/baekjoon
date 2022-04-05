import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10];
        int pos = 3;
        int addNum = 10;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 1 2 3 4 5 6 7
        for (int i = N; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[3] = addNum;
        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);
        }
    }
}
