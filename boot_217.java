import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.jar.Manifest;

public class boot_217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int[] shot = new int[7];
        int sum = 0;
        double random = Math.floor(Math.random()*(arr.length-1));
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        while (true) {
            for (int k = 0; k < 7; k++) {
                shot[k] = arr [(int)random];
                sum += shot[k];
                System.out.println(shot[k]);
            }
            if (sum == 100) {
                for(int k=0;k < 7; k++) {
                    System.out.println(shot[k]);
                }
                break;
            } else {
                sum = 0;
            }
            
        }
    }
}
