import java.util.Scanner;

public class baek_2577 {
    public static void main(String[] args) {
// 세개의 자연수 A,B,C가 주어질 때 
// 계산한 결과에 0부터 9까지  각각의 숫자가 몇 번씩 쓰였는지 구하는 프로그램 작성
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt() * sc.nextInt() * sc.nextInt();

        String value = Integer.toString(result);
        sc.close();
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < value.length(); j++){
                if ((value.charAt(j) - '0') == i) {
                    /* charAt(j)의 경우 그 문자열에서 j번째에 해당하는 값만 
                     추출하는 것이다. 따라서 이 경우에
                     value라는 결과값에 한 개씩 잘라서, charAt(j)로 하여금
                     j가 0일때 0인덱스에 있는 숫자값과 i의 값을 비교하는 것이고
                     for 문에 따라 j(자릿수)가 증가하면서 count가 증가하고
                     출력하게 되는 것이다.
                     그리고 두 번째 1번째 자리부터 마지막값까지 비교가 끝나고
                     i가 증가해 다시 비교하게 된다.
                    */ 
                    count++;                
                }
            }
            System.out.println(count);
        }
    }
}
