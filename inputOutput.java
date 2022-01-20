import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        // int count = 0;

        // for(;;) {
        //     System.out.println("출력");
        //     count++;
        //     if (count == 10) {
        //         break;
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수를 입력하세요:");
        // int i = sc.nextInt();
        // System.out.println("입력된 정수는" + i + "입니다.");
        // sc.close();

        File file = new File("input.txt");
        try { // 이 부분을 실행하다가 오류 발생하면 아래 실행.
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) { // 읽어올 수 있는 정수가 존재할 때.
                System.out.println(sc.nextInt() * 100);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
        }
    }
}
