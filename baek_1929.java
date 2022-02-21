import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baek_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<Integer>();
        int index = 0;
        for (int i = M; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j < i && j > 1) {
                    break;
                } else if (i == j && j > 1) {
                    arr.add(i);
                    index++;
                } 
            }
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}