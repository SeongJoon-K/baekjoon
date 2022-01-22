public class charpra {

    public static int max(int a, int b) {
        return (a > b) ? a : b; // 삼항연산자는 앞에 있는 조건문이 참일 때, true면 a, false면 b를 출력하는 것.
    }
    public static int function(int a, int b, int c) {
        int result = max(a,b);
        result = max(result, c);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("(345,124,566)중에서 가장 큰 값은" + function(345,124,566));
    }
}
