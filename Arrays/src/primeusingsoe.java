import java.util.Arrays;

public class primeusingsoe {

	public static void main(String[] args) {
		soe(25);

	}

	public static void soe(int n) {
		boolean board[] = new boolean[n + 1];

		Arrays.fill(board, true);
		board[0] = false;
		board[1] = false;

		for (int table = 2; table * table <= n; table++) {
			if (board[table] == false) {
				continue;
			}
			for (int multiplier = 2; table * multiplier <= n; table++) {
				board[table * multiplier] = false;

			}

		}
		for (int i = 0; i <= n; i++) {
			if (board[i]) {
				System.out.println(i);
			}
		}

	}

}
