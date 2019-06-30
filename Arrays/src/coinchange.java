
public class coinchange {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
coinchange(0,arr,10,"",0);
	}

	public static void coinchange(int st, int arr[], int amt, String ans, int j) {
		if (st == amt) {
			System.out.println(ans);
		}
		if (st > amt) {
			return;
		}
		int i = 0;

		for (i = j; i < arr.length; i++) {
			coinchange(st + arr[i], arr, amt, ans + arr[i], i);
		}

	}

}
