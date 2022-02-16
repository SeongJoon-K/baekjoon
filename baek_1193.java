import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek_1193 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // X 까지 지그재그로 돌면 얼마나 나오는지
        int cnt = 0; // 개수
        int n = 0;  // 행번호
    
        while (true) {
            n++; //행번호
            cnt += n;   //개수
            if (cnt >=X) {
                if(n%2==0) {
                    System.out.println(X-cnt+n + "/" + (cnt-X+1));
                } else {
                    System.out.println((cnt-X+1) + "/"+(X-cnt+n));
                }
                break;
            }
        }
    }
}