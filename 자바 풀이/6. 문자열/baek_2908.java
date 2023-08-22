import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        // System.out.println("A길이"+A.length());
        // System.out.println("B길이"+B.length());
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 2;i++) {
            arr1[i] = A.charAt(2-i)-'0';
            arr2[i] = B.charAt(2-i)-'0';

        }

        for (int j = 0; j <= 2; j++) {

            if (j == 0) {
                sum1 = arr1[j] * 100;
                sum2 = arr2[j] * 100;
            } else if (j == 1) {
                sum1 = sum1 + arr1[j] * 10;
                sum2 = sum2 + arr2[j] * 10;
            } else if (j == 2) {
                sum1 = sum1 + arr1[j];
                sum2 = sum2 + arr2[j];
            }
        }
        if (sum1 > sum2) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }

        
    }   
}
