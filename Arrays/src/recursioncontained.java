import java.util.Scanner;

public class recursioncontained {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
int item=sc.nextInt();
	}public static boolean contains(int arr[],int n,int item)
	{
		boolean b;
		if(arr[n]==item) {return true;}
		if(n==arr.length-1) {return false;}
		b=contains(arr,n+1,item);
		
		return b;
		
	}

}
