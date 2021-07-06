package backjoon1110;
import java.io.*;
public class Main {
	static int N,count=0;
	public static void main(String []args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		plusNum(N);
		System.out.println(count);
	}
	
	static void plusNum(int n) {
		count++;
		String num="";
		if(n<10)
			num="0"+Integer.toString(n);
		else
			num=Integer.toString(n);
		
		int sum=Character.getNumericValue(num.charAt(0))+Character.getNumericValue(num.charAt(1));
		
		String newNum="";
		if(sum<10)
			newNum="0"+Integer.toString(sum);
		else
			newNum=Integer.toString(sum);
		
		String merge=Character.toString(num.charAt(1))+Character.toString(newNum.charAt(1));
		int newN=Integer.parseInt(merge);
		
		if(newN==N)
			return;
		else
			plusNum(newN);
	}
}
