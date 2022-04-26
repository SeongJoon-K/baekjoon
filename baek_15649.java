import java.util.Scanner;

public class baek_15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[1002];
        arr[0] = 0; // 0 초기화
        int cnt = 1; // 1은 1번 2는 2번
        for (int i = 1; i <= 1000; i++) {
            for (int j= 0; j <i; j++) {
                if (cnt ==1001) break;
                arr[cnt] = i;
                cnt ++;
            }

        }

        int sum = 0;
        for (int i = N; i <= M; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
