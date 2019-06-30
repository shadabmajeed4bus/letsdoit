import java.util.Scanner;

public class recasssnakeandladder {
	static int count = 0, countprime = 1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int ccount = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i) == true) {
				ccount++;
			}

		}
		int j = 0;
		int arr[] = new int[ccount];
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) == true) {
				arr[j] = i;
				j++;

			}

		}

		ladder(n, 0, "0", arr);
		System.out.println("\n" + count);
		
	}

	public static int returnprime(int n, int arr[]) {
		int st = 0;
		int en = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[st] == n) {
				break;
			}
			if (st == en) {
				break;
			}
			st++;
			en--;
		}
		if (st < en && st < arr.length) {
			return arr[en];
		} else {
			return -1;
		}
	}

	public static boolean isPrime(int n) {
		int factors = 0, i;
		if (n == 0 || n == 1) {
			return false;
		}
		for (i = 1; i <= n; i++) {
			if (n % i == 0) // ensure that you mod n not i
				factors++;
		}

		if (factors == 2)
			return true;
		else
			return false;
	}

	public static void ladder(int n, int st, String ans, int arr[]) {
		if (st > n) {
			return;
		}
		if (st == n) {
			
			
				
				count++;
				String ans2=ans.substring(0, ans.length()-1);
				if(n>=10) { ans2=ans.substring(0, ans.length()-2);}
				System.out.print(ans2 + "END , ");
			

		
			return;
		}

		if (!isPrime(st)||isPrime(st)&&returnprime(st, arr) == -1) {
			for (int i = 1; i <= 6; i++) {
				
				ladder(n, st + i, ans+" "+(st+i), arr);
			}
		} else {
			if (returnprime(st, arr) != -1) {String str2=ans;
				if(st<n)	{str2="";str2=ans + " " +returnprime(st, arr);}
				ladder(n, returnprime(st, arr),
						ans+" "+returnprime(st, arr) , arr);
			}
		}

	}
}
