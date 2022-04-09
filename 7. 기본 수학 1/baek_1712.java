import java.util.Scanner;

public class baek_1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 개당 생산단가
        int C = sc.nextInt(); // 판매가격
        int price = C - B;
        int i;            // 생산 물건 갯수

        if (B >= C) {         // 생산단가가 판매가보다 비쌀 때
            i = -1;
            System.out.println(i);
        } else {
            i = A/price + 1;
            System.out.println(i);
        }
    }
}