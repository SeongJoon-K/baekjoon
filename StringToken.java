import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String str = "잡초뽑다! ! 기절 jobcho!6320 아아";
        StringTokenizer st = new StringTokenizer(str, "!");

        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

        System.out.println(st.countTokens());

    }
    
}
