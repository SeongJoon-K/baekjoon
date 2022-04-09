import java.util.Scanner;

public class baek_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int cntArr[] = new int[N];
        for (int i = 0; i < N; i++) {// 각 배열 값에 수를 넣음
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
            cntArr[i] = cnt;
            if (i == N - 1) {
                System.out.println(cntArr[i]);
            } else {
                System.out.print(cntArr[i] + " ");
            }
        }
        // for (int i = 0; i < N; i++) {
        // System.out.print(cntArr[i] + " ");
        // }
    }
}