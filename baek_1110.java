import java.util.Scanner;

public class baek_1110 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 0; // 사이클 수 세기
        int N = sc.nextInt();
        //처음 수 설정 하고 아래 로직대로 돌아간다
        int de = N;
        while (true) {
             // 처음 지정 숫자 설정
                // N의 10의 자리수와 1의 자리를 더했을 때 두 수의 값이 10이 넘어가면 1n에서
                // n을 1의 자리로 하고 처음 수의 1의 자리수를 10의 자리로 한다.
                // 그렇지 않으면, 10의 자리수와 1의 자리수 더한 걸 일의 자리로하고
                // 1의자리수를 10의 자리수로 만든다.
            if (N == 0) {
                count = 1;
                break;
            } else {
                if (((N/10) + (N%10))>=10) {
                    N = (N%10) * 10 + ((N/10) + (N%10)-10);
                    count ++;
                    if (count > 1 && N == de) {
                        break;
                    }
                } else if (((N/10) + (N%10)) < 10) {
                    N = (N/10) + (N%10) + (N%10*10);
                    count ++;
                    if (count > 1 && N == de) {
                        break;
                    }                   
                } 
            }
               
        }
        sc.close();
        System.out.println(count);
    }
}
