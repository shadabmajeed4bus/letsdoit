import java.util.Scanner;

public class chessboardproblemass {static Scanner sc = new Scanner(System.in);static int count=0;

	public static void main(String[] args) {
		
		int n=sc.nextInt();
		chessboard(n-1,n-1,0,0,"{0-0}");
		System.out.println("\n"+count);
		
	}
public static void chessboard(int er,int ec,int sr,int sc,String ans)
{if(sr==er&&sc==ec) {count++;System.out.print(ans+" ");}
	if(sc>=ec+1) {return;}
	if(sr>=er+1) {return;}
	
	
	
	
	
	
	chessboard(er,ec,sr+2,sc+1,ans+"K"+"{"+(sr+2)+"-"+(sc+1)+"}");
	chessboard(er,ec,sr+1,sc+2,ans+"K"+"{"+(sr+1)+"-"+(sc+2)+"}");
	
	
	if(sr==0||sr==ec||sc==0||sc==ec)
	{
		for(int i=1;i<=ec;i++)
		{
		chessboard(er,ec,sr,sc+i,ans+"R"+"{"+sr+"-"+(sc+i)+"}");
		
		}
		for(int i=1;i<=ec;i++)
		{
			chessboard(er,ec,sr+i,sc,ans+"R"+"{"+(sr+i)+"-"+sc+"}");
		}
		
	}
	if(sr==sc||sr+sc==er)
	{
		

		for(int i=1;i<=er;i++)
		{chessboard(er,ec,sr+i,sc+i,ans+"B"+"{"+(sr+i)+"-"+(sc+i)+"}");
		
		
		}
		
		
		
		
	}









}
}
