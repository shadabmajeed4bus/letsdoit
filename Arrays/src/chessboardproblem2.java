import java.util.Scanner;

public class chessboardproblem2 {
	static Scanner sc = new Scanner(System.in);
	static int count = 0;
	static int count1 = 0;

	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int t = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = t;
				t++;
			}

		}

		for (int i = 1; i < n * n; i++) {
			if (isPrime(i)) {
				count1++;
			}
		}
		int brr[] = new int[count1];
		int k = 0;
		for (int i = 1; i < n * n; i++) {
			if (isPrime(i)) {
				brr[k] = i;k++;
			}
		}
		chessboard(n - 1, n - 1, 0, 0, "{0-0}",arr,brr);
		System.out.println("\n" + count);
	
	}

	public static void chessboard(int er, int ec, int sr, int sc, String ans,int arr[][],int brr[]) {
		if (sr == er && sc == ec) {
			count++;
			System.out.print(ans + " ");
			return;
		}
		if (sc >= ec + 1) {
			return;
		}
		if (sr >= er + 1) {
			return;
		}
		if (isPrime(returnvalue(arr, sr, sc))) {
			int s=isport(brr,returnvalue(arr, sr, sc));
			if(s%2!=0) {return;}
			else {chessboard(er, ec,er, ec , ans + "P" + "{" + er + "-" + ec + "}",arr,brr);}
			
		}

		chessboard(er, ec, sr + 2, sc + 1, ans + "K" + "{" + (sr + 2) + "-" + (sc + 1) + "}",arr,brr);
		chessboard(er, ec, sr + 1, sc + 2, ans + "K" + "{" + (sr + 1) + "-" + (sc + 2) + "}",arr,brr);

		if (sr == 0 || sr == ec || sc == 0 || sc == ec) {
			for (int i = 1; i <= ec; i++) {
				chessboard(er, ec, sr, sc + i, ans + "R" + "{" + sr + "-" + (sc + i) + "}",arr,brr);

			}
			for (int i = 1; i <= ec; i++) {
				chessboard(er, ec, sr + i, sc, ans + "R" + "{" + (sr + i) + "-" + sc + "}",arr,brr);
			}

		}
		if (sr == sc || sr + sc == er) {

			for (int i = 1; i <= er; i++) {
				chessboard(er, ec, sr + i, sc + i, ans + "B" + "{" + (sr + i) + "-" + (sc + i) + "}",arr,brr);

			}

		}

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int factors = 0, i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				factors++;
		}

		if (factors == 2)
			return true;
		else
			return false;
	}

	public static int returnvalue(int arr[][], int i, int j)

	{
		return arr[i][j];
	}

	public static int isport(int brr[], int item) {
		for (int i = 0; i < brr.length; i++) {
			if (brr[i] == item) {
				return i + 1;
			}
		}
		return -1;
	}

}
