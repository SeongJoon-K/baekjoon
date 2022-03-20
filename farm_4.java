import java.util.Scanner;

public class farm_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String input = sc.nextLine();
        if (input.contains("+")) {
            System.out.print(a + b);
        } else if (input.contains("-")) {
            System.out.println(a - b);
        } else if (input.contains("*")) {
            System.out.println(a * b);
        } else if (input.contains("/")) {
            System.out.println(a / b);
        }
        sc.close();
    }
}
