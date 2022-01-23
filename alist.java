import java.util.Scanner;

public class alist {
    public static int max(int a, int b) {
        return (a>b) ? a : b; 
        //삼항연산자를 사용해 조건이 참일 때, a 거짓일 때, b를 출력함.
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력하세요 : ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        // 스캐너를 통해서 입력을 받고 먼저 print룰 하여, 문장 출력
        // scanner.nextInt를 통해서 정수를 입력 받고 array의 크기를 입력한
        // number의 수로함

        for(int i = 0; i < number; i++) {
            System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
            array[i] = scanner.nextInt();
        }
        // for 문을 통해서 i를 선언하고, number가 될때까지 돔.
        // 배열에 들어갈 정수를 하나씩 입력하게 한다.
        int result = -1;
        for (int i = 0; i < number; i++) {
            result = max(result, array[i]);
        }
        System.out.println(result);
        // result -1을 통해서 max함수를 통해서 두개 의값을 비교하게한다.
    }

    
}
