import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class farm_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (i == str.length() - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + ",");
            }
        }
        sc.close();
    }
}
