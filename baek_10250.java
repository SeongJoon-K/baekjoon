import java.util.Scanner;

public class baek_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) { // 테스트 횟수
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            for (int j = 1; j <= W; j++) {
                for (int k = 1; k <= H; k++) {
                    if (j < 10 ){
                        
                        N--;
                        if (N==0){
                            System.out.println(k + "0" +j);
                            break;
                            
                        }
                    } else {
                        N--;
                        if (N==0){
                            System.out.println(k +""+j);
                            break;
                        }
                    }
                    if (N==0){
                        break;
                    }
                }
                if (N==0){
                    break;
                }
            }

        }
    }
}
