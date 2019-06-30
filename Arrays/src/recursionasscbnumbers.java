import java.util.*;
public class recursionasscbnumbers {static Scanner sc=new Scanner(System.in);static int count=0;

	public static void main(String[] args) {
		
		int n=sc.nextInt();
		String str=sc.next();
		subss(str);
     System.out.println(count);
	} 
	
	public static boolean iscb(int n)
	{
		int arr[]= {2,3,5,7,11,13,17,19,23,29};
		int count=0;
		if(n==0||n==1) {return false;}
		else {
			for(int i=0;i<arr.length;i++)
			{if(n==arr[i]) {return true;}}
			
			for(int i=0;i<arr.length;i++)
			{
				if(n%arr[i]==0) {return false;}
				
				
			}
			
			
			
			
			
		}return true;
		
	}
	public static void subss(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{int n=Integer.parseInt(str.substring(i,j+1));
			
			if(iscb(n)==true) {count++;i=j;}
			
			
			
			
			}
			
			
			
		}
		
		
		
	}

}
