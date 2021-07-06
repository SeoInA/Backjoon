package backjoon17086;
import java.io.*;
import java.util.*;

public class Main {
	static int N,M,max=-1;
	static int board[][],visit[][];
	static Queue<Cell> q=new LinkedList<>();
	public static void main(String[]args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		board=new int[N][M];
		visit=new int[N][M];
		int i,j;
		for(i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(j=0; j<M; j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
				visit[i][j]=Integer.MAX_VALUE;
				if(board[i][j]==1) {
					q.add(new Cell(i,j));
					visit[i][j]=0;
				}
			}
		}
		
		System.out.println(distance());
	}
	
	static int distance() {
		int max=0,i,j;
		
		while(!q.isEmpty()) {
			Cell node=q.poll();
			
			for(i=-1;i<=1;i++) {
				for(j=-1;j<=1;j++) {
					if(i==0&&j==0) 
						continue;
					if(node.x+i<0||node.x+i>=N||node.y+j<0||node.y+j>=M)
						continue;
					
					int x=node.x+i;
					int y=node.y+j;
					
					if(visit[x][y] > visit[node.x][node.y]+1) {
						visit[x][y] = visit[node.x][node.y]+1;
						q.add(new Cell(x,y));
						max = Math.max(visit[x][y], max);
					}
					
				}
			}
		}
		
		return max;
	}
	
	static class Cell{
		int x,y;
		int count;
		Cell(int x, int y){
			this.x=x;
			this.y=y;
		}
	
	}
}