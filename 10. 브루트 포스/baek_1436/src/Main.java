import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666; // 기본 수를 666이라고 잡는다.
        int count = 1;

        while(count != N) { //count 가 N이 될때까지 수를 계속 증가 시킨다.
            num ++;
            if (String.valueOf(num).contains("666")) {// 일일히 케이스를 구분하기 보다, 수를 증가시켜 한다.
                count ++;
            }
        }
        System.out.println(num);
        // 666, 1666, 2666, 3666, 4666, 5666, 6660, 6661

    }
}
