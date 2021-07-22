package backjoon11725;
import java.io.*;
import java.util.*;
public class Main {
	static ArrayList<Integer> [] graph;
	static int arr[];
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()),i;
		int one,two;
		graph=new ArrayList[N+1];
		
		arr=new int[N+1];
		arr[1]=100;
		for(i=1; i<=N;i++) {
			graph[i]=new ArrayList<>();
		}
		for(i=0; i<N-1; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			one=Integer.parseInt(st.nextToken());
			two=Integer.parseInt(st.nextToken());
			
			graph[one].add(two);
			graph[two].add(one);
		}
		bfs();
		for(i=2; i<=N; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void bfs() {
		Queue<Integer>q=new LinkedList<>();
		q.add(1);
		int num,i;
		while(!q.isEmpty()) {
			num=q.poll();
			for(i=0; i<graph[num].size();i++) {
				if(arr[graph[num].get(i)]!=0)
					continue;
				arr[graph[num].get(i)]=num;
				q.add(graph[num].get(i));
			}
			
		}
	}
}
