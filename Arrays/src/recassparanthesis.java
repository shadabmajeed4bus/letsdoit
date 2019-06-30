import java.util.Scanner;

public class recassparanthesis {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
		para(0,0,n,"");

	}public static void para(int op,int clo,int n,String ans)
	{if(op==clo&&op==n&&clo==n) {System.out.println(ans);}
		if(clo>op||op>n||clo>n) {return ;}
		
		
		para(op,clo+1,n,ans+")");
		
		para(op+1,clo,n,ans+"(");
		
		
		
		
	}

}
