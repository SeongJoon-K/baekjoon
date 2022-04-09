import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 입력 받는 수의 갯수는 홀수
        int sum = 0;
        int[] index = new int[4001]; // 각 숫자별로 카운트하는 배열
        int max = 0;
        int min = 4001;
        int maxindex = 0;
        int cnt = 0;
        int[] high = new int[4001];
        int mod = 0;
        boolean check = false;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum = arr[i];
        }
        // --
        int[] cnt_arr = new int[N];
        for (int i = 0; i < N; i++) {
            cnt_arr[i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    cnt_arr[i] += 1;
                }
            }
        }
        int max_cnt = 1;
        int result_index = 0;
        int newArr [] = new int[N];
        for (int i = 0; i < N; i++) {
            // System.out.println(cnt_arr[i]);
            if (max_cnt < cnt_arr[i]) {
                max_cnt = cnt_arr[i];
                newArr[i] = max_cnt;
            }
        }
        if (max_cnt != 1) {
            System.out.print(arr[result_index]);
        } else {

        }

    }

    Arrays.sort(arr);
    // System.out.println(sum / N);
    // System.out.println(arr[(N + 1) / 2 - 1]);
    // System.out.println(arr[high[cnt]]); // 최빈값, 여러개 있을 땐
    // System.out.println(max - min);

}
