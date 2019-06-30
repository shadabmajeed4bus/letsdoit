
public class consecutivehead {

	public static void main(String[] args) {
		coin(3, "");
	}

	public static void coin(int que, String ans) {
		if (que == 0) {
			System.out.println(ans);
			return;

		}
		if (ans.length() == 0) {
			coin(que - 1, ans + "h");
			coin(que - 1, ans + "t");
		}

		else if ( ans.length() > 0 && ans.charAt(ans.length() - 1) == 't') {
			coin(que - 1, ans + "h");
			coin(que - 1, ans + "t");
		} else {
			coin(que - 1, ans + "t");
		}
	}

}
