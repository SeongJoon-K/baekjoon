import java.util.Scanner;

public class baek_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 현재 x
        int y = sc.nextInt(); // 현재 y
        int w = sc.nextInt(); // 가로 길이
        int h = sc.nextInt(); // 세로 길이
            
        int x_min = Math.min(x, w-x);
        int y_min = Math.min(y, h-y);
        System.out.println(Math.min(x_min,y_min));
    }
}
