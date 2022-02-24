import java.util.Scanner;

public class baek_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 현재 x
        int y = sc.nextInt(); // 현재 y
        int w = sc.nextInt(); // 가로 길이
        int h = sc.nextInt(); // 세로 길이
        if (x < 0.5*w && y < 0.5*h) { // 3사분면
            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        } else if (x < 0.5*w && y > 0.5*h) { // 2사분면
            if (x < h-y) {
                System.out.println(x);
            } else {
                System.out.println(h-y);
            }
        } else if (x > 0.5*w && y > 0.5*h) { // 1사분면
            if (w-x < h-y) {
                System.out.println(w-x);
            } else {
                System.out.println(h-y);
            }
        } else if (x > 0.5*w && y < 0.5*h) { // 4사분면
            if(w-x < h) {
                System.out.println(w-x);
            } else {
                System.out.println(h);
            }
        } else if (x == y) { // 두수가 같을 때,
            System.out.println(y);
        } 
    }
}
