import java.util.Scanner;

public class baek_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 횟수
        // 내가 2층 3호에 살려면, 101호, 102호, 103호의 사람수의 합만큼 데리고 와야함
        
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호 수
            int[] height = new int[k];
            int[] hosu = new int[n];
            if (n == 1) {
                System.out.println(1);
            } else {
                for (int h = 1; h <= n; h++) {
                    hosu[h] = h; // 호수의 구성원은 그냥 h임
                for (int j = 0; j <= k; j++) { // 층수
                    if (k == 0) {   // 0층일때
                        System.out.println(hosu[j]);
                    } else {
                        for (int a = 1; a <=n; a++) {
                            
                        }
                    }
                }
            }
        }

        // 자신이 a층의 b호에 살기 위해서는 
        // 자신의 아랫층에 1호부터 b호까지의 합만큼 사람을 데리고 와야함

    }
}
