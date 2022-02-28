import java.util.Scanner;

public class baek_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tb=0 ;
        int ob=1 ;
        int sum = 1;
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i < n; i++) {
                if (n == 2) {  
                    System.out.println(ob);
                }
                tb = ob;
                ob = sum;
                sum = tb + ob;
            }
            System.out.println(sum);
        }
    }
}
