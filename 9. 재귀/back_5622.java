import java.util.Scanner;

public class back_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();// 문자를 입력받는다
        char[] arr = new char[str.length()]; 
        // char 형 Array를 만들어서 str에 한 글자씩
        // 배열에 넣는다
        int sumText = 0; // 다이얼의 정수 값을 받을 변수를 선언한다.

        for (int i = 0; i < str.length(); i++) { // str의 길이만큼 반복문 돌림
            arr[i] = str.charAt(i);
        }
        for (int j = 0; j < str.length(); j++) {
            if (arr[j] == 'A' || arr[j] == 'B'|| arr[j] == 'C' ) {
                sumText += 3;
            } else if (arr[j] == 'D' || arr[j] == 'E'|| arr[j] == 'F') {
                sumText += 4;
            } else if (arr[j] == 'G' || arr[j] == 'H'|| arr[j] == 'I') {
                sumText += 5;
            } else if (arr[j] == 'J' || arr[j] == 'K'|| arr[j] == 'L') {
                sumText += 6;
            } else if (arr[j] == 'M' || arr[j] == 'N'|| arr[j] == 'O') {
                sumText += 7;
            } else if (arr[j] == 'P' || arr[j] == 'Q'|| arr[j] == 'R' || arr[j] == 'S') {
                sumText += 8;
            } else if (arr[j] == 'T' || arr[j] == 'U'|| arr[j] == 'V') {
                sumText += 9;
            } else if (arr[j] == 'W' || arr[j] == 'X'|| arr[j] == 'Y' || arr[j]=='Z') {
                sumText += 10;
            }
        }
        System.out.println(sumText);
    }
}


