package backjoon2167;
import java.io.*;
import java.util.*;

public class Main {
	static int N,M,K,arr[][];
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		arr=new int[N+1][M+1];
		int i,j;
		for(i=1; i<=N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(j=1; j<=M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		K=Integer.parseInt(br.readLine());
		for(i=0; i<K;i++) {
			st=new StringTokenizer(br.readLine()," ");
			sb.append(sum(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()))+"\n");
		}
		System.out.println(sb);
	}
	
	static int sum(int i,int j,int x, int y) {
		int a,b,sum=0;
		for(a=i; a<=x;a++) {
			for(b=j; b<=y;b++) {
				sum+=arr[a][b];
			}
		}
		return sum;
	}
}
