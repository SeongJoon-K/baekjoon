import java.util.Scanner;

public class baek_10871 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 먼저 수열의 갯수 N을 입력한다.
        int X = sc.nextInt();   // 입력 받은 X 보다 작은 수를 출력하게 함.

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 먼저 수열을 입력받는다.
        }
        sc.close();

        for (int j = 0; j<N;j++){
            if (arr[j] < X){
                System.out.print(arr[j] + " ");
            }
        }
    }
}