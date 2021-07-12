package backjoon15665;
import java.io.*;
import java.util.*;
public class Main {
	static int N,M,arr[],result[];
	static Set<String> set=new LinkedHashSet<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		int i;
		arr=new int[N];
		result=new int[M];
		st=new StringTokenizer(br.readLine()," ");
		for(i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		printResult(0);
		StringBuilder sb = new StringBuilder(); 
		set.stream().forEach(x->sb.append(x)); 
		System.out.print(sb);

	}
	static void printResult(int depth) {
		if(depth==M) {
			String str="";
			for(int x:result)
				str+=(x+" ");
			set.add(str+"\n");
			return;
		}
		int i;
		for(i=0; i<N;i++) {
			result[depth]=arr[i];
			printResult(depth+1);
		}
	}
}
