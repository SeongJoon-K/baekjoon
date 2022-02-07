import java.util.Scanner;

public class baek_1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        
        for (int i = 1; i <= n; i ++) {
            if (i < 100) {
                cnt++;
            } else {
                int num1 = i / 100;
                int num2 = (i % 100) / 10;
                int num3 = i % 10;
                if (num2 * 2 == num1 +num3) {
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}