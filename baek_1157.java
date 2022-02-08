import java.util.HashMap;
import java.util.Scanner;

public class baek_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str = str1.toLowerCase();
        System.out.println(str);
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i,0);
        }
        for(int i = 0; i < str.length(); i++){
            char cha = str.charAt(i);
            map.put(cha,map.get(cha)+1);
        }
        char max = 'a';
        for(char key : map.keySet()){
            if(map.get(key) > map.get(max)) max = key;
        }
        char answer ='1';
        for(char key : map.keySet()){
            if(max == key) continue;
            else{
                if(map.get(max) == map.get(key)) answer ='?';
            }
        }
        if(answer == '?'){
            System.out.println(answer);    
        }
        else{
            answer = (char)(max - 32);
            System.out.println(answer);    
        }
    }
}
