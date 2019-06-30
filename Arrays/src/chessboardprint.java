
public class chessboardprint {

	public static void main(String[] args) {
		board(0, 10, "");

	}

	public static void board(int st, int end, String ans) {
		if (st == end) {
			System.out.println(ans);
			return;
		}
		if (st > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			board(st + dice, end, ans + dice);
		}

	}

}
