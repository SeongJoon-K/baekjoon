import java.util.Scanner;

public class baek_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        System.out.println(String.format("%.6f",Math.PI*r*r));
        System.out.println(String.format("%.6f",2*r*r));
    }
}
