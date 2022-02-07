import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boot_207{
   public static ArrayList<ArrayList<Integer>> map;
   public static int N;
   public static int M;
   public static int start;
   public static boolean[] dfs_ch;
   public static boolean[] bfs_ch;
   public static Queue<Integer> q;
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       st = new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       start = Integer.parseInt(st.nextToken());
       map = new ArrayList<ArrayList<Integer>>();
       dfs_ch = new boolean[N+1];
       bfs_ch = new boolean[N+1];
       q = new LinkedList<>();
       for(int i = 0; i <= N; i++) {
          map.add(new ArrayList<Integer>());
       }
       for(int i = 0; i < M; i++) {
          st = new StringTokenizer(br.readLine());
          int p = Integer.parseInt(st.nextToken());
          int q = Integer.parseInt(st.nextToken());
          map.get(p).add(q);
          map.get(q).add(p);
       }
       dfs(start);
       System.out.println();
       bfs(start);
    }
    public static void dfs(int start) {
       if(dfs_ch[start] == false) {
          dfs_ch[start] = true;
          System.out.print(start+" ");
          map.get(start).sort(Comparator.naturalOrder());
          for(int i : map.get(start)) {
             if(dfs_ch[i] == false) {
                dfs(i);
             }
          }
       }
    }
    public static void bfs(int start) {
       if(bfs_ch[start]== false) {
          q.offer(start);
          bfs_ch[start] = true;
          map.get(start).sort(Comparator.naturalOrder());
          while(!q.isEmpty()) {
             int y = q.poll();
             System.out.print(y+" ");
             for(int i: map.get(y)) {
                if(bfs_ch[i] == false) {
                   bfs_ch[i] = true;
                   q.offer(i);
                }
             }
          }
       }
    }
}