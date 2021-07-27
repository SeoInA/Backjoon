package backjoon2615;

import java.io.*;
import java.util.StringTokenizer;

class Cell{
	int color;
	int x,y;
	public Cell(int color,int x,int y){
		this.color=color;
		this.x=x;
		this.y=y;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		//검은 바둑알은 1, 흰 바둑알은 2, 알이 놓이지 않는 자리는 0
		//첫 줄에 승부가 결정되지 않았다면 0, 검은 색이 이기면 1, 흰 색이 이기면 2를 출력한다.
		// 이기게 된 5개의 바둑알 중 가장 왼쪽에 있는 바둑알(연속된 다섯 개의 바둑알이 세로로 놓인 경우, 그 중 가장 위에 있는 것)의 가로줄 번호와, 세로줄 번호를 순서대로 출력
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=19,i,j;
		int board[][]=new int[n+1][n+1];
		
		//이차배열에 보드 판 입력
		for(i=1; i<=n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			for(j=1; j<=n; j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}

		Cell first;//첫번째 바둑알
		int cnt=0,z,x,y;//연속으로 몇 개의 알을 놓았는지
		int dir[][]= {{-1,1},{0,1},{1,1},{1,0}};//상우,중우(오른쪽),하우,아래쪽
		//game start
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(board[i][j]!=0){//흰 바둑알이나 검은 바둑알의 경우
					first=new Cell(board[i][j],i,j);//첫번째 바둑알 기록
					for(z=0; z<dir.length;z++) {//갈 수 있는 곳 탐색
						x=first.x;
						y=first.y;
						
						if(x-dir[z][0]<=n&&x-dir[z][0]>=1&&y-dir[z][1]<=n&&y-dir[z][1]>=1) {
							if(board[x-dir[z][0]][y-dir[z][1]]==first.color)
								continue;
						}
						//해당 바둑알로부터 5개의 바둑알이 일직선에 있는지 확인
						cnt=1;
						while(cnt<=6) {
							x+=dir[z][0];//탐색할 위치 :x
							y+=dir[z][1];//탐색할 위치 :y
							
							if(x>n || x<1 || y>n || y<1)
								break;//범위를 넘으면 다음으로 넘어가기
							
							if(board[x][y]!=first.color) {
								break;
							}
							
							cnt++;
						}
						//cnt가 6일 경우는 일직선으로 같은 알이 6개 이상 있는 경우라 이긴 것이 아님
						if(cnt==5) {//게임이 끝났음!
							System.out.println(first.color);
							System.out.println(first.x+" "+first.y);
							System.exit(0);
						}
					}//검은색 바둑알 또는 흰색 바둑알 발견을 기준으로 일직선에 5개의 같은 알이 있는 지 확인함
					
				}//흰색 또는 검은색 바둑알 발견했을 때 반복문
			}//가로줄 탐색
		}//세로줄 탐색

		System.out.println(0);//승부가 결졍나지 않았음
	}

}