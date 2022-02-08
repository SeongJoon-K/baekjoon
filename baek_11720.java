import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baek_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[N];
        String str = br.readLine();
        for(int i = 0; i < N; i++){
            int num = str.charAt(i) - '0';
            arr[i] = num;
        }
        int answer = 0;
        for(int i = 0; i < N; i++){
            answer += arr[i];
        }
        System.out.println(answer);
        for (int i = 0; i < N; i++) {
            
        }
    }   
}
