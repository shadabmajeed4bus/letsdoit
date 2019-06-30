
public class mazepath {

	public static void main(String[] args) {
		mazepath(0, 0, 2, 3, "");

	}

	public static void mazepath(int sr, int sc, int endr, int endc, String ans) {
		if (sr == endr && sc == endc) {
			System.out.println(ans);
			return;
		}
		if (sr > endr || sc > endc) {
			return;
		}
		mazepath(sr + 1, sc, endr, endc, ans + "v");
		mazepath(sr, sc + 1, endr, endc, ans + "h");

	}

}
