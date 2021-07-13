package backjoon11655;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char []arr=br.readLine().toCharArray();
		int i;
		
		for(i=0; i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				arr[i]=(char)(arr[i]+13);
				if(arr[i]>90) {
					arr[i]=(char)(65+(arr[i]-91));
				}
			}
			else if(arr[i]>=97 && arr[i]<=122) {
				arr[i]=(char)(arr[i]+13);
				if(arr[i]>122) {
					arr[i]=(char)(97+(arr[i]-123));
				}
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
}
