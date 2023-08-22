import java.util.Arrays;
import java.util.Scanner;

public class baek_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x_arr = new int[3];
        int[] y_arr = new int[3];

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x_arr[i] = x;
            y_arr[i] = y;
        }

        if(x_arr[0] == x_arr[1]) {
            System.out.print(x_arr[2] + " ");
        } else if (x_arr[0] == x_arr[2]) {
            System.out.print(x_arr[1] + " ");
        } else if (x_arr[1] == x_arr[2]) {
            System.out.print(x_arr[0] + " ");
        }

        if(y_arr[0] == y_arr[1]) {
            System.out.print(y_arr[2]);
        } else if (y_arr[0] == y_arr[2]) {
            System.out.print(y_arr[1]);
        } else if (y_arr[1] == y_arr[2]) {
            System.out.print(y_arr[0]);
        }
        
    }
}
