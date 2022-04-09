import java.util.Scanner;

public class baek_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트의 횟수 입력
        int test; // 테스트 정수 변수 선언
        int sum = 0; // 소수를 더할 변수 선언
        for (int i = 1; i <= N; i++) {
            test = sc.nextInt(); // 숫자를 입력받음
            if (test < 1 && test >1000){ // 음...
                continue;
            } else {
                if (test == 1) {
                    continue;
                } else {
                    for (int j = 2; j <= test; j++) {
                        if (test % j == 0 && test > j) {
                            break;
                        } else if (j == test) {
                            sum++;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
