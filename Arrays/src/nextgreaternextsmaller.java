import java.util.Scanner;

public class nextgreaternextsmaller {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int to=sc.nextInt();
			int arr[]=new int[to];
			for(int k=0;k<to;k++) {arr[k]=sc.nextInt();}
			for(int j=0;j<to;j++)
			{
				int index=nextgreater(arr,j);
				
				int ans=nextsmaller(arr,index);
				if(ans!=-1) {System.out.print(arr[ans]+" ");}
				else {System.out.print(ans+" ");}
				
				
			}
			
			System.out.println();
			
			
			
			
			
		}

	}public static int nextgreater(int arr[],int n)
	{if(n==arr.length-1) {return -1;}
		for(int i=n+1;i<arr.length;i++)
		{
			if(arr[i]>arr[n]) {return i;}
			
		}
		return -1;
		
	}
	public static int nextsmaller(int arr[],int n)
	{if(n==arr.length-1) {return -1;}
	if(n==-1) {return -1;}
		for(int i=n+1;i<arr.length;i++)
		{
			if(arr[i]<arr[n]) {return i;}
			
		}
		return -1;
		
	}


}
