import java.io.*; //이거 추가해준다.
import java.util.*;
 
public class baek_1929 {
	
	public static void main(String[] args) throws IOException { //이 줄에서부터
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken()); //이 줄까지 변경되었다.
		
		final int SIZE = 1000001;
		boolean array[] = new boolean[SIZE];
		Arrays.fill(array, false);
		
		array[1] = true;
		
		for (int i = 2; i <= N; i++)
		{
		//2022년 1월 24일 지금 보니 이 부분에 if(array[i] == true) continue;를 추가해야 할것 같다.
			for(int k = 2; i*k <= N ; k++)
			{
				array[i*k] = true;
			}
		}
		
		for (int i = M; i <= N ; i++)
		{
			if(array[i] == false) System.out.println(i);
		}
        
	}
}