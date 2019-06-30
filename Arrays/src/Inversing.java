import java.util.Scanner;

public class Inversing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}
		inverse(arr,n);

	}public static void inverse(int arr[],int n)
	{
		
		int brr[]=new int[n];
		int i;
		for(i=0;i<arr.length;i++)
		{
			brr[arr[i]]=i;
			
			
		}
		for(int val:brr) {System.out.println(val);}
	}
		
		
		
	}

