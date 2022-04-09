import java.util.Scanner;

public class baek_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 자연수 M
        int N = sc.nextInt(); // 자연수 N
        int sum = 0; // 소수의 합
        int minNum = 10000;
        for (int i = M; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && j < i) {
                    break;
                } else if (j == i) {
                    sum += j;
                    if (minNum > i) {
                        minNum = i;
                    }
                    
                }
            }

        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minNum);
        }
    }
}
