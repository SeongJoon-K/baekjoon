import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
public class ahn_10818 {
   
   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
           int n = Integer.parseInt(st.nextToken());
           num.add(n);
        }
        num.sort(Comparator.naturalOrder());
        System.out.println(num.get(0)+" "+num.get(N-1));
    }
}