import java.util.Scanner;

public class baek_9020 {
    public static void main(String[] args) {
        // 골드바흐의 수라 함은, 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        // 그 짝수를 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함.
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[10001];

        int T = sc.nextInt(); // 테스트의 갯수 입력 받음
        for (int j = 2; j <= 10000; j++) {
            arr[j] = true;
        }
        arr[0] = arr[1] = false;
        for (int i = 0; i < T; i++) { // 테스트 케이스만큼 반복
            int N = sc.nextInt(); // N 까지의 수만 소수를 판별하겠다.
            int middle = N / 2;
            for (int k = 2; k <= N; k++) {
                for (int x = k + k; x <= N; x += k) {// 자기자신을 제외해야하므로 k+k
                    arr[x] = false;
                }
            }
            // 이제 대칭성을 이용해서 짝수를 입력 받을 때, 소수 두개를 출력하게 만든다
            // N을 절반으로 나눴을 때 N/2가 소수라면 그것들 출력
            if (arr[N / 2] == true) {
                System.out.println(N / 2 + " " + N / 2);
            } else {
                for (int a = middle + 1; a < N; a++) {
                    if (arr[a] == true) {
                        for (int b = middle - 1; b <= 4; b--) {
                            if (arr[b] == true && a + b == N) {
                                System.out.println(b + " " + a);
                                break;
                            }
                        }
                    }
                }
            }
        }

    }
}