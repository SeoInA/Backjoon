package backjoon11048;

import java.io.*;
import java.util.*;

public class Main {
	static int candy[][],dp[][];
	static int n,m;
	static boolean visit[][];
	public static void main(String[]args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		int i,j;
		candy=new int[n+2][m+2];
		dp=new int[n+2][m+2];
		visit=new boolean[n+1][m+1];
		
		for(i=1; i<=n; i++) {
			Arrays.fill(visit[i], false);
		}
		for(i=1; i<=n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(j=1; j<=m;j++)
				candy[i][j]=Integer.parseInt(st.nextToken());
		}
		
		manyCandy();
		System.out.println(dp[n][m]);
	}
	
	static void manyCandy() {
		int i,j;
		dp[1][1]=candy[1][1];
		for(i=1; i<=n;i++) {
			for(j=1;j<=m; j++) {
				dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+candy[i+1][j]);
				dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i][j]+candy[i+1][j+1]);
				dp[i][j+1]=Math.max(dp[i][j+1], dp[i][j]+candy[i][j+1]);
			}
		}
	}
}
class Node{
	int x,y;
	
	Node(int x,int y){
		this.x=x;
		this.y=y;
	}
}
