public class func {
    public static int function(int number, int k) { // static 이후 순서대로 반환형, 함수이름, 매개변수 순임
        for(int i = 1; i <= number; i++) {  // 정수 i를 선언하고 i가 number가 될 때까지 증가시킨다.
            if (number % i == 0) {          // number를 i로 나눴을 때, 나머지가 0이면 i는 number의 약수라는 소리임
                k--;                        // 약수를 찾았을 때 k에서 1을 빼줌으로써 k번째 약수에 다가가게 한다.
                if (k==0) {                 // 그리고 k가 0이 되었다는 것은 number에 k번째 약수를 찾았다는 의미임.
                    return i;               // 그리고 ㅏ번째 약수를 리턴해서 함수를 끝냄
                }
            }
        }
        return -1;                          // 포문이 다 돌았는데 -1이 출력되면 k 번째 약수가 없는 것임.
    }
    //  이 함수는 number라는 수가 있을 때, 그 수의 k 번째 약수를 구하는 함수이다.
    public static void main(String[] args) {
        System.out.println("정수 120의 7번째 약수는"+function(120, 7));
    }
    
}
