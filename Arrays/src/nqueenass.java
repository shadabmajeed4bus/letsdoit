import java.util.Scanner;

public class nqueenass {
	static Scanner sc = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {
		int n = sc.nextInt();
		boolean arr[][] = new boolean[n][n];
		nqueen(arr,n,0, 0, 0, "");
		System.out.println("\n"+count);

	}

	public static boolean isvalid(boolean[][] board, int row, int col) {
		int ro = row - 1;
		int co = col;

		while (ro >= 0) {
			if (board[ro][co]) {
				return false;
			}
			ro--;

		}
		ro = row;
		co = col - 1;
		while (co >= 0) {
			if (board[ro][co]) {
				return false;
			}
			co--;

		}

		co = col - 1;
		ro = row - 1;
		while (ro >= 0 && co >= 0) {
			if (board[ro][co]) {
				return false;
			}
			ro--;
			co--;
		}
		ro = row - 1;
		co = col + 1;
		while (ro >= 0 && co < board[0].length) {
			if (board[ro][co]) {
				return false;
			}
			ro--;
			co++;
		}

		return true;

	}

	public static void nqueen(boolean b[][], int tot, int qpsf, int row, int col, String ans) {
		

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
			
			nqueen(b,tot,qpsf+1, row, col + 1, ans + "{" + (row+1) + "-" +(col+1) + "}" + " ");
			b[row][col] = false;
		} 
			nqueen(b, tot,qpsf,row, col + 1, ans);
		

	}

}
