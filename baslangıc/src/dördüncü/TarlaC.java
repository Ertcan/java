package d�rd�nc�;
import java.util.Scanner;
import java.util.Random;

public class TarlaC {
int rownumber,colnumber,size;
Scanner scan = new Scanner(System.in);
int[][] map;
boolean game =true;
int[][] board;
Random Rand = new Random();
TarlaC(int rownumber,int colnumber){
	this.rownumber=rownumber;
	this.colnumber=colnumber;
	this.size=rownumber*colnumber;
	this.map=new int[rownumber][colnumber];
	this.board=new int[rownumber][colnumber];
}
public void run(){
	int row , col,sucsess=0;
	preparegame();
	print(map);
	System.out.println("!!!Oyun Ba�lad�!!!");
	while(game) {
		print(board);
		System.out.println("Sat�r : ");
		row = scan.nextInt();
		if(row>rownumber) {
			System.out.println("Hatal� giri� tekrar deneyin.");
			System.out.println("Sat�r : ");
			row = scan.nextInt();
			if(row>rownumber) {
				System.out.println("Haritan�n d���na ��kt�n�z , �ld�n�z.");
				break;
			}
		}
		System.out.println("S�tun : ");
		col = scan.nextInt();
		if(col>colnumber) {
			System.out.println("Hatal� giri� tekrar deneyin.");
			System.out.println("S�tun : ");
			col = scan.nextInt();
			if(col>colnumber) {
				
				System.out.println("Haritan�n d���na ��kt�n�z , �ld�n�z.");
				break;
			}
		}
		if(map[row][col]!=-1) {
			check(row,col);
			sucsess++;
			if(sucsess==(size-(size/4))) {
				System.out.println("!!!BA�ARDINIZ H��B�R MAYINA BASMADAN OYUNU B�T�RD�N�Z!!!");
				break;
			}
		}else {
			game = false;
			System.out.println("!!!May�na Bast�n�z!!!");
		}
	}
	
}
public void check(int r, int c) {
	if(map[r][c]==0) {
		if((c<colnumber-1)&&(map[r][c+1]==-1)) {
			board[r][c]++;
		}
		if((r<rownumber-1)&&(map[r+1][c]==-1)) {
			board[r][c]++;
		}
		if((c>0)&&(map[r][c-1]==-1)) {
			board[r][c]++;
		}
		if((r>0)&&(map[r-1][c]==-1)) {
			board[r][c]++;
		}
		//if((c<colnumber)&&(r<rownumber)&&(map[r+1][c+1]==-1)) {
			//board[r][c]++;
		//}
		//if((c>0)&&(r<rownumber)&&(map[r+1][c-1]==-1)) {
			//board[r][c]++;
		//}
		//if((c>0)&&(r>0)&&(map[r-1][c-1]==-1)) {
			//board[r][c]++;
		//}
	//	if((c<colnumber)&&(r>0)&&(map[r-1][c+1]==-1)) {
			//board[r][c]++;
		//}
		if(board[r][c]==0) {
		board[r][c]=-2;
		}
		}
}
private void preparegame() {
	int randrow , randcol, count=0;
	while(count != (size/4)) {
		randrow=Rand.nextInt(rownumber);
		randcol=Rand.nextInt(colnumber);
		if(map[randrow][randcol]!=-1) {
			map[randrow][randcol]=-1;
			count++;
		}
	}
}
public void print(int[][] arr) {
	for(int i = 0; i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]>=0) {
				System.out.print(" ");
			}
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
