import java.util.Arrays;
import java.util.Scanner;

public class baek_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr = new int[T][2];
        for (int i = 0; i < T; i++) {
            arr[i][0] = sc.nextInt(); // 몸무게
            arr[i][1] = sc.nextInt(); // 키
        }
        for (int i = 0; i<T; i++) { // 비교
            int rank = 1;
            for(int j = 0; j < T; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank ++;
                }
            }
            System.out.println(rank);
        }        
        /*
        랭크를 주는 법 키를 먼저 비교한다.
        */
    }
}