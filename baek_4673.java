import java.io.IOException;

public class baek_4673{
   
    public static void main(String[] args) throws IOException{
        boolean[] check = new boolean[10001];
        for(int i = 0; i < check.length; i++) {
            check[i] = true;
        }
        for(int i = 1; i < check.length; i++) {
          //시작숫자
            int num = i;
            while(num <= 10000) {
            String num1 = String.valueOf(num);
            // 생성자
                for(int j = 0; j < num1.length(); j++) {
                    char num2 = num1.charAt(j);
                    int num3 = num2 - '0';
                    num += num3;
                }
                if(num > 10000) {
                break;
                }
                check[num] = false;
                }
            }
            for(int i = 1; i < check.length; i++) {
            if(check[i]) System.out.println(i);
        }
    }
}