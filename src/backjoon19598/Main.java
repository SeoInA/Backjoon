package backjoon19598;

import java.io.*;
import java.util.*;

public class Main {
	static int room[][];
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken()),i,j;
		room=new int[N][2];
		for(i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			room[i][0]=Integer.parseInt(st.nextToken());
			room[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(room,new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				return o1[0]-o2[0];
			}
		});
		
		int cnt=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(i=0; i<N; i++) {
			pq.add(room[i][1]);
			if(room[i][0]>=pq.peek()) {
					pq.poll();
					continue;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
