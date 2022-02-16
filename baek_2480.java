import java.util.Scanner;

public class baek_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        int[] arr = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int A = sc.nextInt();
            arr[i] = A;
        }
        if (arr[0] == arr[1] && arr[0] !=arr[2]) {
            System.out.println(1000 + arr[0]*100);
        } else if (arr[0] == arr[2] && arr[0] !=arr[1]){
            System.out.println(1000 + arr[0]*100);
        } else if (arr[1] == arr[2] && arr[0] !=arr[1]){
            System.out.println(1000 + arr[1]*100);
        } else if (!(arr[0] == arr[1] && arr[1] == arr[2])) {
            for (int j = 0; j<3;j++){
                if (max <= arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println(max*100);
        } else if (arr[0] == arr[1] && arr[1] == arr[2]){
            System.out.println(10000+arr[1]*1000);
        }
    }
}
