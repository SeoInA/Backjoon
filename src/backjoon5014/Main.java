package backjoon5014;
import java.io.*;
import java.util.*;

public class Main {
	static int F,S,G,U,D;//F:총 층 S:강호가 있는 곳 G:사무실 U:up D:down
	static int[] visited;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		F=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		G=Integer.parseInt(st.nextToken());
		U=Integer.parseInt(st.nextToken());
		D=Integer.parseInt(st.nextToken());
		
		visited = new int[10000001];
		bfs();
	}
	
	static void bfs() {
		Queue<Integer>q=new LinkedList<>();
		Set<Integer> check=new HashSet<>();
		q.add(S);
		visited[S] = 0;
		check.add(S);
		int floor;
		while(!q.isEmpty()) {
			floor = q.poll();
			
            if(floor==G){
            	System.out.println(visited[floor]);
            	return;
            }
            
			if(floor+U<=F&& !check.contains(floor+U)) {
				visited[floor+U]=visited[floor]+1;
				q.add(floor+U);
				check.add(floor+U);
			}
			if(floor-D>0&& !check.contains(floor-D)) {
				visited[floor-D]=visited[floor]+1;
				q.add(floor-D);
				check.add(floor-D);
			}
       
		}
		System.out.println("use the stairs");
	}
}
