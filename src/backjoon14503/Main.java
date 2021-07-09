package backjoon14503;
import java.io.*;
import java.util.*;

public class Main {
	static int N,M,dir,board[][];
	static Cell robot;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine()," ");
		robot=new Cell(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		
		/*
		 * 로봇 청소기가 바라보는 방향
		 * 0인 경우에는 북쪽
		 * 1인 경우에는 동쪽
		 * 2인 경우에는 남쪽
		 * 3인 경우에는 서쪽
		 * */
		dir=Integer.parseInt(st.nextToken());
		
		board=new int[N][M];
		int i,j;
		for(i=0; i<N; i++) {
			Integer.parseInt(st.nextToken());
			for(j=0; j<M;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
	}
	
	static class Cell{
		int x,y;
		Cell(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}
