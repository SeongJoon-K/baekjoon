import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class baek_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < count; i++) {
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));

        }
        bw.close();
        bw.flush();
        bw.close();



        
    }
}
