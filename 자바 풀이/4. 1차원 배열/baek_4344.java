import java.util.Scanner;

public class baek_4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int sum = 0;
            double avg = 0;
            double cnt = 0;
            int[] score = new int[N];
            for (int j = 0; j < N; j++){
                score[j] = sc.nextInt();
                sum = sum + score[j];
                System.out.println("Sum 값" + sum);
            }
            avg = sum / N;
            for (int k = 0; k < N; k++){
                if (score[k] > avg) {
                    cnt ++;
                }
            }
            System.out.println("평균"+avg);
            System.out.println(String.format("%.3f", (cnt/N)*100) +"%");
        }
    }
}
