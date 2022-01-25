import java.util.Scanner;

public class baek_1 {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a입력 : ");
        // int A = sc.nextInt();
        // System.out.print("정수 b입력 : ");
        // int B = sc.nextInt();
        // System.out.println(A-B);
        // sc.close();

        int [][] arr = new int [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j ++) {
                arr[j] = j;
            }
            arr[i] = i;
        }


    }
    
}