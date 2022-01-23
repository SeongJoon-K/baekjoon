public class randomint {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i <=99; i++){
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += array[i];
        }
        System.out.println("평균은"+sum/100);
    }
}
