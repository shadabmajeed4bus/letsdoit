import java.util.Scanner;

public class Binsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long arr[]=new long[n];
		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextLong();}
		long m=sc.nextLong();
		System.out.println(binsearch(arr,m));

	}public static int binsearch(long arr[],long m)
	{
		int lo=0;
		int hi=arr.length-1;
		while(lo>hi)
		{int mid=(lo+hi)/2;
			if(m>arr[mid]) {lo=mid+1;}
			else if(m<arr[mid]) {hi=mid-1;}
			else return mid;
		}
		return -1;
		
		
	}

}
