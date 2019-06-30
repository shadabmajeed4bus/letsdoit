import java.util.Scanner;

public class recassmazepath2d {static int count=0;static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n1=sc.nextInt();
		
		mazepath(1,1,"",n1,n1);
		System.out.print("\n"+count);
	}
	
	
	public static void mazepath(int row,int col,String ans,int er,int ec)
	{ if(row>er||col>ec) {return;}
		if(row==er&&col==ec) {System.out.print(ans+" ");count++;}
		
		
		mazepath(row+1,col,ans+"V",er,ec);
		mazepath(row,col+1,ans+"H",er,ec);
		if(row==col||row+col==er+1)
		{mazepath(row+1,col+1,ans+"D",er,ec);}
		
		
		
		
		
	}

}
