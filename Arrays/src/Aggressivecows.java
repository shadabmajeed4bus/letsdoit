import java.util.Scanner;

public class Aggressivecows {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int stalls=sc.nextInt();
		int cows=sc.nextInt();
		int ans=0;
		int arr[]=new int[stalls];
		for(int i=0;i<stalls;i++)
		{
			
			
			arr[i]=sc.nextInt();
			
		}
		Bubblesort(arr);
		
		int lo=arr[0];
		int hi=arr[arr.length-1];
		while(lo<hi)
		{
			int mid=(lo+hi)/2;
			if(ispossible(mid,arr,cows)==true) {ans=mid;lo=mid+1;};
			if(ispossible(mid,arr,cows)==false) {hi=mid-1;}
			
			
		}
		
		
		
		System.out.println(ans);
		
		
		
		
	}	public static void Bubblesort(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}

			}

		}

	}public static int binarysearch(int arr[], int item) {
		int lo = 0, hi = arr.length-1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] > item) {
				hi = mid - 1;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}public static boolean ispossible(int dis,int arr[],int cows)
	{
		int count=1;
		int sum=0;
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]-x>=dis) {count++;sum=0;x=arr[i];}
			
			
		}
		if(count>=cows) {return true;}
		else {return false;}
		
	}

}
