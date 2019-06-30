
public class queenplacing2d {

	public static void main(String[] args) {
	queen2d(new boolean[4][2],2,0,0,0,"");
		

	}public static void queen2d(boolean board [][], int tq, int qpsf, int row,int col,String ans) {
		if(row==board.length) {return;}
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
	if(col==board[0].length) {row=row+1;col=0;}
				queen2d(board, tq, qpsf + 1,row,col+1, ans + row+col+" ");
				queen2d(board, tq, qpsf,row,col+1, ans);

				
			}


}
