package backjoon4096;
import java.io.*;
import java.util.*;
public class Main {
	static int cnt;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input,reverse;
		StringBuilder result=new StringBuilder();
		while(true) {
			input=br.readLine();
			if(input.equals("0"))
				break;
			StringBuffer sb=new StringBuffer(input);
			reverse=sb.reverse().toString();
			cnt=0;
			if(input.contentEquals(reverse))
				result.append(0+"\n");
			else {
				palindrome(input);
				result.append(cnt+"\n");
			}
		}
		System.out.println(result);
	}
	
	public static void palindrome(String str) {
		String reverse;
		int len=str.length();
		StringBuffer sb;
		
		str=String.format("%0"+len+"d", Integer.parseInt(str)+1);
		cnt++;
		sb=new StringBuffer(str);
		reverse=sb.reverse().toString();
			
		if(str.equals(reverse))
			return;
		else
			palindrome(str);
			
		
	}
}
