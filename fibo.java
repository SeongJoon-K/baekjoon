public class fibo {
    public static int fibonaci(int number) {
        // int one = 1;
        // int two = 1;
        // int result = -1;
        // if (number = 1) {
        //     return one;
        // } else if (number == 2) {
        //     return two;
        // } else {
        //     for (int i = 2; i < number; i++) {
        //         result = one + two
        //         one = two;
        //         two = result;
        //     }
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 2;
        } else {
            return fibonaci(number - 1) + fibonaci(number -2);
        }
    }
    public static void main(String[] args) {
        System.out.println("피보나치 수열의 값" +fibonaci(4));
    }
}
