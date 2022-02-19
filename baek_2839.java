import java.util.Scanner;

public class baek_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 설탕공장 봉지는 3, 5kg
        int suga = sc.nextInt();
        
        if (suga % 5 == 0) {
            System.out.println(suga/5);
        } else if (suga % 5 == 3) {
            System.out.println(suga/5 +1);
        } else if (suga % 5 != 3 || suga % 5 != 0) {
            System.out.println(-1);
        }
    }
    
}
