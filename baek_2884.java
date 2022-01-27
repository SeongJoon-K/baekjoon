import java.util.Scanner;

public class baek_2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        if (H != 0 && M < 45) {
            System.out.println(H-1+ " " + (60+M-45));
        } else if (H != 0 && M >= 45) {
            System.out.println(H + " " + (M-45));
        } else if (H == 0 && M < 45) {
            System.out.println(23 + " " + (60+M-45));
        } else if (H == 0 && M >= 45) {
            System.out.println(H + " " +(M-45));
        }
    }
    
}
