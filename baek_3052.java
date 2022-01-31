import java.util.Scanner;

public class baek_3052 {
    public static void main(String[] args) {

/* 정수 10개를 입력 받은 후 42로 나눈 나머지를 구하고
각 값의 결과들이 서로 다른 값이 몇 개 있는지 출력하는 프로그램 작성
*/  
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = (arr[i]%42);       
        }
        for (int j = 0; j < 10; j++) {
            int sim = 0;
            for(int k = j+1; k < 10; k++) {
                if (arr[j] == arr[k]) {
                    sim++;
                    }
                }
                if (sim == 0) {
                    count++;
            }
        }
        System.out.println(count);
    }
    
}
// 1 2 2 3 3 4 가 있을때 
