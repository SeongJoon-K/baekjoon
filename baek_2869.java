
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class baek_2869 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int up = Integer.parseInt(br.readLine());
        int down = Integer.parseInt(br.readLine());
        int length = Integer.parseInt(br.readLine());
        int day = (length - down) / (up - down);
        
        if ( ((length - down) % (up - down)) != 0) {
            day++;
        }
        System.out.println(day);
 
    }   
}
