package backjoon2160;

import java.io.*;
import java.util.*;
public class Main {
	static int N;
	static ArrayList<char[][]> board;
	static int wrongN=Integer.MAX_VALUE,front=-1,back=-1;
    public static void main(String[] args) throws Exception {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	N=Integer.parseInt(br.readLine());
    	int i,j;
    	String input="";
    	board=new ArrayList<>();
    	for(i=0; i<N;i++) {
    		char box[][]=new char[5][7];
    		for(j=0;j<5;j++) {
    			input=br.readLine();
    			box[j]=input.toCharArray();
    		}
    		board.add(box);
    	}
    	
    	bruteForce();
    	System.out.println(front+" "+back);
    }
    
    static void bruteForce() {
    	int i,j;
    	
    	for(i=0; i<N-1;i++) {
    		for(j=i+1;j<N;j++) {
    			int count=wrongNum(board.get(i),board.get(j));
    			if(count<wrongN) {
    				wrongN=count;
    				front=i+1;
    				back=j+1;
    			}
    		}
    	}
    }
    
    static int wrongNum(char [][]one,char [][]two) {
    	int count=0,i,j;
    	
    	for(i=0; i<5; i++) {
    		for(j=0; j<7;j++) {
    			if(one[i][j]!=two[i][j])
    				count++;
    		}
    	}
    	return count;
    }
}
