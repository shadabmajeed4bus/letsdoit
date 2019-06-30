import java.util.Scanner;

public class Stringascii {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(ascc(str));

	}public static String ascc(String str)
	{String ans="";
	for(int i=0;i<str.length();i++)
	{
		if(i%2!=0) {ans=ans+(char)((int)str.charAt(i)-1);}
		else {ans=ans+(char)((int)str.charAt(i)+1);}
		
	}
	return ans;
	
}

}
