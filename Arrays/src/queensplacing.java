
public class queensplacing {

	public static void main(String[] args) {
		queen(new boolean[4], 2, 0, "");

	}

	public static void queen(boolean[] board, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queen(board, tq, qpsf + 1, ans + i);

				board[i] = false;
			}

		}

	}

}
