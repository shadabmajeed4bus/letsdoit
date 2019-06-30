import java.util.Scanner;

public class Stringinse {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(ins(str));

	}public static String ins(String str)
	{String ans="";
	for(int i=0;i<str.length()-1;i++)
	{
		ans=ans+str.charAt(i)+((int)str.charAt(i+1)-(int)str.charAt(i));
		
	}ans=ans+str.charAt(str.length()-1);
	return ans;
	
}



}
