
public class sudoku {
	static int count = 0;

	public static void main(String[] args) {

		int[][] board = new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		sudoku(board, 0, 0);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}

	}

	public static void sudoku(int board[][], int row, int col) {
		if (col == board[0].length) {
			row = row + 1;
			col = 0;
			// return;
		}
		if (row == board.length) {
			display(board);
			return;
		}

		if (board[row][col] != 0) {
			sudoku(board, row, col + 1);
			return;
		}

		for (int i = 1; i <= 9; i++) {
			if (issafe(board, row, col, i) == true) {
				board[row][col] = i;
				sudoku(board, row, col + 1);
				board[row][col] = 0;
				count++;
			}

		}

	}

	public static boolean issafe(int[][] board, int row, int col, int item) {
		int i = 0;
		for (i = 0; i < board.length; i++) {
			if (board[i][col] == item) {
				return false;
			}

		}
		for (i = 0; i < board[0].length; i++) {
			if (board[row][i] == item) {
				return false;
			}

		}
		int strow = row - row % 3;
		int stcol = col - col % 3;
		for (i = strow; i < strow + 3; i++) {
			for (int j = stcol; j < stcol + 3; j++) {
				if (board[i][j] == item)
					return false;
			}

		}
		return true;
	}

}
