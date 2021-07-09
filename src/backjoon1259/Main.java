package backjoon1259;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String []args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder print=new StringBuilder();
		String input=br.readLine();
		String reverse="";
		while(!input.equals("0")) {
			StringBuffer sb=new StringBuffer(input);
			reverse=sb.reverse().toString();
			if(input.equals(reverse))
				print.append("yes\n");
			else
				print.append("no\n");
			
			input=br.readLine();
		}
		
		System.out.println(print);
	}
}
