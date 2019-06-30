import java.util.Scanner;

public class greatestnumber {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int testcase=sc.nextInt();
		for(int t=1;t<=testcase;t++)
		{	int to=sc.nextInt();
		int arr[]=new int[to];
		for(int k=0;k<to;k++) {arr[k]=sc.nextInt();}

		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{int temp=-1;
				if(issmaller(j,j+1,arr)==1)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			
			}String ans="";for(int i=0;i<arr.length;i++) {ans=ans+arr[i];}
		    System.out.println(ans);
		
		}
		
		
		
		
		
		
		
		
	}
	
	public static int issmaller(int i,int j,int arr[])
	{
		String s1=Integer.toString(arr[i]);
		String s2=Integer.toString(arr[j]);
		if(Integer.parseInt(s2+s1)>Integer.parseInt(s1+s2)) {return 1;}
		else return -1;

		
	}


}
