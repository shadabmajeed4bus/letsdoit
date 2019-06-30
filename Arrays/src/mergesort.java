
public class mergesort {

	public static void main(String[] args) {
		int arr[] = { 20, 60, 10, 9 };
		int ans[] = mergesort(arr, 0, arr.length - 1);
		for (int val : ans) {
			System.out.println(val);
		}

	}

	public static int[] merge2sorted(int one[], int two[]) {
		int ans[] = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}

		}
		if (i == one.length) {
			while (j < two.length) {
				ans[k] = two[j];
				j++;
				k++;
			}

		}
		if (j == one.length) {
			while (i < one.length) {
				ans[k] = one[i];
				i++;
				k++;
			}

		}
		return ans;

	}

	public static int[] mergesort(int arr[], int lo, int hi) {
		if (lo == hi) {
			int br[] = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int fh[] = mergesort(arr, lo, mid);
		int nh[] = mergesort(arr, mid + 1, hi);
		int sorted[] = merge2sorted(fh, nh);
		return sorted;

	}

}
