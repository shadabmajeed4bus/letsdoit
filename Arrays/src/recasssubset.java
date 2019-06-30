import java.util.Scanner;

public class recasssubset {static Scanner sc=new Scanner(System.in);static int count=0;

	public static void main(String[] args) {
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			
			arr[i]=sc.nextInt();
			
		}
		int tar=sc.nextInt();
		subset(arr,"",0,tar,0);
System.out.println("\n"+count);
	}public static void subset(int arr[],String ans,int st,int tar,int idx)
	{if(st==tar) {System.out.print(ans+"  ");count++;}
		
		if(idx==arr.length) {return;}
	if(st>tar) {return;}
	
		for(int i=idx;i<arr.length;i++)
		{
			subset(arr,ans+arr[i]+" ",st+arr[i],tar,i+1);
			
			
		}
		
		
		
		
		
	}

}
