import java.util.Scanner;

public class baek_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int[] a1 = new int[a];
        int[] b1 = new int[b]; // 여기서 a1,b1은array의 주솟값

        System.out.println(a);
        System.out.println(b);
        System.out.println(b[1]);
        for (int i = 0; i < 3; i++) {
            System.out.println(a*b1[i]);
    
    
        }
    }
}
    
