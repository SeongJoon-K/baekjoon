import java.util.Scanner;

public class baek_9020 {
    public static void main(String[] args) {
        //골드바흐의 수라 함은, 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        //그 짝수를 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트의 갯수 입력 받음
        /* 
        2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
        이를 골드바흐의 수라고 함
        */ 
        for (int i = 0; i < T; i++) { // 테스트 케이스 만큼 2보다 큰 짝수를 입력받는더
            int N = sc.nextInt(); // 짝수를 입력받음 그리고 N까지 소수를 찾는다
            int[] arr = new int[N];
            int index = 0;
            for (int j = 2; j <= N; j++) {
                if (N % j == 0 && j < N) {
                    continue;
                } else if (N == j) {
                    arr[index] = j;
                    index++;
                }
            }
            System.out.println(arr[index]);   
        }
                
    }
}