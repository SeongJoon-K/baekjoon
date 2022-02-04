import java.util.Scanner;

public class baek_4673 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum;

        while (true) {

            if (a / 1000 > 1) {
                sum = a + (a/1000) + ((a%1000)/100) + ((a%100)/10) + (a%10);
                System.out.println(sum);
                if (sum >= 10000) {
                    break;
                }
            } else if (a / 100 < 10 && a / 100 > 1) {
                sum = a + (a/100) + ((a%100)/10) + (a%10);
                System.out.println(sum);
            } else if (a / 10 < 10 && a / 10 > 1) {
                sum = a + (a/10) + a%10;
                System.out.println(sum);
            } else {
                sum = a + a;
                System.out.println(sum);
            }
        }
    }
}
