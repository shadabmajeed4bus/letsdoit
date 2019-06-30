import java.util.Scanner;

public class recasslixico {static int count=0;static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
lexicog(0,n);
	}
public static void lexicog(int st,int en)
		{if(st>en) {return;}
			int j=0;int i=0;
			if(st!=0)System.out.println(st);
			if(st==0) {j=i+1;}
			for(i=j;i<=9;i++)
			{
				lexicog(10*st+i,en);
				
				
			}
			
			
			
		}

	}


