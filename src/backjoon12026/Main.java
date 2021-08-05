package backjoon12026;
import java.io.*;
//import java.util.*;
public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		char street[]=br.readLine().toCharArray(),boj[]= {'B','O','J'};
		int dp[]=new int[N],idx=0,i,cnt=1;//idx/3을 boj의 index로 사용
		
		dp[0]=0;
		idx=1;
		for(i=1; i<N; i++) {
			if(i==N-1 && boj[idx%3]!=street[i]) {
				System.out.println(-1);
				System.exit(0);
			}
			if(boj[idx%3]==street[i]) {
				idx++;
				dp[i]=dp[i-1]+(cnt*cnt);
				cnt=0;
			}
			else {
				dp[i]=dp[i-1];
			}
			cnt++;
		}
		System.out.println(dp[N-1]);
	}

}
