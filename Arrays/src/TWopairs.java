import java.util.Scanner;

public class TWopairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
Bubblesort(arr);
		int a = sc.nextInt();
		find(arr,a);

	}

	public static void find(int arr[], int a) {
		int l=0;
	int h=arr.length-1;
	while(l<h)
	{if(arr[l]+arr[h]==a) {System.out.println(arr[l]+" and "+arr[h]);l++;h--;}
	
	else if(arr[l]+arr[h]<a) {l++;}
	else {
		h--;
		
	}
	
	}

			}
	public static void Bubblesort(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}

			}

		}

	}

		
	

}
