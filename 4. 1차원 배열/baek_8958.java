import java.util.Scanner;

public class baek_8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ox ;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            ox = sc.next();
            int count = 0;
            for (int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j) == 'O') {
                    count ++;
                    sum += count;
                } else {
                    count = 0;

                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
