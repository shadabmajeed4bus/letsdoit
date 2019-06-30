											import java.util.Scanner;

public class recursionasssplitarray {static int counter=0;static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int k=0;k<arr.length;k++) {arr[k]=sc.nextInt();sum=sum+arr[k];}
		int brr[]=new int[2*n];
		for(int i=0;i<brr.length;i++) {brr[i]=arr[i%arr.length];}
		
		splitarray(arr,0,sum,"",0,"");
		System.out.println(counter);

	}public static void splitarray(int arr[],int st,int end,String ans,int idx,String ans2)
	{
	if(st==end) {String k="";for(int s=idx;s<arr.length;s++){k=k+arr[s]+" ";}System.out.println(ans+"and "+ans2+k);counter++;return;
	
	
	
	
	
	}
	if(idx==arr.length) {return;}
	for(int i=idx;i<arr.length;i++)
	{String k="";for(int s=idx;s<i;s++) {k=k+arr[s]+" ";}
		splitarray(arr,st+arr[i],end-arr[i],ans+arr[i]+" ",i+1,ans2+k);
	}
	
		
		
		
		
		
	}
}
