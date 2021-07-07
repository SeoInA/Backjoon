package backjoon1449;
import java.util.*;
import java.io.*;

public class Main {
	static int N,L,hole[],count=1;
	public static void main(String []args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());//구멍 개수
		L=Integer.parseInt(st.nextToken());//테이프의 길이
		
		int i;
		hole=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(i=0; i<N; i++)
			hole[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(hole);
		
		taping();
		
		System.out.println(count);
	}
	
	static void taping() {
		int i,idx=hole[0];
		for(i=1; i<N; i++) {
			 if(hole[i] - idx +1  > L) {
				 count++;
				 idx=hole[i];
			 }
		}
	}
}
