package backjoon14912;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String []args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken()),d=Integer.parseInt(st.nextToken());
		
		int i,j,cnt=0;
		
		for(i=1; i<=n; i++) {
			StringBuffer sb=new StringBuffer(Integer.toString(i));
			
			for(j=0; j<sb.length();j++) {
				if(Character.getNumericValue(sb.charAt(j))==d)
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
