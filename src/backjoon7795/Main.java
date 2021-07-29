package backjoon7795;
import java.io.*;
import java.util.*;
public class Main {
	static int N,M;
	static Integer A[],B[];
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),i,j;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		for(i=0; i<T; i++) {
			st=new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			A=new Integer[N];
			B=new Integer[M];
			
			st=new StringTokenizer(br.readLine()," ");
			for(j=0; j<N; j++)
				A[j]=Integer.parseInt(st.nextToken());
			Arrays.sort(A);
			st=new StringTokenizer(br.readLine()," ");
			for(j=0; j<M; j++)
				B[j]=Integer.parseInt(st.nextToken());
			Arrays.sort(B);
			
			sb.append(feed()+"\n");
		}
		System.out.println(sb);
	}
	
	static int feed() {
		int cnt=0,mid=0,i;
		for(i=0; i<N; i++) {
			if(mid==0&&B[mid]>=A[i])
				continue;
			while(true) {
				if(mid==M)
					break;
				if(A[i]>B[mid])
					mid++;
				else
					break;
			}
			cnt+=mid;
		}
		return cnt;
	}

}
