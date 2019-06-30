import java.util.Scanner;

public class recurassmazepath {static int count=0;static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		mazepath(0,0,"",n1-1,n2-1);
		System.out.print("\n"+count);
	}public static void mazepath(int row,int col,String ans,int er,int ec)
	{ if(row>er||col>ec) {return;}
		if(row==er&&col==ec) {System.out.print(ans+" ");count++;}
		
		
		mazepath(row+1,col,ans+"V",er,ec);
		mazepath(row,col+1,ans+"H",er,ec);
		mazepath(row+1,col+1,ans+"D",er,ec);
		
		
		
		
		
	}

}
