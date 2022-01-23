import java.util.Scanner;

public class baek_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a입력 : ");
        int A = sc.nextInt();
        System.out.print("정수 b입력 : ");
        int B = sc.nextInt();
        System.out.println(A-B);
        sc.close();
    }
    
}