import java.util.Scanner;

public class baek_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] score = new double[N];
        double max = 0;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("max값" + max);
        for (int i = 0; i < score.length; i++) {

            score[i] = score[i] * 100 / max;

            System.out.println("이거 바꾼점수 값" + score[i]);
            sum = score[i] + sum;
        }
        System.out.println(sum / N);
    }
}
