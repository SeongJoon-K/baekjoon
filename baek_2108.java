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
        int[] index = new int[N];
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
            if (arr[i] == arr[1 + i]) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (max < cnt) {
                max = cnt;
                mod = arr[i];
                check = true;
            } else if (max == cnt && check == true) {
                mod = arr[i];
                check = false;
            }
        }
        Arrays.sort(arr);
        System.out.println(sum / N);
        System.out.println(arr[(N + 1) / 2 - 1]);
        System.out.println(arr[high[cnt]]); // 최빈값, 여러개 있을 땐
        System.out.println(max - min);

    }
}
