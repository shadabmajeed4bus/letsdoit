import java.util.Scanner;

public class nknightass {static Scanner sc = new Scanner(System.in);
static int count = 0;
public static void main(String[] args) {
	
	
	int n=sc.nextInt();
	boolean b[][]=new boolean[n][n];
	nknight(b,n,0,0,0,"");
	System.out.println("\n"+count);
	
	
	
}
public static boolean isvalid(boolean[][] board, int row, int col) {
	int ro = row - 1;
	int co = col;
//2horizontal one ver
	
	if(((row-1>=0&&col-2>=0)&&board[row-1][col-2]==true)||((row-1>=0&&col+2<board[0].length)&&board[row-1][col+2]==true)) {return false;}
	//i horizontal 2 vertical
	if(((row-2>=0&&col-1>=0)&&board[row-2][col-1]==true)||((row-2>=0&&col+1<board[0].length)&&board[row-2][col+1]==true)) {return false;}

	return true;

}
public static void nknight(boolean b[][], int tot, int qpsf, int row, int col, String ans) {
	

	if (qpsf== tot) {
		System.out.print(ans+" ");
		count++;
		return;
	}
	if (col == b[0].length) {
		row = row + 1;
		col = 0;
	}
	if (row == b.length) {
		return;
	}

	if (isvalid(b, row, col)) {
		b[row][col] = true;
		
		nknight(b,tot,qpsf+1, row, col + 1, ans + "{" + (row) + "-" +(col) + "}" + " ");
		b[row][col] = false;
	} 
		nknight(b, tot,qpsf,row, col + 1, ans);
	

}

}


