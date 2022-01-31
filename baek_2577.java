import java.util.Scanner;

public class baek_2577 {
    public static void main(String[] args) {
// 세개의 자연수 A,B,C가 주어질 때 
// 계산한 결과에 0부터 9까지  각각의 숫자가 몇 번씩 쓰였는지 구하는 프로그램 작성
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt() * sc.nextInt() * sc.nextInt();

        String value = Integer.toString(result);
        sc.close();
        System.out.println(value);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < value.length(); j++){
                if ((value.charAt(j) - '0') == i) {
                    count++;                
                }
                System.out.println(value.charAt(j)-'0'+"두번째포문 ㄱ끝");
            }
            System.out.println(count);
        }
    }
}
