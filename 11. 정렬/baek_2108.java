
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baek_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int sum = 0;
        int val = 0;
        for (int i = 0; i < N; i++) {
            val = sc.nextInt();
            arrayList.add(val);
            sum += val;
        }
        Collections.sort(arrayList); // ArrayList 정렬

        System.out.println(sum / N); // 산술평균값
        System.out.println(arrayList.get((N - 1) / 2)); // 중앙값
        System.out.println(arrayList.get(N - 1) - arrayList.get(0));// 범위
        // 수의 갯수 입력
        /*
         * 첫 번째 산술평균 입력
         * 두 번째 중앙값 입력
         * 세 번째 최빈값 입력
         * 네 번째 범위 입력
         * 
         */
        sc.close();
    }
}
