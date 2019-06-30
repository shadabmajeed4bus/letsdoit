import java.util.*;
public class toggle {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(toggle(str));
		
	}public static String toggle(String str)
	{String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<='z'&&str.charAt(i)>='a') {ans=ans+(char)((int)str.charAt(i)-32);}
			if(str.charAt(i)<='Z'&&str.charAt(i)>='A') {ans=ans+(char)((int)str.charAt(i)+32);}
			
		}
		return ans;
		
	}

}
