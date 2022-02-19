import java.util.Scanner;

public class baek_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 설탕공장 봉지는 3, 5kg
        int suga = sc.nextInt();
        if (suga % 10 == 3) {
            System.out.println(suga/5 + 1);
        } else if (suga % 10 == 4 && suga > 10) {
            System.out.println((suga-9)/5+3);
        } else if (suga % 10 == 5) {
            System.out.println(suga/5);
        } else if (suga % 10 == 6) {
            System.out.println((suga-6)/5 +2);
        } else if (suga % 10 == 7 && suga >10) {
            System.out.println((suga-12)/5+4);
        } else if (suga % 10 == 8) {
            System.out.println((suga-3)/5+1);
        } else if (suga % 10 == 9) {
            System.out.println((suga-9)/5+3);
        } else if (suga % 10 == 0) {
            System.out.println(suga/5);
        } else if (suga % 10 == 1) {
            System.out.println((suga-6)/5+2);
        } else if (suga % 10 == 2) {
            System.out.println((suga-12)/5+4);
        } else {
            System.out.println(-1);
        }
    }
    
}
