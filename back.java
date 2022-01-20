public class back {
    public static void main (String[] args) {
        
        int N = 15;
        // for(int i = N; i > 0 ; i--) {
        //     for(int j = i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // x^2 + y^2 = r^2
        for(int i = -N; i<=N; i++) {
            for(int j = -N; j <= N; j++) {
                if(i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

//  N으로 정의된 30이 첫번째 포문을 돈다.
//  그리고 두 번째 포문으로 넘어가서 j = i로 선언이 되고,
// j값만큼 *을 출력한다. 그리고 첫 번째 포문으로 넘어가서 줄을 띈다. 

// 다시 첫번째 포문으로 넘어와 1을 빼고 두번쨰 포문으로 넘어가 j에서 1을 빼고 
// 다시 *을 출력한다. 그리고 다시 줄을 띈다.

