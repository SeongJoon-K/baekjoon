import java.util.Scanner;

public class baek_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] so = new int[N];
        int index = 0;
        int origin = N;
        for (int i = 2; i <= N; i++){
            if (origin % i == 0) {
                so[index] = i;
                if (origin == i) {
                    break;
                } else if (origin > i) {
                    index ++;
                }
                origin = origin / i;
                i = 1;
                
            }
        }
        if (N == 1) {
            
        } else {
            for (int k = 0; k<=index; k++) {
                System.out.println(so[k]);
            }
        }
        
        
    }
}