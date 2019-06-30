
public class Quicksort {

	public static void main(String[] args) {
		int arr[] = { 20, 60, 4, 1, 88, 5 };

		quicksort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static void quicksort(int arr[], int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (hi + lo) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}

		}

		quicksort(arr, lo, right);
		quicksort(arr, left, hi);

	}

}
