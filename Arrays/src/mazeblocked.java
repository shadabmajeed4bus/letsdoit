
public class mazeblocked {

	public static void main(String[] args) {
		int [][] mazebloced={{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
	mazepathbl(mazebloced,0,0,3,3,"",new boolean [4][4]);

	}public static void mazepathbl(int maze[][],int sr, int sc, int endr, int endc, String ans,boolean [][]board) {
		if (sr == endr && sc == endc) {
			System.out.println(ans);
			return;
		}
		if (sr > endr || sc > endc||sr==-1||sc==-1||board[sr][sc]||maze[sr][sc]==1) {
			return;
		}
		board[sr][sc]=true;
		mazepathbl(maze,sr + 1, sc, endr, endc, ans + "d",board);
	
		mazepathbl(maze,sr, sc + 1, endr, endc, ans + "r",board);
		
		mazepathbl(maze,sr - 1, sc, endr, endc, ans + "u",board);
		
		mazepathbl(maze,sr, sc-1, endr, endc, ans + "l",board);
		board[sr][sc]=false;
	}

}
