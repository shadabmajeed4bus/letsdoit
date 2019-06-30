import java.util.Scanner;

public class recursionpalindrome {static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(palind(str,0,str.length()-1));

	}public static boolean palind(String str,int i,int j)
	{
		boolean b;
		if(str.charAt(i)!=str.charAt(j)) {return false;}
		if(i>j) {return true;}
		b=palind(str,i+1,j-1);
		return b;
		
	}

}
