import java.util.Scanner;

public class recassdiceladder {static int count=0;static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
		int m=sc.nextInt();
ladder(n,m,0,"");
System.out.print("\n"+count);
	}public static void ladder(int n,int m,int row,String ans)
	{if(row>n) {return;}
	if(row==n) {System.out.print(ans+" ");count++;}
		for(int i=1;i<=m;i++)
		{
			
			
			ladder(n,m,row+i,ans+i);
			
			
		}
		
		
		
	}

}
