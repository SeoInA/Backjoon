package backjoon6996;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String []args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),i;
		StringTokenizer st;
		String one,two;
		char [] arr1,arr2;
		for(i=0; i<T; i++) {
			st=new StringTokenizer(br.readLine()," ");
			one=st.nextToken();
			two=st.nextToken();
			arr1=one.toCharArray();
			arr2=two.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
				System.out.println(one+" & "+two+" are anagrams.");
			else
				System.out.println(one+" & "+two+" are NOT anagrams.");
		}
	}
}
