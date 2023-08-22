import java.util.Scanner;

public class baek_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int N = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (N <= sum && N > sum - 6*cnt) {
                System.out.println(cnt);
                break;
            }
            
            sum = sum + 6*cnt;
            cnt ++;
        }
    }
}
