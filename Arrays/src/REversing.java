import java.util.Scanner;

public class REversing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n],temp=0;
		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}int j=arr.length-1;
		int mid=(0+arr.length-2)/2;
		for(int i=0;i<=mid;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			
			
		}
		for(int val:arr) {System.out.println(val);}

	}

}
