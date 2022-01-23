public class randomint {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        // int[] array 를 통해서 100개의 배열을 선언한다.
        // 그리고 for 문을 통해서 각 배열마다 랜덤한 정수값을 받는다
        // Math.random의 경우 0<= i < 1까지의 수가 반환이 되어서
        // 100을 곱하고 1을 더해주는 것이다.
        }
        for (int i = 0; i <=99; i++){
            System.out.println(array[i]);
        }
        // 배열의 인덱스는 0부터 시작되기 때문에 마지막 인덱스는 99이다
        // 따라서 99까지 포문을 반복하고 각 어레이를 출력시킨다.
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += array[i];
        }
        // sum값을 0으로 선언한 뒤 모든 어레이의 값을 더해버린다.
        // 그러고 나서 아래에 100을 나눠 출력하면, 전체 어레이의 평균값이 도출된다.
        System.out.println("평균은"+sum/100);
    }
}
