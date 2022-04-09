import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        sc.close();
    }
}
