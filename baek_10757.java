import java.math.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class baek_10757 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        a = a.add(b);
        System.out.println(a.toString());
    }
}