import java.util.Scanner;


public class method_pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();


        method_pratice mp = new method_pratice();
        mp.sum(int[] b);
    }

    public long sum(int[] a) {

        int hap = 0;
        for (int i = 0; i < a.length; i++) {
            hap = hap + a[i];
        }
        System.out.println(hap);

    }
}