import java.util.Scanner;

public class baek_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int test;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            test = sc.nextInt();
            if (test < 1 && test >1000){
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
