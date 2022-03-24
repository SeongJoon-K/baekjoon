import java.util.Scanner;

public class baek_9020 {
    public static void main(String[] args) {
        // 골드바흐의 수라 함은, 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        // 그 짝수를 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함.
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[10001];

        arr[0] = arr[1] = false;
        for (int j = 2; j <= 10000; j++) {
            arr[j] = true;
        }
        // for (int k = 2; k <= 10000; k++) {
        // for (int x = k + k; x <= 10000; x += k) {// 자기자신을 제외해야하므로 k+k
        // arr[x] = false; //
        // }
        // }

        int T = sc.nextInt(); // 테스트의 갯수 입력 받음
        while (T-- > 0) {
            int N = sc.nextInt(); // N 까지의 수만 소수를 판별하겠다.
            int a = N / 2;
            int b = N / 2;
            for (int k = 2; k <= N; k++) {
                for (int x = k + k; x <= N; x += k) {// 자기자신을 제외해야하므로 k+k
                    arr[x] = false; //
                }
            }
            while (true) {
                if (arr[a] == true && arr[b] == true) {
                    System.out.println(b + " " + a);
                    break;
                }
                a++;
                b--;
            }
        }
    }
}