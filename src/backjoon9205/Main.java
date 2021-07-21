package backjoon9205;
import java.io.*;
import java.util.*;

public class Main {
	static Node man,festival;
	static ArrayList<Node> mart=new ArrayList<>();
	static final int INF=Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,martN;
		int T=Integer.parseInt(br.readLine());
		for(i=0; i<T; i++) {
			martN =Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			man=new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			
			for(j=0; j<martN;j++) {
				st=new StringTokenizer(br.readLine()," ");
				mart.add(new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
			}
			
			st=new StringTokenizer(br.readLine()," ");
			festival=new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		int dist = Math.abs(man.x-festival.x) + Math.abs(man.y-festival.y);
	}
	
	static class Node{
		int x,y;
		Node(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
}
