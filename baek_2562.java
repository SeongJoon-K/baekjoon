import java.util.Scanner;

public class baek_2562 {
    public static void main(String[] args) {

    /* 9개의 자연수가 주어질 때, 이들 중 최대삾을 찾고 그 최댓값이 몇 번째
    수인지를 파악해야함.
    입출력 부분을 보니 각 줄마다 0~100까지의 자연수를 입력한다
    출력 콘솔에는 max의 값과 두 번째 줄에 maxIndex 값이 주어진다.
    Scanner를 통해서 배열을 입력받고
    맥스값이 갱신될 때마다 maxIndex에 인덱스 값을 넣는다.
    배열의 첫 번째는 0부터 시작이니 maxIndex+1을 해야한다.
    그리고 반복문이 끝날 때,max값과 maxIndex값을 출력한다.
    */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxIndex=0;

        for (int i = 0; i < 9; i++) {
            int A = sc.nextInt();
            arr[i] = A;
            if (A > max && A < 100) {
                max = A;
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}

