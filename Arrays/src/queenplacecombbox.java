
public class queenplacecombbox {

	public static void main(String[] args) {
		queenbox(new boolean[4],2,0,0,"");
		

	}public static void queenbox(boolean[] board, int tq, int qpsf, int idx,String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
	if(idx==board.length) {return;}
				queenbox(board, tq, qpsf + 1,idx+1, ans + idx);
				queenbox(board, tq, qpsf,idx+1, ans);

				
			}

		

	}


