import java.util.Scanner;

public class Recursiontruearray {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arrayreturn( arr,1));
	}
	

	public static boolean arrayreturn(int arr[],int n) {
	if(arr[n]<arr[n-1]){return false;}
	if(n==arr.length-1){return true;}
	boolean b;
	{
		
	 b= arrayreturn(arr, n+1);
		
		
	}return b;

}
}
