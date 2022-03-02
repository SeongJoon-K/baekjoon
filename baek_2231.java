import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i / 100000 >= 1) {
                if (N == i + (i/100000)+((i%100000)/10000)+((i%10000)/1000)+((i%1000)/100)+ ((i%100)/10)+ i%10); {
                    System.out.println(i);
                    break;
                }
                
            } else if (i / 10000 >= 1) {
                if (N == i + (i/10000)+((i%10000)/1000)+((i%1000)/100)+((i%100)/10)+ i%10); {
                    System.out.println(i);
                    break;
                }
                
            } else if (i / 1000 >= 1) {
                if (N == i + ((i/1000)+ ((i%1000)/100)+ (i%100)/10)+ i%10); {
                    System.out.println(i);
                    break;
                }
                
            } else if (i / 100 >= 1) {
                if (N == i + i/100+ ((i%100)/10) + i%10); {
                    System.out.println(i);
                    break;
                }
                
            } else if (i / 10 >= 1) {
                if (N == i + i/10 + i %10); {
                    System.out.println(i);
                    break;
                }
                
            } else {
                if (i + i == N){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
