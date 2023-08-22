import java.util.Scanner;

public class BOJ_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전의 종류
        int price = sc.nextInt(); // 만들어야 하는 값
        int[] coin = new int[N];
        int cnt = 0;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt(); // 동전은 오름차순으로 입력해야함
        }

        for (int i = 0; i < N; i++) {
            if(price == coin[i]) {
                cnt ++;
                System.out.println(cnt);
                break;
            } else if (price > coin[i]) { // 어디까지 돌려야하는가
                maxIndex = i;
                break;
            }
        }
        if (sum < price) {
            sum += 1;
        }
    }
}
//