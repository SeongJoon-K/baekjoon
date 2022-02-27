import java.util.Scanner;

public class baek_9020 {
    public static void main(String[] args) {
        //골드바흐의 수라 함은, 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        //그 짝수를 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트의 갯수 입력 받음
        /*
        2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있음
        경우의 수가 여러개 있을 시 두 소수의 차이가 작은 걸로 출력함
         */
        for (int i = 0; i < T; i++) { // 테스트의 수 만큼 반복함
            int N = sc.nextInt(); // 2 보다 큰 짝수 값을 입력받음
            // N보다 작은 수들 중에서 소수를 판별
            for (int j = 2; j < N; j++) { // 2 부터 N 까지 소수를 판별함
                for (int k = 2; k <= j; k++) { 
                    if (j % k == 0 && k < j) { // j / k 해서 나머지가 없으면 이는 소수가 아님
                        break;
                    } else if (j == k) { // j는 소수인게 확정됨 
                        for (int a = 2; a <= N-j; a++){
                            if (N-j % a == 0 && a < N-j) {
                                break;
                            } else if (a==N-j){
                                
                            }
                        }
                        System.out.println(k + " " + N);
                        break;
                    }
                }
            }
        }        
    }
}