
public class nqueen {

	public static void main(String[] args) {
		nqueen(new boolean[4][4], 4, 0, 0, 0, "");

	}

	public static void nqueen(boolean board[][], int tq, int qpsf, int row, int col, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}

		if (row == board.length) {
			return;
		}
		if (isvalid(board, row, col) == true) {
			board[row][col] = true;
			nqueen(board, tq, qpsf + 1, row, col + 1, ans + row + col + " ");
			board[row][col] = false;
		}
		nqueen(board, tq, qpsf, row, col + 1, ans);

	}

	public static boolean isvalid(boolean[][] board, int row, int col) {
		int ro = row - 1;
		int co = col;
//row
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
//leftdiagro = row - 1;
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

}
