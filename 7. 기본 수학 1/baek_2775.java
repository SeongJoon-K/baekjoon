import java.util.Scanner;

public class baek_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 횟수
        // 내가 2층 3호에 살려면, 101호, 102호, 103호의 사람수의 합만큼 데리고 와야함
        int[][] APT = new int[15][15];
        for (int a = 0; a < 15; a++) {
            APT[0][a] = a;
            APT[a][1] = 1;
        }

        for (int i = 1; i <= T; i++) {
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호 수
            for (int j = 1; j < 15; j++) { // 1층 14층


                for (int h = 2; h < 15; h++) { // 2호부터 14호
                    APT[j][h] = APT[j][h-1] + APT[j-1][h];
                }
            }
            System.out.println(APT[k][n]);
        }

        // 자신이 a층의 b호에 살기 위해서는 
        // 자신의 아랫층에 1호부터 b호까지의 합만큼 사람을 데리고 와야함

    }
}
