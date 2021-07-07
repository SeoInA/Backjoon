package backjoon1145;
import java.io.*;
import java.util.*;

public class Main {
	static int min=Integer.MAX_VALUE,num[];
	public static void main(String []args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int i,j,z;
		num=new int[5];
		for(i=0; i<5; i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);

		int gcd1,gcd2,result1,result2;
		for(i=0; i<3;i++) {
			for(j=i+1;j<4;j++) {
				gcd1=gcd(num[j],num[i]);
				result1=(num[i]*num[j])/(gcd1);
				for(z=j+1;z<5;z++) {
					gcd2=gcd(result1,num[z]);
					result2=(result1*num[z])/(gcd2);
					
					min=Math.min(min, result2);
				}
			}
		}
		
		System.out.println(min);
	}
	
	static int gcd(int num1, int num2) {
		if(num2 == 0) 
			return num1;
        else 
        	return gcd(num2, num1 % num2);
	}
}
