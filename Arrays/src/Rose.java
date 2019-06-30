import java.util.*;

public class Rose {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i;
		int b = sc.nextInt();

		for (i = 1; i <= b; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();

			}
Bubblesort(arr);
			int item = sc.nextInt();
			int diff = Integer.MAX_VALUE;
			int ans1 = -1, ans2 = -1;
			for (int k = 0; k < n - 1; k++) {
				for (int j = k + 1; j < n; j++) {
					if (arr[k] + arr[j] == item && (maxof(arr[k], arr[j]) - minof(arr[k], arr[j]) < diff)) {
						diff = maxof(arr[k], arr[j]) - minof(arr[k], arr[j]);
						ans1 = arr[k];
						ans2 = arr[j];
					}
				}

			}
			System.out.println("Deepak should buy roses whose prices are " + ans1 + " and " + ans2 + ".");

		}

	}

	public static void Bubblesort(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static int maxof(int a, int b) {
		if (a > b)
			return a;
		else
			return b;

	}

	public static int minof(int a, int b) {
		if (a < b)
			return a;
		else
			return b;

	}
}
