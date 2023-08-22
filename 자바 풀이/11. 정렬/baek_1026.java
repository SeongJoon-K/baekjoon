import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        Integer[] arr2 = new Integer[N];
        int[] arr1_index = new int[N+1];
        int sum = 0;
        for (int i = 0; i < N; i++) { // 배열 A 이동 가능
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) { // 배열 B 이동 안됨
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i = 0; i < N; i++) { // 배열 B 이동 안됨
            sum += arr1[i] * arr2[i];
        }
        System.out.println(sum);
    }
}
