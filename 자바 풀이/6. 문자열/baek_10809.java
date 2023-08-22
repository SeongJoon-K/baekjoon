import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap();
        for(char i = 'a' ; i <='z'; i++){
            map.put(i,-1);
        }
        for (int i = 0; i < str.length();i++){
            if(map.get(str.charAt(i)) != -1){
                continue;
            }
            map.put(str.charAt(i),i);
        }
        for(char key : map.keySet()){
            System.out.print(map.get(key)+ " ");
        }
    }
}
