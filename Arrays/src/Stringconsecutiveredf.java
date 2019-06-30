import java.util.Scanner;

public class Stringconsecutiveredf {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(cons(str));
	
	}public static String cons(String str)
	{String ans="";
	for(int i=0;i<str.length();i++)
	{
		if(i==0) {ans=ans+str.charAt(i);}
		else if(str.charAt(i)!=str.charAt(i-1)) {ans=ans+str.charAt(i);}
	}
	return ans;
	
}

}
