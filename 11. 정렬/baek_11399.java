import java.util.Arrays;
import java.util.Scanner;

public class baek_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        int sum = 0;
        int addTime = 0;
        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sum += time[j];
            }
        }
        System.out.println(sum);
    }
}
