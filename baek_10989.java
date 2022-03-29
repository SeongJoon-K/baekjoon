import java.io.BufferedReader;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class baek_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int value : arr) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
