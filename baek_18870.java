import java.util.Scanner;

public class baek_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 각 배열 값에 수를 넣음
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                } else {
                    continue;
                }
            }
            arr[i] = cnt;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}