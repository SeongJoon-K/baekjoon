
import java.io.IOException;
import java.util.Scanner;

public class baek_2741 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String star = "*";
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
