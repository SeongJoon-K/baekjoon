import java.util.Scanner;

public class baek_9020 {
    public static void main(String[] args) {
        //골드바흐의 수라 함은, 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        //그 짝수를 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) { // 테스트 케이스 수
            int num = sc.nextInt(); // 테스트 짝수 값 입력

            for (int k = num-1; k <= 2; k--) { // 테스트 값에서 가장 가까운 수부터 소수판별
                for (int j = 2; j <= k; j++) {
                    if (k % j == 0 && j < k) {
                        break;
                    } else if (k == j) {
                        num= num -k;
                        System.out.print(num + " ");
                        break;
                    } else {
                        continue;
                    }
                }
                break;
            }
            for (int a = 2; a < num; a++) {
                for (int j = 2; j <= a; j++) {
                    if (a % j == 0 && j < a) {
                        break;
                    } else if (a == j && num-a ==0) {
                        System.out.print(num-a);
                        break;
                    } else {
                        continue;
                    }
                }
                break;
            }
            // System.out.println(fir+ " " + se);
        }
        
    }
}