import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baek_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); // x축 좌표는 [i][0]
            arr[i][1] = sc.nextInt(); // y축 좌표는 [i][1]
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

// 이차원 배열 Comparator 출처 https://ifuwanna.tistory.com/328