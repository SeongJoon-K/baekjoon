import java.util.Scanner;

public class baek_1018 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[3]={3,5,7};
        for (int i = 0; i <= 2; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 2; j <= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}