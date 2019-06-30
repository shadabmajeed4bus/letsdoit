import java.util.*;

public class sudokuass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				arr[i][j] = sc.nextInt();

			}

		}
		sudoku(arr, 0, 0);

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

	public static void sudoku(int arr[][], int row, int col) {
		
		if (col == arr[0].length) {
			row = row + 1;
			col = 0;
		}
		if (row == arr.length ) {
			display(arr);
			return;
		}
		if ( arr[row][col] != 0) {
			sudoku(arr, row, col + 1);
		}
		for (int i = 1; i <= 9; i++) {
			if (issafe(arr, row, col, i) && arr[row][col] == 0) {
				if (arr[row][col] == 0) {
					arr[row][col] = i;
					sudoku(arr, row, col + 1);
					arr[row][col] = 0;
				}

			}

		}

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}
}
