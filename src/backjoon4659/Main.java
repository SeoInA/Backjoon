package backjoon4659;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input;
		while(true) {
			input=br.readLine();
			if(input.equals("end")) {
				break;
			}

			if(password(input))
				System.out.println("<"+input+"> is acceptable.");
			else
				System.out.println("<"+input+"> is not acceptable.");
		}
	}
	
	static boolean password(String str) {
		boolean aeiou=false;
		
		String consonant="aeiou";//모음
		int con=0,vow=0,i;
		
		char paste='0';
		for(i=0; i<str.length();i++) {
			if(consonant.contains(Character.toString(str.charAt(i)))) {//모음이면
				aeiou=true;
				con++;
				vow=0;
			}
			else {
				vow++;
				con=0;
			}
			if(con>=3||vow>=3)
				return false;
			
			if(paste==str.charAt(i))
				if(paste!='e'&&paste!='o')
					return false;
				
			paste=str.charAt(i);
		}
		
		if(!aeiou)
			return false;
		return true;
	}
}
