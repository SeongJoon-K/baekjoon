import java.util.Scanner;

public class baek_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= N ; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
