import java.util.*;

public class baek_2798 {
    public static void main(String[] args) {
        // N장의 카드 중에서 
        // 3장을 골라서 M이랑 가장 가까운 수를 출력
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 바닥에 몇 장 깔껀지 3<= N <=100
        int M = sc.nextInt(); // 목표 숫자가 몇인지 10<= M <=300000
        int sum = 0; // i j k 더한 값을 넣음
        int max = 0; // 비교했을 때 더 크면 넣음
        int[] num_arr = new int[N];
        for (int a = 0; a < N; a++) {
            num_arr[a] = sc.nextInt();
        } // 카드의 수를 입력함  
        Arrays.sort(num_arr); // 카드 순서를 순서대로 정렬함 
        
        loo: // 세장의 카드를 뽑으므로 모든 경우의 수를 판별하기 위한 반복문 작성
        for (int i = 0; i < N-2; i++) { 
            for (int k = i+1; k < N-1; k++) {
                for (int j = i+2; j < N; j++) {
                    sum = num_arr[i] + num_arr[k] + num_arr[j];
                    if (sum == M) {
                        System.out.println(sum);
                        break loo;
                    } else if (sum < M) {
                        max = Math.max(max, sum);
                        // System.out.println(max);
                    }
                }
            }
        }
        if (sum != M) {
            System.out.println(max);    
        }
    }    
}
