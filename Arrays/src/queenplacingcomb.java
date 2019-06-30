
public class queenplacingcomb {

	public static void main(String[] args) {
		queen(new boolean[4], 2, 0, "");

	}

	public static void queen(boolean[] board, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		int i, j = 0;
		if (qpsf > 0) {
			j = ans.charAt(ans.length() - 1) - '0';
		}
		for (i = j; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queen(board, tq, qpsf + 1, ans + i);

				board[i] = false;
			}

		}

	}

}
