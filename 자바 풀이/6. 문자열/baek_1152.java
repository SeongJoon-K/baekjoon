import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1152 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        // int count = 0;
        // for (int i = 0; i < st.countTokens();i++){
        //     count ++;
        // }
        
        System.out.println(st.countTokens());
    }
}
