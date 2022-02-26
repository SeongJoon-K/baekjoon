import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_4153 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if (x == 0 && y == 0 && z==0) break;

            if (x*x+y*y == z*z && x > 0 && y > 0 && z > 0) {
                System.out.println("right");
            } else if (y*y+z*z == x*x && x > 0 && y > 0 && z > 0) {
                System.out.println("right");
            } else if (z*z+x*x == y*y && x > 0 && y > 0 && z > 0) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}