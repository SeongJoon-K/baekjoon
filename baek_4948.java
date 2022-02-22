import java.util.Scanner;

public class baek_4948 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int sum = 0;
            if (N == 0) {
                System.out.println(0);
                break;
            } else {
                for (int i = N; i <= 2*N; i++) {
                    for (int j = 2; j <= i; j++) {
                        if (i % j == 0 && j < i) {
                            break;
                        } else if (i == j) {
                            sum++;
                        }
                    }
                }
                System.out.println(sum);
            }
        }
    }
}