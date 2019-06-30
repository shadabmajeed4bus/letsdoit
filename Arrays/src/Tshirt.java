import java.util.Scanner;

public class Tshirt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases=sc.nextInt();
		
int t=0;
		int arr[] = new int[testcases];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}for(int j=0;j<arr.length;j++)
		{for(int i=1;i<=arr[j];i++)
		{
			System.out.print(dectobin(i)+" ");
			
			
			
		}System.out.println();
		}
	}public static int dectobin(int n)
	{
		int dec = 1, ans = 0;
		while (n != 0) {
			int rem = n % 2;
			ans = ans + rem * dec;
			
		dec=dec*10;	n = n / 2;

		}return(ans);
		
		
		
		
		
	}

}
