import java.util.Scanner;

public class baek_ertos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int T = sc.nextInt();
        int N = sc.nextInt();
        boolean[] arr = new boolean[10001];
        arr[0] = arr[1] = true; // 0과 1은 소수가 아니므로 true
        for (int k = 2; k <= N; k++) {
            arr[k] = false;
        }
        for (int i = 2; i * i <= N; i++) { // 2의 배수부터 N까지의 수를 거둠
            for (int j = i * i; j <= N; j += i) {
                arr[j] = true;
            }
        }

        int cnt = 0;
        for (int a = 0; a <= N; a++) {
            if (arr[a] == false) {
                System.out.println(a + " ");
            }
        }
    }
}