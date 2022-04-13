import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N]; // 정수입력 배열
        int avg = 0;

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
            avg += numArr[i]; // 산술평균 변수
        }
        Arrays.sort(numArr); // 중앙값과 최대최소의 범위 출력
        // 해당 배열을 오름차순으로 정렬시킴
        int[] indexCnt = new int[N];
        int cnt = 1;
        numArr[0] = 1;

        // System.out.println("최빈값 ");
        // // 현재 숫자와 뒤에숫자가 같으면 true 아
        // System.out.println("---");
        // System.out.println("산술평균 : " + avg / N); // 산술평균값
        // System.out.println("중앙값 : " + numArr[(N - 1) / 2]); // 중앙값
        // // 최빈값은 어떻게 구하나

        // System.out.println(numArr[N - 1] - numArr[0]);// 범위

        /*
         * 첫 번째 산술평균 입력
         * 두 번째 중앙값 입력
         * 세 번째 최빈값 입력
         * 네 번째 범위 입력
         * 
         */
    }
}
