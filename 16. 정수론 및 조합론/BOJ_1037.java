import java.util.Scanner;

public class BOJ_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int min = 1000000;
        // 약수는 그 중에서 제일 작은 값과 큰 값을 곱했을 때 나오는 수임
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min*max);
        sc.close();
    }
}
