import java.util.Scanner;

public class ratandcheese {static Scanner sc=new Scanner(System.in);static int count=0;

	public static void main(String[] args) {
		int rows=sc.nextInt();
		int col=sc.nextInt();
		char arr[][]=new char[rows][col];
		for(int i=0;i<rows;i++)
		{   String str=sc.next();
			for(int j=0;j<col;j++)
			{arr[i][j]=str.charAt(j);
			}
			
		}
	
		int brr[][]=new int[rows][col];
		rat(0,0,rows-1,col-1,arr,brr);
if(count==0) {System.out.println("NO PATH FOUND");}
	}public static void rat(int sr,int sc,int er,int ec,char arr[][],int brr[][])
	{
		if(sr==er&&sc==ec+1) {display(brr);count=count+1;return;}
		
		if(sc>ec||sr>er||sc<0||sr<0||arr[sr][sc]=='X'||brr[sr][sc]==1) {return;}
		brr[sr][sc]=1;
	 rat( sr,sc-1, er, ec, arr,brr);
	 rat( sr,sc+1, er, ec, arr,brr);
	 rat( sr-1,sc, er, ec, arr,brr);
	 rat( sr+1,sc, er, ec, arr,brr);
		brr[sr][sc]=0;
		
		
		
	}
	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}


}
