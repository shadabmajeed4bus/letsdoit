import java.util.*;

public class viveklovesarraygames {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int k = 1; k <= t; k++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum = sum + arr[i];
			}

			System.out.println(split(arr, 0, sum, 0, arr.length - 1));
		}

	}

	public static int split(int arr[], int sum, int total, int idxs, int idxl) {
		if (sum == total) {

			int left = split(arr, 0, sum, 0, idxs - 1);
			int right = split(arr, 0, sum, idxs, arr.length - 1);
			return Math.max(left, right) + 1;
		}
		if (sum > total || idxs > idxl) {
			return 0;
		}
		return split(arr, sum + arr[idxs], total - arr[idxs], idxs + 1, idxl);

	}

}
